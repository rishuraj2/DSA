package linkedList;

public class RemoveNthFromEnd {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode endOffset = temp;
        ListNode end = temp;

        for (int i = 0; i < n; i++) {
            end = end.next;
        }

        while (end.next != null) {
            endOffset = endOffset.next;
            end = end.next;
        }

        endOffset.next = endOffset.next.next;
        return temp.next;
    }
}
