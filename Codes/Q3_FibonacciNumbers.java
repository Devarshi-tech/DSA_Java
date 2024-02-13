public class Q3_FibonacciNumbers {
    public static void main(String[] args) {
        
        System.out.println(0);
        int a = 0;
        int b = 1;
        for(int i=0;i<10;i++){
            int k = a+b;
            a = b;
            b = k;
            System.out.println(a);
        }
    }
}
