/* MEDIUM
   Given a reference of a node in a connected undirected graph, return a DEEP COPY of the graph */

class Node{
    int val;
    ArrayList<Node> neighbors;
}

class Solution{
    public Node cloneGraph(Node root){

        /*We'll need two things for this BFS traversal
          1. Since this is BFS then we'll need to declare a queue for the traversal
          2. Undirected graph so we'll need to see if we've visited a node before we make a new one
             such that we dont create duplicate nodes in our new graph */
        Queue<Node> queue = new LinkedList();
        Map<Node, Node> map = new HashMap();

        //HashMap will represent the connections in our new graph in relation to the old ones
        queue.offer(root);
        map.put(root, new Node(root.val, new ArrayList()));

        //While the queue is non-empty, pull a node off and loop through it's adjacency list
        while(!queue.isEmpty()){
            Node currNode = queue.poll();
            for(Node neighbor : currNode.neighbors){
                //If a node has a neighbor, check to see if we have visited the node before
                if(!map.containsKey(neighbor)){
                    //If a node has not been visited, then create a new node in the new graph
                    map.put(neighbor, new Node(neighbor.val, new ArrayList()));
                    queue.offer(neighbor);
                }
                //Add this neighbor clone to the adjacency list of the currNode
                map.get(currNode).neighbors.add(map.get(neighbor));
            }
        }
        return map.get(root);
    }
}