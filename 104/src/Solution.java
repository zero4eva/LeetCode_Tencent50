class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int len_L = maxDepth(root.left);
        int len_R = maxDepth(root.right);
        return (len_L > len_R ? len_L : len_R) + 1;
    }

    public static void main() {

    }
}