public class Q26_SearchInMountainArray {
    
    public static void main(String[] args) {

        int[] arr= {1,5,2};
        int target = 2;
        int ans = searchAsc(arr, target,0,peakElement(arr));
        if(ans == -1){
            ans = searchDesc(arr, target,peakElement(arr),arr.length-1);
            System.out.println(ans);
        }else System.out.println(ans);
    }

    static int peakElement(int[] arr){

        int start =0;
        int end = arr.length-1;

        while (start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else start = mid +1;
        }

        return end;
    }

    static int searchAsc(int[] arr, int target,int start,int end){

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

    static int searchDesc(int[] arr, int target,int start,int end){

        while (start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                end = mid -1;
            }
            else if(arr[mid] > target){
                start = mid +1;
            }
        }

        return -1;
    }
}
