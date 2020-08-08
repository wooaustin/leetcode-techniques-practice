# Depth First Search

## When should I use it?
Some keywords that you should be looking out for: root-to-leaf, sum of paths, or anything path specific in a tree

### How does DFS work?
Depth First Search works by exploring a tree all the way down from root to leaf, performing an operation at each depth, and usually some type of conditional check at the leaf node. The order in which it searches depends on 
the ordering of your recursive calls, but I believe the best way to think of it is to just try and identify the case
in which your search ends at a leaf successfully.

### Basic Structure 

Many problems that ask for DFS require some type of information to be shared between function calls, this means
you will usually have to make a helper function to do that actual traversal. Examples of this are found in the included directory


1. You'll have to do a null check almost always
2. Once the null check is complete, you're safe to start accessing the node and perform your operations
3. Then check to see if the node you have is a leaf node
4. If it is not a leaf node, then call the function again recursively for both left and right nodes . 



Depth First Search can have many different forms, but this is how I like to approach it. If you have your own method then please let me know!