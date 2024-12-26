package leetcode.easy;

public class Task_83 {

    public ListNode calculate() {
        ListNode node_4 = new ListNode(3);
        ListNode node_3 = new ListNode(3, node_4);
        ListNode node_2 = new ListNode(2, node_3);
        ListNode node_1 = new ListNode(1, node_2);
        ListNode head = new ListNode(1, node_1);

        if (head == null) return null;
        ListNode result = new ListNode(head.val);
        ListNode prevNode = head;
        ListNode current = head.next;

        while (prevNode.next != null && current != null) {
            int prevVal = prevNode.val;
            int currVal = current.val;
            if (prevVal != currVal) {
                addNode(result, currVal);

                prevNode = current;
                current = current.next;
            } else {
                current = current.next;
            }

        }
        return result;
    }

    private void addNode(ListNode result, int currVal) {
        ListNode prev = result;
        ListNode node = result.next;
        while (true){
            if (node == null) {
                break;
            } else {
                prev = node;
                node = node.next;
            }
        }
        prev.next = new ListNode(currVal);
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
