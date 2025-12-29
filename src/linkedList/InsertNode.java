package linkedList;

public class InsertNode {
    public static void insertAtStart(ListNode head, int value) {
        ListNode toInsert = new ListNode();
        toInsert.val = value;
        toInsert.next = head.next;

        head.next = null;
        head = toInsert;

    }

    public static void insertAtEnd(ListNode head, int value) {
        ListNode toInsert = new ListNode(value);
        toInsert.next = null;

        while (head.next != null) {
            head = head.next;
        }

        head.next = toInsert;
    }
}
