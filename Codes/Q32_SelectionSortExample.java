import java.util.Arrays;

public class Q32_SelectionSortExample {
    public static void main(String[] args) {
        int[] arr = {4,5,3,6,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            // find the max item in the remaining array and swap with correct index
            int last = arr.length -i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            // System.out.println(arr[maxIndex]);
            swapArray(arr, maxIndex, last);
        }
    }

    static int getMaxIndex(int[] arr,int start,int last){
        int max = start;
        for(int i=start;i<=last;i++){
            if(arr[max]<arr[i]){
                // System.out.println(arr[max]);
                max = i;
            }
        }
        return max;
    }

    static void swapArray(int[] arr,int first,int second){
        int temp = arr[first];
         arr[first] = arr[second];
         arr[second] = temp;
    }
}
