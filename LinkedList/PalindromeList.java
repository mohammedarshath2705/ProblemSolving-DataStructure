package LinkedList;



public class PalindromeList {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode cur = slow.next;
        slow.next = null;
        ListNode pre = null;
        while (cur != null) {
            ListNode t = cur.next;
            cur.next = pre;
            pre = cur;
            cur = t;
        }
        while (pre != null) {
            if (pre.val != head.val) {
                return false;
            }
            pre = pre.next;
            head = head.next;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeList obj = new PalindromeList();

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(2);
        head1.next.next.next = new ListNode(1);
        System.out.println(obj.isPalindrome(head1)); // true

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        System.out.println(obj.isPalindrome(head2)); // false

        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(2);
        head3.next.next = new ListNode(3);
        head3.next.next.next = new ListNode(2);
        head3.next.next.next.next = new ListNode(1);
        System.out.println(obj.isPalindrome(head3)); // true

        ListNode head4 = new ListNode(1);
        System.out.println(obj.isPalindrome(head4)); // true

        ListNode head5 = new ListNode(1);
        head5.next = new ListNode(1);
        System.out.println(obj.isPalindrome(head5)); // true
    }
}
