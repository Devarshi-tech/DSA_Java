import java.util.Random;

public class UtilityClass {
    
    public int[] generateRandomNumbersArray(int length){
        int[] arr = new int[length];
        Random random = new Random();

        for(int i=0;i<length;i++){
            arr[i] = random.nextInt(length);
        }
        return arr;


    }
}
