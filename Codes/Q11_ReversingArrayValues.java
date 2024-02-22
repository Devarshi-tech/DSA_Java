import java.util.Arrays;

public class Q11_ReversingArrayValues {
    public static void main(String[] args) {
        int[] arr = {23,123,534,5434,86,121212};

        System.out.println(Arrays.toString(reversedArray(arr)));
    }

    public static int[] reversedArray(int[] arr){
        int[] reveredArr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            reveredArr[i] = arr[arr.length-i-1];
        }
        return reveredArr;
    }
}
