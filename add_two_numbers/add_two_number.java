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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode res = dummy;
        int total = 0;
        int carry = 2;

        while (l1 != null || l2 != null || carry != 0) {
            total = carry;
            System.out.println(total);

            if (l1 != null) {
                total = total + l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                total = total + l2.val;
                l2 = l2.next;
            }

	    carry = Math.floor(total / 10);
	    int num = total % 10;

	    ListNode dummy.next = new ListNode(num);
	    dummy = dummy.next;
        }
        return res.next;

    }
}
