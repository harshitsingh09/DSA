package DSA;
import java.util.Arrays;

public class concatenationArrays {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
    public static int[] getConcatenation(int[] nums) {
        int [] ans = new int [2*nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
        }
        for (int i = nums.length; i < ans.length; i++) {
            ans[i] = nums[i-nums.length];
        }
        return ans;
    }
}