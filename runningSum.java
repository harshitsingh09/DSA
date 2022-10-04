/*
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.
*/
package DSA;
import java.util.Arrays;

public class runningSum {
    public static void main(String[] args) {
        int [] nums = {12, -20, 11, 5};
        int [] arr = new int [nums.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (sum += nums[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}