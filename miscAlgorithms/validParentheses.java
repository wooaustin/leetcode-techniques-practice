/* EASY Problem: 
Given a string containing just the characters '(', ')', '{', '}', '[',']',
determine if the input string is valid

An input string is valid if:
1. Open brackets must be closed by the same type of brackets
2. Open brackets must be closed in the correct order

Example 1: 
Input: "()"
Output: True

Example 2:
Input: "()[]{}"
Output: True

Example 3:
Input: "(]"
Output: False
*/

class Solution{
    private HashMap<Character, Character> mappings;

    public Solution(){
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')', '(');
        this.mappings.put(']', '[');
        this.mappings.put('}', '{');
    }

    public boolean isValid(String s){
        Stack<Character> stack = new Stack();
        for(char c: s.toCharArray()){
            if(this.mappings.containsKey(c)){
                char topElement = stack.empty() ? '#' : stack.pop();
                if(topElement != this.mappings.get(c)){
                    return false;
                }
            }
            else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
