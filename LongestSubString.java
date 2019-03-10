/**
 * Created by arvind bahl on 11/3/2019.
 *Given a string, find the length of the longest substring without repeating characters.
  Example 1:
  Input: "abcabcbb"
  Output: 3
  Explanation: The answer is "abc", with the length of 3
 */

// Following code uses hashmap to keep a track of last seen of character and index
// Time complexity O(n) and space complexity O(min(m,n))

import java.util.HashMap;

public class LongestSubString {

    public static void main(String args[]){

        int max1 =0;
        int start = 0;
        String s = "abcabcbb";
        //String s = "abba";

        HashMap<Character, Integer> mymap = new HashMap<Character, Integer>();

        for(int j =0; j<s.length(); j++){

            if (mymap.containsKey(s.charAt(j)) && start <= mymap.get(s.charAt(j))){

              start =   mymap.get(s.charAt(j)) +1;
              mymap.put(s.charAt(j), j);
            }
            else {
                mymap.put(s.charAt(j), j);
            }

            max1 = Math.max(max1, j- start +1);
        }

        System.out.println("The longest substring is of size = " + max1);

    }
}
