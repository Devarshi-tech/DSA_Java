public class Q1_LargestNumber {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int c = 306;

        if(b>a){
            if(b>c){
                System.out.println(b + " is Max");
            }
            else{
                System.out.println(c + " is Max");
            }
        }
        else{
            System.out.println(a + " is Max");
        }

        System.out.println(Math.max(a, b));
    }
}
