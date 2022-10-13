package DSA;

public class highestAltitude {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        int answer = largestAltitude(gain);
        System.out.println(answer);
    }
    public static int largestAltitude(int[] gain) {
        int sum = 0;
        int[] altitude = new int[gain.length+1];
        altitude[0] = 0;     
        for(int i = 0; i < gain.length; i++) {
            sum += gain[i];
            altitude[i+1] = sum;
        }
        int maxAltitude = 0;
        for(int i = 0; i < altitude.length; i++) {
            if(altitude[i] > maxAltitude) {
                maxAltitude = altitude[i];
            }
        }
        if (maxAltitude < 0) {
            return(0);
        }
        return maxAltitude;
    }
}