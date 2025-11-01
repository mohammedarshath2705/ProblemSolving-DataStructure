package LinkedList;

/*
Write a function to delete a node (except the tail) in a singly linked list,
given only access to that node.
*/
public class DeleteNode {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        System.out.println("Original list:");
        printList(head);

        DeleteNode obj = new DeleteNode();
        obj.deleteNode(head.next); // delete node with value 5

        System.out.println("\nAfter deleting node 5:");
        printList(head);
    }
}
