public class Q16_MaxValueIn2DArray {
    
    public static void main(String[] args) {
        
        int[][] arr = {
            {24,675,1},
            {18,12,4,9},
            {78,99,34,56},
            {18,12}
        };

        System.out.println(maxValue(arr));
    };

    static int maxValue(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++)
            {
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
