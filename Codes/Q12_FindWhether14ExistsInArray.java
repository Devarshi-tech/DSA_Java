import java.util.ArrayList;

public class Q12_FindWhether14ExistsInArray {
    public static void main(String[] args) {
        final ArrayList<Integer> arr = new ArrayList<>();
        // [18,12,9,14,77,50];
        arr.add(18);
        arr.add(12);
        arr.add(9);
        arr.add(14);
        arr.add(77);
        arr.add(50);

        System.out.println(findNum(arr,14));
        
    }

    public static Boolean findNum( ArrayList<Integer> arr,Integer num){
        for(Integer i:arr){
            if(i == num){
                return true;
            }
        }
        return false;
    }
}
