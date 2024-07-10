import java.util.HashMap;

public class MaxPairSum {
    public static void main(String[] args) {
        //int[] nums={112,131,411};
        //int[] nums={2536,1613,3366,162};
       int[] nums={51,71,17,24,42};
        System.out.println(maxSum(nums));
    }
        public static int maxSum(int[] nums) {

            //brute force
            //int maxSum= bruteForceMethod(nums);

            return optimalSolution(nums);


        }
        public static int findMaxDigit(int n){
            int max = 0;
            while( n > 0){
                if(n % 10 > max){
                    max = n % 10;
                }
                n = n /10;
            }
            return max;
        }

    //brute force--> o(n2)
    // find the max element of each nos by iterating in loop
    // after find max ; find the largest and second nos which has max in it
    // if two pairs has same maxDigit
    // find the sum of the pairs
    public static int bruteForceMethod(int[] nums){
        int maxDigit=-1;
        for(int i = 0 ; i < nums.length ; i++){
            for(int j =i+1 ; j < nums.length ; j++ ){
                if(findMaxDigit(nums[i]) == findMaxDigit(nums[j])){
                    maxDigit= Math.max(maxDigit,nums[i]+nums[j]);
                }
            }
        }
        return maxDigit;
    }

    //optimal solution o(n)
    //using hash table
    public static int optimalSolution(int[] nums){
        int maxPairSum=-1;
        HashMap<Integer, Integer> map= new HashMap<>();
        for (int num : nums) {
            int maxDigit = findMaxDigit(num);
            if (map.containsKey(maxDigit)) {
                maxPairSum = Math.max(maxPairSum, map.get(maxDigit) + num);
                map.put(maxDigit, Math.max(map.get(maxDigit), num));
            } else {
                map.put(maxDigit, num);
            }
        }
        return maxPairSum;
    }
}
