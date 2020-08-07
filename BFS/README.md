# Breadth First Search Traversal

## When should I use Breadth First Search?
Whenever you encounter a tree or a graph, you should immediately think to how you should traverse the structure to . 
attain the information you want.  

This section covers Breadth First Search, or Level-Order Traversal.  This technique utilizes two aspects of Tree/Graph structures.  

 - Adjacency Lists(children nodes)
 - Depth Hierarchy

 My method of performing breadth first search makes certain assumptions . 
 1. FOR BINARY TREES: Every time the outer loop iterates, we process an entire level in the tree . 
 2. GRAPHS: Every time the outer loop iterates, we process a node and it's adjacency list(children) . 

 Basic Structure:  

Binary Tree
 1. Queue Declaration and initialization, usually with only the root node
 2. While loop, conditional is while the queue is non-empty
 3. Inside the while loop, we will get the number of nodes at this level by looking at the size of the queue
 4. Using this number of nodes, we will use a for loop to iterate over all current elements in the queue
 5. Logic inside this for loop will change per problem, but structurally it should be the same

 Graph
 1. Queue Declaration and initialization, plus a HashMap to check for previously visited nodes
 2. Same while loop, conditional is queue is non empty
 3. Thankfully for graphs, there are no ambiguous number of neighbors,   
 as the structure usually contains references to all neighbors, so just for loop iterate on that
 4. Logic inside this for loop will change just like Binary tree, but structure remains

 Example of Binary Tree: Level Order Traversal . 
 Example of Graph: Clone Graph