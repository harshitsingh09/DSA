/*
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].
*/
package DSA;
import java.util.Arrays;

public class shuffle {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = nums.length/2;
        int[] fin = shuf(nums, n);
        System.out.println(Arrays.toString(fin));
    }
    public static int[] shuf(int[] nums, int n) {
        int[] test = new int[nums.length];
        for (int i = 0; i < n; i++) {
            test[2*i] = nums[i];
            test[2*i+1] = nums[n + i];
        }
        return test;
    }
}