package SlidingWindowPatterns;

import java.util.HashMap;
import java.util.Map;

public class MinSubstringLength {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";


        if(t.isEmpty()){
            System.out.println("");
            return;
        }

        Map<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            Character c = t.charAt(i);
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }
        int need = tMap.size();

        int have = 0;
        int left = 0;
        int[] res = {-1, -1};
        int minSubstringLength = Integer.MAX_VALUE;
        Map<Character, Integer> sMap = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            Character sChar = s.charAt(right);
            sMap.put(sChar, sMap.getOrDefault(sChar, 0) + 1);

            if(
                    tMap.containsKey(sChar) &&
                    sMap.get(sChar).equals(tMap.get(sChar))
            ){
                have++;
            }

            while (have == need){
                if((right - left + 1) < minSubstringLength){
                    res = new int[] {left, right};
                    minSubstringLength = right - left + 1;
                }

                sMap.put(s.charAt(left), sMap.get(s.charAt(left)) - 1);

                if(tMap.containsKey(s.charAt(left)) &&
                        sMap.get(s.charAt(left)) < tMap.get(s.charAt(left))){
                            have--;
                }
                left++;

            }
        }
        if(minSubstringLength != Integer.MAX_VALUE){
            System.out.println("Minimum Substring: " + s.substring(res[0], res[1] + 1));
            return;
        }
        System.out.println("");
    }
}
