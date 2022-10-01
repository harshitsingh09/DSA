package DSA;

public class maximum {
    public static void main(String[] args) {
        int [] arr = {1, 23, 78, 9, 18};
        int maxValue = max(arr);
        System.out.println("The maximum value is: " +maxValue);
    }
    static int max(int [] arr){
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];                
            }
        }
        return maxVal;
    }
}