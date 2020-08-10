/* HARD Problem:
Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).

Example:

Input: S = "ADOBECODEBANC", T = "ABC"
Output: "BANC"

*/

class Solution {
    public String minWindow(String s, String t) {
        if(s.length() == 0 || t.length() == 0){
            return "";
        }
        
        Map<Character, Integer> dictT = new HashMap();
        //Create a frequency map of all characters in t
        for(char c : t.toCharArray()){
            dictT.put(c, dictT.getOrDefault(c, 0) +1 );
        }
        
        int required = dictT.size();
        
        int windowStart= 0;
        //ans format = { windowSize, startIndex, endIndex}
        int[] ans = new int[] { -1, 0, 0};
        int formed = 0;
        Map<Character, Integer> map = new HashMap();
        for(int windowEnd = 0;windowEnd < s.length();windowEnd++){
            char rightChar = s.charAt(windowEnd);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
            
            if(dictT.containsKey(rightChar) && map.get(rightChar).intValue() == dictT.get(rightChar).intValue()){
                formed++;
            }
            
            while( windowStart <= windowEnd && formed == required){
                char c = s.charAt(windowStart);
                //Check for a smaller window than previously found
                if(ans[0] == -1 || windowEnd - windowStart + 1 < ans[0]){
                    ans[0] = windowEnd - windowStart + 1;
                    ans[1] = windowStart;
                    ans[2] = windowEnd;
                }
                //Remove the left most character and check to see if it changes formed, remember the conditions for incrementing formed
                map.put(c, map.get(c) - 1);
                if(dictT.containsKey(c) && map.get(c).intValue() < dictT.get(c).intValue()){
                    formed--;
                }
                windowStart++;
            }
        }
        return ans[0] == -1 ? "" : s.substring(ans[1],ans[2] + 1);
    }
}