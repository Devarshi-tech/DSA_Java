import java.util.Arrays;

public class Q10_MaxValueFromArray {
    
    public static void main(String[] args) {
        int[] arr = {23,123,534,5434,86,121212};

        System.out.println(max(arr));
    }

    public static int max(int[] arr){
        int maxValue = 0;
        for(int i=1;i<arr.length;i++){
           
            if(arr[i-1]>arr[i]){
                maxValue = arr[i-1];
            }
            else{
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
