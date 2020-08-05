class Solution{

    /* MEDIUM  Given a string, find the length of the longest substring in it with no more than K distinct characters.
        Input: String="araaci", K=2
        Output: 4
        Explanation: The longest substring with no more than '2' distinct characters is "araa". */

    public int longestSubstringWithKDistinct(String str, int K){
        int windowStart = 0, maxLength = 0;
        Map<Character, Integer> map = new HashMap();

        for(int windowEnd = 0;windowEnd<str.length();windowEnd++){
            char rightChar = str.charAt(windowEnd);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);

            if(map.size() > K){
                char leftChar = str.charAt(windowStart);
                windowStart++;
                map.put(leftChar, map.get(leftChar)-1);
                if(map.get(leftChar) == 0){
                    map.remove(leftChar);
                }
            }

            maxLength = Math.max(maxLength, windowEnd - windowStart +1);
        }
        return maxLength;
    }
}