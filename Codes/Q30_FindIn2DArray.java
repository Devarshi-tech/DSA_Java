import java.util.Arrays;

public class Q30_FindIn2DArray {
    
    public static void main(String[] args) {
        // sorted in row and col wise

        int[][] arr = {
            {10,20,30,40},
            {15,25,35,45},
            {28,38,48,58},
            {33,44,55,66}
        };
        int target = 58;
        System.out.println(Arrays.toString(binarySearch(arr, target)));
    }

    static int[] binarySearch(int[][] arr,int target){
        int row = 0;
        int col = arr.length-1;
        int[] ans = {-1,-1};

        while(row < arr.length && col >=0 ){
            
            if(arr[row][col] == target){
                ans[0] = row;
                ans[1] = col;
                return ans;
            }
            else if(arr[row][col] > target){
                col--;
            }
            else{
                row++;
            }
        }
        return ans;
    }

}
