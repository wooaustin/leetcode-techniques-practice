# When should I use sliding window?
Some indicators that you should be using sliding window for interview problem

- If the problem presented involves finding some information from an array/string
- The target is to find a range of items
- Keywords: Longest/Shortest, Maximum/Minimum values for a given range in array/string

# What is the skeleton for sliding window?
- Sliding window is an adaptation of the two pointer technique
- Declaring a starting point of your window
- Declare any counter/variable that keeps track of some maximum/minimum value

Skeleton:


- Declare windowStart
- Declare any variables you might need to solve the problem/return an answer

- Declare a for loop with int windowEnd = 0 as your starting point 
- Add arr[windowEnd] to your result variables
TWO SITUATIONS
SITUATION 1 : If you are given a window size K as a paramter
Conditional if your window size(windowEnd - windowStart + 1) is greater than K, then shrink your window by windowStart+1 and remove arr[windowStart] from result variable

SITUATION 2 : If you arent given a window size K 
Most likely the problem is asking for the smallest range of values within the array/string that equals some conditional, so insert a while loop here with that conditional. Inside that conditional you should be shrinking your window by windowStart+1 at each iteration of the while loop, removing arr[windowStart] from result variables, and continue

BOTH SITUATIONS
Will require some type of comparison with this step vs every other step in your window expansion/shrinking, so a Math.max/min is required here
 result = Math.max/min(result, THIS STEP IN YOUR ALG)

return result
