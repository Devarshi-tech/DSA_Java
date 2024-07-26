import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("hllow");

        func(1,2,3,4,5,5);
    }

    public static void func(int ...v){
        System.out.println(Arrays.toString(v));
    }
}