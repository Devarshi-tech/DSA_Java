import java.util.Arrays;

public class Q33_SelectionSortExample {

    public static void main(String[] args) {

        UtilityClass utilityClass = new UtilityClass();

        selectionSort(utilityClass.generateRandomNumbersArray(15));

        System.out.println(Arrays.toString(utilityClass.generateRandomNumbersArray(15)));
    }

    public static void selectionSort(int[] v) {

        int[] arr = v;

        


        System.out.println(arr);

    }
}
