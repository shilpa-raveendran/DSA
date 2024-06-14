public class ProductOfArrayExceptSelf {
// LC :238. Product of Array Except Self
//    Example 1:
//    Input: nums = [1,2,3,4]
//    Output: [24,12,8,6]

//    Example 2:
//    Input: nums = [-1,1,0,-3,3]
//    Output: [0,0,9,0,0]
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        //int[] nums={-1,1,0,-3,3};
        productExceptSelf(nums);
    }
    public static int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] result = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];
        left[0]=1;
        right[n-1]=1;
        //left product array
        for (int i = 1; i < n; i++) {
            left[i]= left[i-1] * nums[i-1];
        }

        //righ product array
        for (int i = n-2; i >= 0; i--) {
            right[i]= right[i+1] * nums[i+1];
        }
        for (int i = 0; i < n; i++) {
            result[i] = left[i] * right[i];
        }
        return result;
    }
}
