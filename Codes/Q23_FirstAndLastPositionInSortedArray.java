import java.util.Arrays;

public class Q23_FirstAndLastPositionInSortedArray {
    
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,8,8,56};
        System.out.println(Arrays.toString(search(arr, 8)));
    }

    static int[] search(int[] arr,int target){
        int[] ans = {-1,-1};

        int start = search1(arr, target,true);
        int end = search1(arr, target,false);

        ans[0] =start;
        ans[1]= end;
        return ans;
    }

    // this fuction just returns the index value of target
    static int search1(int[] arr,int target,boolean findStartIndex){
        int ans = -1;
         // check for first occu
         int start =0;
         int end = arr.length-1;//5
 
         while (start <= end){
             int mid = start + (end - start)/2; // mid=2, 4
 
             if(arr[mid] == target){
                ans = mid; // mid=4,3
                // System.out.println(ans + " " + findStartIndex);
                
                if(findStartIndex) end = mid -1; // end = 4
                 else start = mid + 1;
             }
             else if(arr[mid] > target){
                 end = mid -1;
             }
             else if(arr[mid] < target){
                 start = mid +1; // start =3
             }
         }
 
         return ans;
    }
}
