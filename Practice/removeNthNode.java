class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode list = new ListNode(0);
        list.next = head;
        ListNode slow = list;
        ListNode fast = list;
        for(int i = 1; i<= n+1; i++)
        {
            fast= fast.next;
            
        }
        while(fast!=null)
        {
            slow=slow.next;
            fast= fast.next;
        
    }
    slow.next = slow.next.next;
    return list.next;
}
}