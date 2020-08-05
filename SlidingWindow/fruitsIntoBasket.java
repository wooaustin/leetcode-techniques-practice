class Solution{
    /* MEDIUM
       Given an array of characters where each character represents a fruit tree, you are given two baskets and your goal is to put maximum number of fruits in each basket.
       The only restriction is that each basket can have only one type of fruit.
       You can start with any tree, but once you have started you can’t skip a tree. 
       You will pick one fruit from each tree until you cannot, i.e., you will stop when you have to pick from a third fruit type.
       Write a function to return the maximum number of fruits in both the baskets. */

    public int fruitsInBasket(char[] fruits){
        int windowStart = 0, maxLength = 0;
        int K = 2;
        Map<Character, Integer> map = new HashMap();
        for(int windowEnd = 0; windowEnd < fruits.length;windowEnd++){
            map.put(fruits[windowEnd], map.getOrDefault(fruits[windowEnd], 0) + 1);
            while(map.size() > K){
                map.put(fruits[windowStart], map.get(fruits[windowStart]) -1);
                if(map.get(fruits[windowStart]) == 0){
                    map.remove(fruits[windowStart]);
                }
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
        
    }
}