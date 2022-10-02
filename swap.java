package DSA;
import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int [] arr = {1, 23, 8, 9, 18};
        exchange(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }
    static void exchange(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}