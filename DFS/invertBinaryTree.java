/* EASY Problem: Given a binary tree, invert the tree such that all values that appear on the right, 
                 appear on the left, and vice versa */

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
}


class Solution{
    public TreeNode invertBinaryTree(TreeNode root){
        if(root == null){
            return null;
        }

        TreeNode left = invertBinaryTree(root.right);
        TreeNode right = invertBinaryTree(root.left);
        root.right = left;
        root.left = right;

        return root;
    }
}