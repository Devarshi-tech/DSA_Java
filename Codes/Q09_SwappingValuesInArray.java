import java.util.Arrays;

public class Q9_SwappingValuesInArray {
    
    public static void main(String[] args) {
        
        int[] arr = {23,123,534,5434,86};
        swap(arr,1,4);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr,int index1,int index2){
        int tempIndex2 = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tempIndex2;
    }
}
