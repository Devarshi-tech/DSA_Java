public class Q13_SearchInString {
    
    public static void main(String[] args) {
        /**
         * Search in a string for a character
         */

         String name = "devarshi patidar";
         char target = ' ';

         System.out.println(searchInString(name,target));
    }

    static int searchInString(String name,char target){

        for(int i=0;i<name.length();i++){
            if(name.charAt(i) == target){
                return i;
            }
        }
        return -1;

    }
}
