/* MEDIUM Problem: Given a binary tree and a number 'S', find all paths from root-to-leaf such that the sum
                   of all node values of each path equals 'S' */

class Node{
    int val;
    Node left;
    Node right;
}

class Solution{
    public List<List<Node>> allPaths(Node root, int S){
        List<List<Integer>> allPath = new ArrayList();
        List<Integer> currentPath = new ArrayList();
        traverse(root, S, allPath, currentPath);
        return allPath;
    }

    public void traverse(Node root, int S, List<List<Integer>> allPath, List<Integer> currentPath){
        if(root == null){
            return;
        }
        currentPath.add(root.val);

        if(root.val == S && root.left == null && root.right == null){
            allPath.add(new ArrayList<Integer>(currentPath));
        }
        else{
            traverse(root.left, S-root.val, allPath, currentPath);
            traverse(root.right, S - root.val, allPath, currentPath);
        }
        currentPath.remove(currentPath.size() -1 );
    }
}
