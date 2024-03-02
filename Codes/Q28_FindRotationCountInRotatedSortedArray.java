public class Q28_FindRotationCountInRotatedSortedArray {
    
    public static void main(String[] args) {
        
        int[] arr = {1,2,4,6,7,9};
        System.out.print("Array is rotated: ");
        System.out.print(findPivot(arr)+1);
        System.out.println(" Times");
    }

    static int findPivot(int[] arr){
        int start =0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            else if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
               
            }
            else if(arr[mid] <= arr[start]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        return -1;
    }


}
