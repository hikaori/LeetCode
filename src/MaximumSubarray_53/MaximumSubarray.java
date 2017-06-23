package MaximumSubarray_53;

/**
 * Created by kaorihirata on 2017-06-20.
 */
public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(nums.length);
//        maxSubArray(nums);
    }

    public static int maxSubArray(int[] nums) {
        int curr_max = 0;
        for (int i = nums.length; i > 0; i--) {
            for (int j = 0; j < nums.length - i + 1; j++) { // until to hit the point which same combination of previous
                if (curr_max < getSum(nums, j, i + j)) {
                    curr_max = getSum(nums, j, i + j);
                }
            }
        }
        return curr_max;
    }

    public static int getSum(int[] nums, int j, int ij) {
        int sum = 0;
        for (int i = j; i < ij; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
