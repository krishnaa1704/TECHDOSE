class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode ptr=head;
        while(ptr.next!=null){
            if(ptr.val==ptr.next.val) 
            {
                ptr.next=ptr.next.next;
            }
            else
            {
            ptr=ptr.next; //move ptr
            }
        }
        return head;
    }
}