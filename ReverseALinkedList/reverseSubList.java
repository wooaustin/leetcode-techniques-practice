/* MEDIUM Problem: 
    Given the head of a LinkedList and two positions ‘p’ and ‘q’, reverse the LinkedList from position ‘p’ to ‘q’.
*/

class ListNode {
    int value = 0;
    ListNode next;
  
    ListNode(int value) {
      this.value = value;
    }
}

class Solution{
    public ListNode reverseSublist(ListNode head, int p, int q){
        if(p == q){
            return head;
        }
        //First, we must skip the first p-1 nodes, since we arent going to manipulate those nodes 
        ListNode prev = null;
        ListNode curr = head;
        for(int i = 0;i<p-1;i++){
            prev = curr;
            curr = curr.next;
        }

        //Next we know that curr.next == p, and prev == p-1, so now we start the reversal
        ListNode lastNodeOfFirst = prev;
        ListNode lastNodeOfSub = curr;
        ListNode next = null;
        //Standard reversal now, for q-p + 1 nodes
        for(int i = 0;curr != null && i<q - p + 1;i++){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //Connect the first part
        if(lastNodeOfFirst != null){
            lastNodeOfFirst = prev;
        }
        else{
            head = prev;
        }

        //Connect the last part
        lastNodeOfSub.next = curr;
        return head;
    }
}