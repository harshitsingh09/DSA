package DSA;
import java.util.Scanner;

public class richestCustomer {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the 'm' and 'n' of m*n matrix: ");
        // int m = sc.nextInt();
        // int n = sc.nextInt();
        // int[][] arr = new int [m][n];
        // arr = array();
        // sc.close();
        int [][] arr = {{1, 3, 4}, {0, 3, 1}, {1, 1, 1}};
        int [] asd = finalArr(arr);
        int maximum = max(asd);
        System.out.println(maximum);
    }
    public static int max(int[] aar){
        int max = 0;
        for (int i = 0; i < aar.length; i++) {
            if(aar[i]>max){
                max = aar[i];
            }
        }
        return max;
    }
    public static int[] finalArr(int [][] arr){
        int[] aar = new int [arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            aar[i] = sum;
        }
        return aar;
    }
}