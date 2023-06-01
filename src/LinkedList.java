public class LinkedList {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

        ListNode head;

        // Thêm một node vào cuối danh sách
        void append(int value) {
            ListNode newNode = new ListNode(value);

            if (head == null) {
                head = newNode;
            } else {
                ListNode current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        // Xóa các node có giá trị bằng a
        void remove(int a) {
            ListNode current = head;
            ListNode previous = null;

            while (current != null) {
                if (current.val == a) {
                    if (previous == null) {
                        // Xóa node đầu tiên
                        head = current.next;
                    } else {
                        previous.next = current.next;
                    }
                } else {
                    previous = current;
                }
                current = current.next;
            }
        }

        // In ra danh sách
        void print() {
            ListNode current = head;
            while (current != null) {
                System.out.print(current.val + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

