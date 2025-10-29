package LinkedList;

/*
Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.
 */
public class LinkedListCycle {

    // Simple ListNode used throughout this class
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; this.next = null; }
    }

    // Floyd's Tortoise and Hare - detects cycle in O(n) time and O(1) space
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;           // move by 1
            fast = fast.next.next;      // move by 2

            if (slow == fast) {         // they met -> cycle exists
                return true;
            }
        }
        return false; // fast hit the end -> no cycle
    }

    // Helper: create a plain linked list from array of values (no cycle)
    public static ListNode createList(int[] vals) {
        if (vals == null || vals.length == 0) return null;
        ListNode head = new ListNode(vals[0]);
        ListNode cur = head;
        for (int i = 1; i < vals.length; i++) {
            cur.next = new ListNode(vals[i]);
            cur = cur.next;
        }
        return head;
    }

    // Helper: create linked list and make a cycle at position `pos`
    // pos is the index (0-based) where tail.next -> nodeAtPos.
    // If pos == -1 or pos >= length => no cycle.
    public static ListNode createListWithCycle(int[] vals, int pos) {
        ListNode head = createList(vals);
        if (head == null || pos < 0) return head;

        ListNode tail = head;
        ListNode cycleNode = null;
        int index = 0;
        while (tail.next != null) {
            if (index == pos) cycleNode = tail;
            tail = tail.next;
            index++;
        }
        // If pos equals last index, cycleNode will be set in loop? check last node:
        if (index == pos) cycleNode = tail;

        if (cycleNode != null) {
            tail.next = cycleNode; // create cycle
        }
        return head;
    }

    // Utility: prints up to `limit` nodes to avoid infinite loops when cycle exists
    public static void printListLimited(ListNode head, int limit) {
        ListNode cur = head;
        int i = 0;
        while (cur != null && i < limit) {
            System.out.print(cur.val + (cur.next != null ? " -> " : ""));
            cur = cur.next;
            i++;
        }
        if (cur != null) System.out.print(" ... (stops after " + limit + " nodes)");
        System.out.println();
    }

    // PSVM - tests several cases
    public static void main(String[] args) {
        LinkedListCycle detector = new LinkedListCycle();

        // Test 1: no cycle
        int[] vals1 = {3, 2, 0, -4};
        ListNode list1 = createList(vals1);
        System.out.print("List1 (no cycle): ");
        printListLimited(list1, 20);
        System.out.println("Has cycle? " + detector.hasCycle(list1));
        System.out.println();

        // Test 2: cycle at position 1 (tail connects to node index 1)
        int[] vals2 = {3, 2, 0, -4};
        ListNode list2 = createListWithCycle(vals2, 1);
        System.out.print("List2 (cycle at pos 1): ");
        printListLimited(list2, 12); // limited print because cycle exists
        System.out.println("Has cycle? " + detector.hasCycle(list2));
        System.out.println();

        // Test 3: single node, no cycle
        int[] vals3 = {1};
        ListNode list3 = createListWithCycle(vals3, -1);
        System.out.print("List3 (single node, no cycle): ");
        printListLimited(list3, 5);
        System.out.println("Has cycle? " + detector.hasCycle(list3));
        System.out.println();

        // Test 4: single node, cycle to itself
        ListNode list4 = createListWithCycle(vals3, 0); // pos 0 makes node point to itself
        System.out.print("List4 (single node, cycle to itself): ");
        printListLimited(list4, 5);
        System.out.println("Has cycle? " + detector.hasCycle(list4));
        System.out.println();

        // Test 5: empty list
        ListNode list5 = createList(new int[] {});
        System.out.print("List5 (empty): ");
        printListLimited(list5, 5);
        System.out.println("Has cycle? " + detector.hasCycle(list5));
    }
}
