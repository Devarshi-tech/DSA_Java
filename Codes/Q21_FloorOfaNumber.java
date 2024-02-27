public class Q21_FloorOfaNumber {
    
    public static void main(String[] args) {
        /**
         * arr = {2,3,5,9,14,16,18}
         * target = 15
         * Floor -> greatest element in array 
         *            smaller or equal to target
         */
        int [] arr = {2,3,5,9,14,16,18};
        // System.out.println(searchLS(arr,18));
        System.out.println(searchBS(arr,0));
    }
     // Binary search
     static int searchBS(int[] arr,int target){
        // if target is greater than largest number in arrya
        if (target < arr[0]) return -1;

        int start =0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start +(end-start)/2;
            if(arr[mid] == target){
                return arr[mid];
            }
            else if(arr[mid] > target){
                end = mid-1;
                
            }else if (arr[mid] < target) {
                start = mid+1;
            }
        }
        // start>end to end while loop
        return arr[end];
    }
}
