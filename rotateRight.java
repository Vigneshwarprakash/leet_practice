
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode right = head;
        ListNode left = head;
        if(head == null)return head;
        while(k>0){
            if(right == null){
                right = head;
            }            
            right = right.next;
            k--;
        }
        if(left == right)return head;
        if(right == null)return head;
        
        while(right.next != null){
            right = right.next;
            left = left.next;
        }

        ListNode newStart = left.next;
        left.next = null;
        right.next = head;
        return newStart;

    }
}