class ListNode {
    int value = 0;
    ListNode next;
  
    ListNode(int value) {
      this.value = value;
    }
}
class Solution{
    public ListNode reverse(ListNode head){
        ListNode currNode = head;
        ListNode prev = null;
        ListNode next = null;
        while(currNode != null){
            next = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = next;
        }
        return prev;
    }
}