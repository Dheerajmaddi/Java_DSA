package SlidingWindowPatterns;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringLength {
    public static void main(String[] args) {
        String str = "abcabcdbd";

        int left = 0, right = 0, maxSubstringLength = 0;
        Set<Character> slidingWindow = new HashSet<>();

        while(right < str.length()){
            if(slidingWindow.contains(str.charAt(right))){
                slidingWindow.remove(str.charAt(right));
                left++;
            }

            slidingWindow.add(str.charAt(right));
            maxSubstringLength = Math.max(maxSubstringLength, right - left + 1);
            right++;
        }

        System.out.println("Substring length: " + maxSubstringLength);
    }
}
