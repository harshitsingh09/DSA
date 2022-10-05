package DSA;

public class commonPrefix {
    public static void main(String[] args) {
        String [] strs = {"flower", "float", "flight"};
        String[] common = compare(strs);
        System.out.println(common);
    }
    public static String[] compare(String[] strs){
        char[] arr = new char[strs.length];
        String[] prefix = (String[]) arr;
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs[i].length(); j++) {
                // help
            }
        }
        //return 
    }
}