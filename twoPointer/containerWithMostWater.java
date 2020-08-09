/* MEDIUM Problem: 
Given n non-negative integers, where each represent a point at coordinates (i, ai). N vertical
lines are drawn such that the two endpoints of line i is at (i,ai) and (i,0). Find two lines, which together with x-axis
forms a container, such taht the container contains the most water */

class Solution{
    public int maxArea(int[] height){
        int left = 0, right = height.length -1;
        int maxWater = 0;
        while(left < right){
            int lowerBound = Math.min(height[left], height[right]);
            int water = lowerBound * (right - left);
            maxWater = Math.max(maxWater, water);
            if(height[left] > height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxWater;
    }
}

/* Time Complexity: O(N), since we only go through the heigh array once, visiting each spot with left/right pointers
   Space Complexity: O(1), since we do all the calculations without additional data structures and analyze elements in place
 */