package InterviewPrep;

public class LongestSubstring {
    public static void main(String[] args) {
        String str = "Dheeraj";
        int longestSubstring = lengthOfLongestSubstring(str);
        System.out.println(longestSubstring);
    }

    /*
    Question: Given a string s, find the length of the longest substring without repeating characters.
    */

    /*
    Solution:
    * Using a sliding window approach, we expand the right boundary of our
      window until we encounter a repeating character.
    * Then, we contract the left boundary until there are no duplicates in the window.
    */

    /*
    * Time Complexity: O(n)
        - Each character is processed at most twice: once when expanding the window with right and possibly once,
          when shrinking the window with left.
    * Space Complexity: O(1)
        - The chars array is fixed in size (128), regardless of the input size.
    */

    public static int lengthOfLongestSubstring(String s) {
        int[] chars = new int[128]; // There are 128 ASCII characters
        int left = 0, right = 0;
        int res = 0;
        while (right < s.length()) {
            char r = s.charAt(right);
            chars[r]++;

            while (chars[r] > 1) {
                char l = s.charAt(left);
                chars[l]--;
                left++;
            }

            res = Math.max(res, right - left + 1);
            right++;
        }
        return res;
    }
}
