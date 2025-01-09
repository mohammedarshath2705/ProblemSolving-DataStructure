package LinkedList;


public class SwapNodesPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode t = swapPairs(head.next.next);
        ListNode p = head.next;
        p.next = head;
        head.next = t;
        return p;
    }

    public static void main(String[] args) {
        SwapNodesPairs solution = new SwapNodesPairs();

        ListNode test1 = createList(new int[]{1, 2, 3, 4});
        ListNode result1 = solution.swapPairs(test1);
        printList(result1);

        ListNode test2 = createList(new int[]{1});
        ListNode result2 = solution.swapPairs(test2);
        printList(result2);

        ListNode test3 = createList(new int[]{1, 2});
        ListNode result3 = solution.swapPairs(test3);
        printList(result3);

        ListNode test4 = createList(new int[]{});
        ListNode result4 = solution.swapPairs(test4);
        printList(result4);
    }

    private static ListNode createList(int[] values) {
        if (values.length == 0) {
            return null;
        }
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
