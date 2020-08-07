/* EASY Problem: Given a binary tree, populate an array to represent its level-by-level traversal.  
   You should populate the values of all nodes of each level from left to right in separate sub-arrays 

   Example:            1
                     /   \
                    2     3
                   / \    / \
                  4   5  6   7
        Result: [[1],
                 [3,2],
                 [7,6,5,4]] */

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
}

class Solution{
    public List<List<Integer>> levelOrderTraversal(TreeNode root){
        //Basic null check to save on work if we can
        //Mostly a Space optimization
        if(root == null){
            return null;
        }
        //Queue declaration for BFS traversal
        Queue<TreeNode> queue = new LinkedList();
        List<List<Integer>> result = new ArrayList();

        queue.offer(root);

        //Usual while loop as long as the queue is non-empty
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            ArrayList<Integer> levelList = new ArrayList();
            for(int i = 0;i<levelSize;i++){
                TreeNode currNode = queue.poll();
                //Add at the beginning of the list
                levelList.add(0, currNode.val);
                if(currNode.left != null){
                    queue.offer(currNode.left);
                }
                if(currNode.right != null){
                    queue.offer(currNode.right);
                }
            }
            result.add(levelList);
        }
        return result;
    } 
}
