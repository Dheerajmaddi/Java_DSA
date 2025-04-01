package SlidingWindowPatterns;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringLength {
    public static void main(String[] args) {
        String str = "abcabcdbd";

        int left = 0, right = 0, maxSubstringLength = 0;
        Set<Character> slidingWindow = new HashSet<>();
        // Using HashSet
        while(right < str.length()){
            if(slidingWindow.contains(str.charAt(right))){
                slidingWindow.remove(str.charAt(right));
                left++;
            }

            slidingWindow.add(str.charAt(right));
            maxSubstringLength = Math.max(maxSubstringLength, right - left + 1);
            right++;
        }

        System.out.println("HashSet approach for Max Substring length: " + maxSubstringLength);

        left = 0;
        right = 0;
        maxSubstringLength = 0;
        Map<Character, Integer> slidingWindowMap = new HashMap<>();

        while(right < str.length()){

            if(slidingWindowMap.containsKey(str.charAt(right))){
                left = slidingWindowMap.get(str.charAt(right)) + 1;
            }

            slidingWindowMap.put(str.charAt(right), right);
            maxSubstringLength = Math.max(maxSubstringLength, right - left + 1);
            right++;
        }
        System.out.println("HashMap approach for Max Substring length: " + maxSubstringLength);
    }
}
