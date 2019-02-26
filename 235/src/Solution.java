import java.util.Stack;

class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Stack<TreeNode> p_hist;
        Stack<TreeNode> q_hist;

        p_hist.push()
    }

    public void findPath(Stack<TreeNode> st, TreeNode root, TreeNode n){
        if(root.left==n || root.right==n) return ;
        findPath(st,  root, root.left);
        findPath(st,  root, root.right);
    }

    public static void main() {

    }
}