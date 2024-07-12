// Maximum Twin Sum of a Linked List
class Solution {
    public int pairSum(ListNode head) {
         if (head == null || head.next == null) {
            return 0;
        }
        int max = 0;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalf = reverse(slow);
        ListNode firstHalf = head;
        while (secondHalf != null) {
            max = Math.max(firstHalf.val + secondHalf.val, max);
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return max;
    }
    public ListNode reverse(ListNode head){
        ListNode temp = null;
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
