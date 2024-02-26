public class Q15_SearchIn2DArray {
    
    public static void main(String[] args) {
        
        int[][] arr = {
            {24,5,1},
            {18,12,4,9},
            {78,99,34,56},
            {18,12}
        };
        int target = 99;
        // search in 2D array
        System.out.println(search(arr,target));
    };

    static String search(int[][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col] == target){
                    return "index: ("+ row +","+ col+")";
                }
            }
        }
        return "no data";
    };
}
