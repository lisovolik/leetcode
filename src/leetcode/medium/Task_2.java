package leetcode.medium;

import java.math.BigInteger;

public class Task_2 {

    public ListNode calculate() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        //[7,0,8]
        BigInteger sum = getIntVal(l1).add(getIntVal(l2));
        String str = reverse(String.valueOf(sum));

        ListNode result = new ListNode();
        ListNode next = result;
        for (int i = 0; i < str.length(); i++) {
            next.val = str.charAt(i) - '0';
            ListNode node = new ListNode();
            if (i != str.length() - 1) {
                next.next = node;
                next = node;
            }
        }

        return result;
    }

    private BigInteger getIntVal(ListNode listNode) {
        ListNode node = listNode;
        String num = "";
        while (node.next != null) {
            num += node.val;
            node = node.next;
        }
        num = num + node.val;
        return new BigInteger("1000000000000000000000000000001");
    }

    private String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
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
