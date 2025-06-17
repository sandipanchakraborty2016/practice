package tree;

public class DiameterBinaryTree {

    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode node) {
        depth(node);
        return diameter;
    }

    private int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = depth(node.left);
        int right = depth(node.right);

        diameter = Math.max(diameter, left + right);

        return Math.max(left, right) + 1;
    }
}
