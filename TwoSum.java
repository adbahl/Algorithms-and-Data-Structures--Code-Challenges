/**
 * Created by arvind on 12/3/2019.
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */

// The following solution uses HashMap.
// Time complexity is O(n) and Space Complexity O(n)
import java.util.HashMap;

public class TwoSum {

    public static void main(String args[]) {
        int nums[] = {2, 7, 9, 11, 15};
        int target = 9;
        int complement;

        HashMap<Integer, Integer> rmap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {

            complement = target - nums[i];
            if (rmap.containsKey(complement)){
                System.out.println(rmap.get(complement)+ "," + i );
            }

            else{
                rmap.put(nums[i], i);
            }


        }

    }
}
