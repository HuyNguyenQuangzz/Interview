package INTERVIEW3;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class MergeSortedLinkedLists {
    public static ListNode merge(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        return mergeLists(lists, 0, lists.length - 1);
    }

    private static ListNode mergeLists(ListNode[] lists, int start, int end) {
        if (start == end) {
            return lists[start];
        }
        int mid = start + (end - start) / 2;
        ListNode left = mergeLists(lists, start, mid);
        ListNode right = mergeLists(lists, mid + 1, end);
        return mergeTwoLists(left, right);
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        // Tạo danh sách liên kết 1: 1 -> 4 -> 5
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        // Tạo danh sách liên kết 2: 1 -> 3 -> 4
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        // Tạo danh sách liên kết 3: 2 -> 6
        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        // Tạo danh sách liên kết 4: 5 -> 6 -> 22 -> 30
        ListNode l4 = new ListNode(5);
        l4.next = new ListNode(6);
        l4.next.next = new ListNode(22);
        l4.next.next = new ListNode(30);

        // Tạo danh sách liên kết 5: 15 -> 26 -> 32
        ListNode l5 = new ListNode(15);
        l5.next = new ListNode(26);
        l5.next.next = new ListNode(32);

        // ... 32 linked list có thể đc tạo ra như thế...


        // Gộp danh sách liên kết
        ListNode[] lists = new ListNode[]{l1, l2, l3, l4, l5};
        ListNode mergedList = merge(lists);

        // In danh sách liên kết đã gộp
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
}
