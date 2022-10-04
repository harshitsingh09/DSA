package DSA;
import java.util.Arrays;

public class extraCandy {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        boolean[] output = kidsWithCandies(candies, extraCandies);
        System.out.println(Arrays.toString(output));
    }

    public static boolean[] kidsWithCandies(int[] candies, int extraCandies) {
        boolean[] result = new boolean [candies.length];
        for (int i = 0; i < result.length; i++) {
            int temp = candies[i] + extraCandies;
            for (int j = 0; j < result.length; j++) {
                if(temp > candies[j]){
                    result[i] = true;
                }
                else{
                    result[i] = false;
                    break;
                }
            }
        }
        return result;
    }
}