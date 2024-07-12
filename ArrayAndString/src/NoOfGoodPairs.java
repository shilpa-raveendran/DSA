import java.util.HashMap;
import java.util.Map;

/*
* 1512. Number of Good Pairs
Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.
* */
public class NoOfGoodPairs {
    public static void main(String[] args) {
        int[] nums={1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }
    public static int numIdenticalPairs(int[] nums) {
        int count=0;
        // for (int i = 0; i <nums.length ; i++){
        //     for(int j = i+1; j<nums.length ; j++){
        //         if(nums[i] == nums[j] && i < j){
        //             count++;
        //         }
        //     }
        // }

        //Using Hash table
        Map<Integer, Integer> map= new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                count += map.get(num);
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        return count;
    }
}
