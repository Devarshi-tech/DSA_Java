public class Q25_PeakIndexInMountainArray {
    
    public static void main(String[] args) {
        /**
         * find peak element in bitonic array
         */
        int[] arr= {3,5,3,2,0};
        System.out.println(search(arr));
    }

    static int search(int[] arr){
        int start =0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end - start)/2;

            // if(arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1]){
                
            // }
            //  if(arr[mid-1] > arr[mid]){
            //     end = mid -1;
            // }
           if(arr[mid] < arr[mid+1]){
                start = mid +1;
            }else{
                end = mid-1;
                // return arr[mid];
            }
        }

        return start;
    }
}
