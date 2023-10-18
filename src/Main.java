import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ListNode head1 = createList(new int[]{1, 2, 3, 4, 5});
        System.out.println("Input 1: ");
        printList(head1);
        ListNode reversed1 = reverseList(head1);
        System.out.println("Output 1: ");
        printList(reversed1);
        System.out.println("***************************************************");
        ListNode head2 = createList(new int[]{1, 2});
        System.out.println("Input 2: ");
        printList(head2);
        ListNode reversed2 = reverseList(head2);
        System.out.println("Output 2: ");
        printList(reversed2);
        System.out.println("***************************************************");
        ListNode head3 = null;
        System.out.println("Input 3: ");
        printList(head3);
        ListNode reversed3 = reverseList(head3);
        System.out.println("Output 3: ");
        printList(reversed3);
    }

    public static ListNode reverseList(ListNode head) {
        List<ListNode> nodeList = new ArrayList<>();
        ListNode current = head;

        while (current != null) {
            nodeList.add(current);
            current = current.next;
        }

        int n = nodeList.size();
        if (n == 0) return null;

        for (int i = n - 1; i > 0; i--) {
            nodeList.get(i).next = nodeList.get(i - 1);
        }
        nodeList.get(0).next = null;

        return nodeList.get(n - 1);
    }

    public static ListNode createList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}