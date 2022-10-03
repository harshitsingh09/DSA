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