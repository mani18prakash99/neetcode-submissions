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

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;

        int count = 1;
        while(temp.next != null){
            temp = temp.next;
            count++;
        }

        count = count - n;

        if(count == 0){
            head = head.next;
            return head;
        }

        ListNode curr = head, prev = null;
        while(count-- > 1){
            // prev = curr;
            curr = curr.next;
        }

        // prev.next = curr.next;
        curr.next = curr.next.next;

        return head;
    }
}
