/* EASY Problem: Given a binary tree and a number 'S', find if the tree has a path from root-to-leaf such that the sum
                 of all the node values of that path equal 'S' */

class Node{
    int val;
    Node left;
    Node right;
}

class Solution{
    public boolean hasPath(Node root, int S){
        if(root == null){
            return false;
        }
        if(root.val == S && root.left == null && root.right == null){
            return true;
        }
        return hasPath(root.left, S - root.val) || hasPath(root.right, S - root.val);

    }
}