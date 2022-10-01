package DSA;

import java.util.Arrays;

public class runningSum {
    public static void main(String[] args) {
        int [] nums = {2, 3, 6, 10};
        int [] rSum = runningSum(nums);
        //System.out.println("The running Sum array is: " +rSum);
    }
    static int[] runningSum(int[] nums) {
        int [] arr = new int [nums.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (sum += nums[i]);
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
