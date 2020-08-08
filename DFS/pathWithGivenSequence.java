/* MEDIUM Problem: Given a binary tree and a number sequence, find if the sequence is present as a root-to-leaf
                   path in the given tree */


class Node{
    int val;
    Node left;
    Node right;
}

class Solution{
    public boolean findPath(Node root, int[] sequence){
        return traverse(root, sequence, 0);
    }

    public boolean traverse(Node root, int[] sequence, int currIndex){
        if(root == null){
            return false;
        }

        //If the currentIndex is greater than the length of the sequence, protection from null pointer exception
        //If the current value is not equal to the associated value in the sequence, failure case
        if(currIndex >= sequence.length || root.val != sequence[currIndex]){
            return false;
        }

        //Past this point we assume that the value in the node matches the value in the sequence
        //Next we check to see if we are at the end of the sequence AND we are at a leaf node
        if(currIndex == sequence.length-1 && root.left == null && root.right == null){
            return true;
        }

        //If neither of the above are true, continue the traversal
        return traverse(root.left, sequence, currIndex + 1) || traverse(root.right, sequence, currIndex + 1);

    }
}