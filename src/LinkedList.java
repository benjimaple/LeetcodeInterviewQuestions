public class LinkedList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode currentPointer1 = head;
        ListNode currentPointer2 = head;

        while(currentPointer1 != null){
            length = length +1 ;
            currentPointer1 = currentPointer1.next;
        }

        for (int i =0 ; i < length - n -1;i ++) {
            currentPointer2  = currentPointer2.next;
        }
        currentPointer2.next = currentPointer2.next.next;
        return head;
    }
}