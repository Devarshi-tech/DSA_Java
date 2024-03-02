public class Q27_SearchInRotatedSortedArray {
    
    public static void main(String[] args) {
        
        int[] arr = {12,34,35,1,2,4,6,7,9};
        System.out.println(search(arr, 9));

    }

    static int findPivot(int[] arr){
        int start=0;
        int end = arr.length-1;

        while(start<=end){
            int mid= start +(end-start)/2;
            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid > start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(arr[mid]<=arr[start]){
                end = mid-1;
            }
            else{
                start = mid +1;
            }
        }
        return -1;
    }

    public static int search(int[] arr,int target){

        int pivotPoint = findPivot(arr);
      
        if(pivotPoint == -1){
            return binarySearch(arr, target,0,arr.length-1);
        }
        else if(arr[pivotPoint] == target) return pivotPoint;
        if (target >= arr[0]){
            return binarySearch(arr, target, 0, pivotPoint-1);
            
            
        }
        return binarySearch(arr, target, pivotPoint+1, arr.length-1);
    }

    static int binarySearch(int[] arr, int target,int start,int end){

       
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


    static int findPivotWithDuplicates(int[] arr){
        int start=0;
        int end = arr.length-1;

        while(start<=end){
            int mid= start +(end-start)/2;
            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid > start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            // else if(arr[mid]<=arr[start]){
            //     end = mid-1;
            // }
            // else{
            //     start = mid +1;
            // }

            // if elements at middle, start, end are equal then just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                // skip the duplicates

                //Note what if these elements at start and end were the pivot??
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start ++;
                // check whether end is pivot
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start]<arr[mid] || (arr[start] == arr[mid] && arr[end]<arr[mid])){
                start = mid+1;
            }
            else end = mid-1;
        }
        return -1;
    }

}
