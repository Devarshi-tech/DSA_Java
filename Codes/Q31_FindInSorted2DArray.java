import java.util.Arrays;

public class Q31_FindInSorted2DArray {

    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int target = 8;
        System.out.println(Arrays.toString(binarySearch(arr, target)));
    }

    // search in the row provided between the cols provided
    static int[] simpleBS(int[][] arr, int row, int colStart, int colEnd, int target) {
        while (colStart < colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;

            if (arr[row][mid] == target) {
                return new int[] { row, mid };
            } else if (arr[row][mid] > target) {
                colEnd = mid - 1;
            } else {
                colStart = mid + 1;
            }
        }
        return new int[] { -1, -1 };
    }

    static int[] binarySearch(int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0].length; // be cautious, matrix may be empty

        if (rows == 1) {
            return simpleBS(arr, 0, 0, cols - 1, target);
        }
        // run the loop till 2 rows are remaining
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;
        while (rStart < rEnd - 1) {// while this is true it will have more than 2 rows
            int mid = rStart + (rEnd - rStart) / 2;

            if (arr[mid][cMid] == target) {
                return new int[] { mid, cMid };
            } else if (arr[mid][cMid] < target)
                rStart = mid;
            else
                rEnd = mid;
        }
        // int[][] arr = {
        //     {5,6,7,8},
        //     {9,10,11,12}
        // };
        // int target = 8;
        // now we have two rows
        // check whether target is in the column of two rows
        if (arr[rStart][cMid] == target) {
            return new int[] { rStart, cMid };
        }
        if (arr[rStart + 1][cMid] == target) {
            return new int[] { rStart + 1, cMid };
        }

        // search in 1st half
        if(target <= arr[rStart][cMid-1]) return simpleBS(arr, rStart, 0, cMid-1, target);
        // search in 2nd half
        if(target >= arr[rStart][cMid+1] && target <= arr[rStart][cols-1]) return simpleBS(arr, rStart, cMid+1, cols-1, target);
        // search in 3rd half
        if(target <= arr[rStart+1][cMid-1]) return simpleBS(arr, rStart+1, 0, cMid-1, target);
        // search in 4th half
        else return simpleBS(arr, rStart+1, cMid+1, cols-1, target);
    }

}
