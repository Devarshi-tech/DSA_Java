import java.util.Scanner;

public class Q8_ArmStrongNumbers {
    public static void main(String[] args) {
        /**
         * ArmStrong Number is
         * a = 153
         *  1^3 + 5^3 + 3^3 = 1+125+27 = 153 
         */
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(isArmStongNumber(i));

    }
    static Boolean isArmStongNumber(Integer num){
        Integer remainder = 0;
        Integer ans=0;
        Integer numOriginal = num;
        while(numOriginal>0){
            remainder = numOriginal%10;
            ans = ans + (remainder*remainder*remainder);
            
            numOriginal = numOriginal/10;
        }
   
        return (Integer.compare(num, ans) == 0);
    }
}
