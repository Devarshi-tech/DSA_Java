public class Q4_CountingOccurrences {
    public static void main(String[] args) {
        /**
         * Count occurrence of 3 in any number
         */
        
        int num = 133839;
        int count = 0;
        while (num>0) {
            int newNum = num%10;

            num = num/10;
            // System.out.println(newNum);
            if(newNum == 3){
                count++;
            }
        }
        System.out.println(count);
    }
}
