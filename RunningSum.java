public class RunningSum {
    public static void main(String[] args) {

    }

    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] + result[i - 1];
        }
        return result;
    }
}
