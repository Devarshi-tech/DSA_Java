public class Q29_SplicArrayLargestSum {
    
    public static void main(String[] args) {
        int[] arr={7,2,5,10,8};
        System.out.println(splitArray(arr, 2));
    }

    static int splitArray(int[] arr,int k){
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            // int the end of loop this will contain the max item from the array
            start = Math.max(start, arr[i]);

            end= end + arr[i];
            // System.out.println( start + " " + end); 
        }
        while (start<end) {
            int mid = start + (end-start)/2;

            int sum =0;
            int pieces=1;
            for(int a:arr){
                if(sum+a>mid){
                    // you cannot add this in this subarray, make new one
                    // say you add this sum in new subarray, then sum = arr
                    sum = a;
                    pieces++;
                }else{
                    sum = sum+a;
                }
            }
            if(pieces >k){
                start = mid+1;
            }
            else end= mid;  

        }
        return end;
    }
}
