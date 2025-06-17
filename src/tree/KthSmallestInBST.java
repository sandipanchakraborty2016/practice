package tree;

import java.util.Stack;

public class KthSmallestInBST {

    public int kthSmallestInBST(TreeNode root, int k) {

        Stack<TreeNode> stack = new Stack<>();

        while (true) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (--k == 0) {
                return root.val;
            }
            root = root.right;
        }
    }
}
