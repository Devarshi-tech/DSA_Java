public class Q14_MinimumNumber {
    
    public static void main(String[] args) {
        
        /**
         * Minimum number from an array
         * 
         */
        int[] arr = {434,54,634,134,67,1,314};
        System.out.println(arr.length>0?minValue(arr):
        -1);
    }

    static int minValue(int[] arr){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
