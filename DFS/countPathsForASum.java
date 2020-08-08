import java.util.List;
import java.util.ListIterator;

/* MEDIUM Problem: Given a binary tree and a number 'S', find all paths in the tree such taht the sum of all nodes
                   in that path equals 'S'. Please note that the paths can start or end at any node but all paths
                   must follow direction from parent to child(top to bottom) */


class Node{
    int val;
    Node left;
    Node right;
}

class Solution{
    public int countPaths(Node root, int S){
        List<Integer> currentPath = new ArrayList();
        return traverse(root, S, currentPath);
    }

    public int traverse(Node node, int S, List<Integer> currentPath){
        if(node == null){
            return 0;
        }
        currentPath.add(node.val);

        int pathCount = 0, pathSum = 0;
        ListIterator<Integer> itr = currentPath.listIterator(currentPath.size());
        while(itr.hasPrevious()){
            pathSum += itr.previous();
            if(pathSum == S){
                pathCount++;
            }
        }

        pathCount += traverse(node.left, S, currentPath);
        pathCount += traverse(node.right, S, currentPath);
        currentPath.remove(currentPath.size() -1);
        return pathCount;
    }
}