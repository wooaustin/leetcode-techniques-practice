/* HARD Problem: Merge K sorted linked lists and return it as one sorted list. */

/* APPROACH: This approach is based off merging each list one by one
Time Complexity: O(kN) where k is the number of lists to merge
Space Complexity: O(1) since we are merging in place
OPTIMIZATIONS: You could do a divide and conquer approach to improve time complexity to O(KlogN) */
class Solution{
    public ListNode mergeKListS(ListNode[] lists){
        if(lists.length == 0){
            return null;
        }

        for(int i = 1;i<lists.length;i++){
            lists[i] = merge(lists[i], lists[i-1]);
        }
        return lists[lists.length-1];
    }

    public ListNode merge(ListNode l1, ListNode l2){
        ListNode result = new ListNode();
        ListNode ref = result;
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
        if(l1 != null){
            result.next = l1;
        }
        if(l2 != null){
            result.next = l2;
        }
        return ref.next;
    }
}