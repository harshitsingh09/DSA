package DSA;

public class sentencePangram {
    public boolean checkIfPangram(String sentence) {
        int[] arr = new int[26];
        
        // checks the frequency of the alphabets
        for(var i: sentence.toCharArray()){
            arr[i - 'a']++;
        }
        
        // checks if any of the arr index contains zero
        for(var i: arr){
            if(i == 0)
                return false;
        }
        
        return true;
    }
}
