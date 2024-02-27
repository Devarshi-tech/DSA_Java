public class Q22_NextGreatestLetter {
    
    public static void main(String[] args) {
        
        char[] letters = {'a','b','f','j'};
        System.out.println(nextGreatestLetter(letters, 'j'));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        // if (target > letters[letters.length-1]) return -1;
        int start =0;
        int end = letters.length-1;

        while(start <= end){
            int mid = start +(end-start)/2;
            // if(letters[mid] == target){
            //     return letters[mid];
            // }
            // else 
            if(letters[mid] > target){
                end = mid-1;
                
            }else  {
                start = mid+1;
            }
        }
        // if start is length of array 
        // and it will also work for other normal cases
        // if (start == lenth) return 0;
        return letters[start%letters.length];
    }
    }

