import java.util.Arrays;

public class Q18_SingleNumber {
    
    public static void main(String[] args) {
         int [] nums = {4,3,4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
       
        for(int i=0;i<nums.length;i++){
            
            for(int j=1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    // return nums[i];
                }

            }
        }
        return -1;
    }
}
