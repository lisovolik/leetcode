package leetcode.medium;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task_515 {

    public List<Integer> calculate() {
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode root = new TreeNode(1, left, right);

        Map<Integer, Integer> map = new HashMap<>();
        getMax(root, 0, map);

        return map.values().stream().toList();
    }

    private void getMax(TreeNode node, Integer level, Map<Integer, Integer> map) {
        if (node != null) {
            Integer max = Math.max(map.getOrDefault(level, Integer.MIN_VALUE), node.val);
            map.put(level, max);
            level = level + 1;
            getMax(node.left, level, map);
            getMax(node.right, level, map);
        }
    }

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
}
