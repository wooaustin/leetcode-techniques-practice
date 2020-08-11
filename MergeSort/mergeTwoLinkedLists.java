/* EASY Problem:
Given two linked lists, merge them such that the resultant list is in sorted order 
*/

class Solution{
    public ListNode mergeTwoLinkedList(ListNode l1, ListNode l2){
        /*Declare a new linkedlist to append ListNodes to, 
        this does not increase space complexity since it is only adding O(1) node */

        ListNode result = new ListNode();
        //Keep a referece to the head of this new list to return
        ListNode ref = result;


        //Merge sort algorithm, take the lowest from each list and append it to the new list
        //Progress the list that had the lowest value forward until null
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                result.next = l1;
                l1 = l1.next;
            }
            else{
                result.next = l2;
                l2 = l2.next;
            }
        }

        //Append any leftover nodes to the end of the result list
        if(l1 != null){
            result.next = l1;
        }
        if(l2 != null){
            result.next = l2;
        }
        return ref.next;
    }
}