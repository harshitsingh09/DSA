package DSA;
import java.util.Arrays;

public class deleteNode {
    public static void main(String[] args) {
        int[] a = {4,5,1,9};
        int n = 1;
        int[] ans = outp(a, n);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] outp(int[] a, int n) {
        int[] arr = new int[a.length - 1];
        for (int i = 0; i < a.length; i++) {
            if (a[i] != n){
                for (int j = i; j < i + 1; j++) {
                    arr[j] = a[i];
                    System.out.println(Arrays.toString(arr));
                }
            }
            else{
                continue;
            }
        }
        return arr;
    }
}
