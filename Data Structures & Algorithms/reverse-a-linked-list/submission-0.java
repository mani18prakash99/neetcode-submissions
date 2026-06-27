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
    public ListNode reverseList(ListNode head) {
        
        ListNode dummy = head;
        int n = 0;
        while(dummy != null){
            dummy = dummy.next;
            n++;
        }

        int arr[] = new int[n];
        dummy = head;
        int i = 0;
        while(dummy != null){
            arr[i++] = dummy.val;
            dummy = dummy.next;
        }

        ListNode temp = head;
        for(int j = n-1; j >= 0; j--){
            temp.val = arr[j];
            temp = temp.next;
        }

        return head;
    }
}
