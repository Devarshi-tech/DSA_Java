public class Q19_BinarySearch {
    
    public static void main(String[] args) {
        int[] arr = {2,3,5,13,25,56,64,112,145,176};

        System.out.println(binarySearch(arr, 64));
    }

    static int binarySearch(int[] arr, int target){

        int start =0;
        int end = arr.length-1;

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
