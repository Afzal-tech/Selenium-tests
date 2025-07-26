package arrays;

import java.util.HashSet;
import java.util.Set;

////Given a string s, find the length of the longest substring without repeating characters.
//        Return an integer representing the length of the longest such substring.
//        You must solve this using an efficient algorithm — ideally in O(n) time.
public class Dlongest_non_repeating_substring {
    public static int  longest_sub() {
      // String str = "kabcdafghi";//
       String  str = "abcda";
        Set<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxlen = 0;
       // for (int i = 0; i < str.length(); i++)
        while(right<str.length()){
            if (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            } else {
                set.add(str.charAt(right));
                maxlen = Math.max(maxlen, right - left +1);
                right++;


            }

        }
        System.out.println(str.substring(left, right ));
         return maxlen;


    }
    public  static void main(String[] args){
        int max= longest_sub();
        System.out.println(max);
    }
}
