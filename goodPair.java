/*
Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.
*/
package DSA;

public class goodPair {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        int output = numIdenticalPairs(nums);
        System.out.println(output);
    }
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; i < j && j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    count += 1;
                }
            }
        }
        return count;
    }
}