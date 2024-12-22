package LinkedList;

public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        MiddleNode solution = new MiddleNode();

        ListNode test1 = new ListNode(1);
        test1.next = new ListNode(2);
        test1.next.next = new ListNode(3);
        test1.next.next.next = new ListNode(4);
        test1.next.next.next.next = new ListNode(5);

        ListNode result1 = solution.middleNode(test1);
        System.out.println(result1.val);

        ListNode test2 = new ListNode(1);
        test2.next = new ListNode(2);
        test2.next.next = new ListNode(3);
        test2.next.next.next = new ListNode(4);
        test2.next.next.next.next = new ListNode(5);
        test2.next.next.next.next.next = new ListNode(6);

        ListNode result2 = solution.middleNode(test2);
        System.out.println(result2.val);

        ListNode test3 = new ListNode(1);

        ListNode result3 = solution.middleNode(test3);
        System.out.println(result3.val);

        ListNode test4 = new ListNode(1);
        test4.next = new ListNode(2);

        ListNode result4 = solution.middleNode(test4);
        System.out.println(result4.val);
    }
}
