import java.util.ArrayList;

public class Q17_EvenDigits {
    
    public static void main(String[] args) {
        
        // count the numbers with even digits

        int[] arr = {12,01,2311,16,7890,15};
        System.out.println(search(arr));
    };

    static int search(int[]arr){
        ArrayList<Integer> countedDigits = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            int digit = arr[i];
            int tempEventDigit =0;
            while(digit>0){
                tempEventDigit ++;
                digit = digit/10;
            }
            countedDigits.add(tempEventDigit);
        }
        int evenDigits = 0;
        for(Integer countEven:countedDigits){
            if(countEven%2==0){
                evenDigits ++;
            }
        }
        return evenDigits;
    }
}
