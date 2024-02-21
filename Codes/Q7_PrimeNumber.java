import java.util.Scanner;

public class Q7_PrimeNumber {
    public static void main(String[] args) {
        /**
         * Prime number
         * The number which is divisible by its own or 1
         * 1,2,3,5,7,11 . .. etc
         */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // System.out.println(isPrimeNumber(n));
        System.out.println(isPrimeNumber2(n));

    }

    static Boolean isPrimeNumber(int num){ 
        
        if(num <= 1){
            return false;
        }
        int c=2;
        while(c*c<=num){
            if(num%c==0){
                return false;
            }c++;
        }
        if(c*c>num){
            return true;
        }
        return false;
    }

    static Boolean isPrimeNumber2(Integer num){
        if(num < 4){
            return true;
        }
        Integer c =2;
        while(num>=2*c){
            if(num%c==0){
                return false;
            }
            c++;
        }
        return true;
    }

}
