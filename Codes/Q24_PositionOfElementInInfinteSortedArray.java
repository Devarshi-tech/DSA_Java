public class Q24_PositionOfElementInInfinteSortedArray {
    public static void main(String[] args) {
        
        /**
         * infinite long array sorted
         * apply binary search
         */

         int[] arr = {1,2,3,4,5,6,7,8,9,12,13,23,34,45,56,67,78,89};
         int target = 19;
         System.out.println(findinRange(arr, target));
         
         
    }

    static int findinRange(int[] arr,int target){
        int start = 0;
        int end = 1;
        // int ans =0;
         while(target > arr[end]){
                int newstart = end+1;
                end = end+ (end-start+1)*2;
                start = newstart;
            
         }
         return search(arr,target,start,end);
    }

    static int search(int[] arr,int target,int start,int end){
        
        while (start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid -1;
            }
            else if(arr[mid] < target){
                start = mid +1;
            }
        }

        return -1;
    }
}
