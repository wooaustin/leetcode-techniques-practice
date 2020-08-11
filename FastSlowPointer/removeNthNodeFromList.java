/* MEDIUM Problem:
Given a linked list, remove the n-th node from the end of the list and return its head */

class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val) { this.val = val}
    ListNode(int val, ListNode next) { this.val = val; this.next = next}
}

class Solution{
    public ListNode removeNthNode(ListNode head, int n){
        ListNode ref = new ListNode();
        ref.next = head;
        ListNode fast = ref;
        ListNode slow = ref;
        //Move fast forward such that the distance between fast and slow is N+1 nodes
        for(int i = 1;i<=n+1;i++){
            fast = fast.next;
        }

        //Since we know that fast is N+1 nodes ahead of slow, we now move both pointers forward until fast reaches the end
        //Slow will now be set to the node right before the Nth node to remove
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        //Swapping the next node to remove reference to the Nth node, remove it from the list
        slow.next = slow.next.next;
        return ref.next;
    }
}