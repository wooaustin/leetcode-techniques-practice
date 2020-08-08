/* MEDIUM Problem: Given a binary tree where each node can only have a digit(0-9) value, each root-to-leaf path will
                   represent a number. Find the total sum of all numbers represented by all pahts */

class Node{
    int val;
    Node left;
    Node right;
}

class Solution{
    public int sumPathNumbers(Node root){
        return traverse(root, 0);
    }

    public int traverse(Node root, int pathSum){
        if(root == null){
            return 0;
        }
        
        pathSum = pathSum*10 + root.val;

        //If the current node is a leaf
        if(root.left == null && root.right == null){
            return pathSum;
        }

        return traverse(root.left, pathSum) + traverse(root.right, pathSum);
    }
}