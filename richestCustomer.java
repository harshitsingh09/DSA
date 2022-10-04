/*
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. 
Return the wealth that the richest customer has.
A customer's wealth is the amount of money they have in all their bank accounts. 
The richest customer is the customer that has the maximum wealth.
*/
package DSA;

public class richestCustomer {
    public static void main(String[] args) {
        int [][] arr = {{1, 3, 4}, {0, 3, 1}, {1, 1, 1}}; // Input values can be edited or scanner can be used instead
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