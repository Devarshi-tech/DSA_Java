import java.util.Arrays;

public class Q10_MaxValueFromArray {
    
    public static void main(String[] args) {
        int[] arr = {23,123,5777134,5434,86,91992212};

        System.out.println(max(arr));
    }

    public static int max(int[] arr){
        int maxValue = 0;
        
        for(int i=0;i<arr.length;i++){
          
            if(maxValue<arr[i]){
                maxValue = arr[i];
            }
           
        }
        return maxValue;
    }
}
