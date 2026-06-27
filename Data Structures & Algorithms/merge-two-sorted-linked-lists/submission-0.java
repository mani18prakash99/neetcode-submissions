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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        int n = 0;

        ListNode temp = list1;

        while(temp != null){
            temp = temp.next;
            n++;
        }

        temp = list2;
        while(temp != null){
            temp = temp.next;
            n++;
        }

        int arr[] = new int[n];

        temp = list1;
        int i = 0;
        while(temp != null){
            arr[i++] = temp.val;
            temp = temp.next;
        }

        temp = list2;
        while(temp != null){
            arr[i++] = temp.val;
            temp = temp.next;
        }

        Arrays.sort(arr);

        ListNode dummy = new ListNode(0);
        ListNode c = dummy;

        for(int j = 0; j < n; j++){
            c.next = new ListNode(arr[j]);
            c = c.next;
        }

        return dummy.next;
    }
}