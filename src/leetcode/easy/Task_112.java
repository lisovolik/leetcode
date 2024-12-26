package leetcode.easy;

public class Task_112 {

    public boolean calculate() {
        int targetSum = 22;
        TreeNode root = new TreeNode();

        return sum(root, targetSum);
    }

    private boolean sum(TreeNode node, int targetSum) {
        if (node == null) {
            return false;
        }

        if (node.left == null && node.right == null) {
            return targetSum == node.val;
        }

        return sum(node.left, targetSum - node.val) ||
                sum(node.right, targetSum - node.val);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
