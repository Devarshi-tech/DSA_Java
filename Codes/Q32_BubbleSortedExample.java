import java.util.Arrays;

public class Q32_BubbleSortedExample {

    public static void main(String[] args) {

        // int[] arr = { 4, 3, 5, 1, 2 };
        int[] arr = {1,2,3,4,5};
        bubbleSort(arr);
    }

    static void bubbleSort(int[] arr) {
        Boolean swapped;
        // int arrL = arr.length;
        for (int i = 0; i < arr.length; i++) {
            swapped = true;
            for(int j=1;j<arr.length-i;j++){
                // swap if the item is smaller than the previous item
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if it is not swapped for 1st loop that means array is sorted so no need to check fro entire loop
            if(!swapped) break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
