package DSA;
import java.util.*;

public class highestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        int answer = largestAltitude(gain);
        System.out.println(answer);
    }
    public static int largestAltitude(int[] gain) {
        int[] arr = new int[gain.length + 1];
        arr[0] = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i + 1] = gain[i] + arr[i];
        }
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}