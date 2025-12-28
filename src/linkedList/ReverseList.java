package linkedList;

public class ReverseList {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        
        if (head.next == null) {
            return head;
        }

        ListNode temp1 = head.next;
        ListNode temp2 = temp1.next;
        head.next = null;
        while (temp1 != null) {
            temp1.next = head;
            head = temp1;
            temp1 = temp2;
            if (temp2 != null) {
                temp2 = temp2.next;
            }
        }
        return head;
    }
}
