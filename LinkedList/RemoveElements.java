package LinkedList;



public class RemoveElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1, head);
        ListNode pre = dummy;
        while (pre.next != null) {
            if (pre.next.val != val)
                pre = pre.next;
            else
                pre.next = pre.next.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        RemoveElements remover = new RemoveElements();

        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));
        head1 = remover.removeElements(head1, 6);
        printList(head1);

        ListNode head2 = new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7))));
        head2 = remover.removeElements(head2, 7);
        printList(head2);

        ListNode head3 = new ListNode(1, new ListNode(2, new ListNode(3)));
        head3 = remover.removeElements(head3, 4);
        printList(head3);

        ListNode head4 = null;
        head4 = remover.removeElements(head4, 1);
        printList(head4);

        ListNode head5 = new ListNode(1);
        head5 = remover.removeElements(head5, 1);
        printList(head5);
    }

    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
