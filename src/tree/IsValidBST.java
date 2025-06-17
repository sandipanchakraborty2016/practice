package tree;

public class IsValidBST {

    public boolean isValidBST(TreeNode node) {
        return isValid(node, null, null);
    }

    private boolean isValid(TreeNode node, Integer min, Integer max) {
        if (node == null) {
            return true;
        }
        if ((min != null && node.val <= min) || (max != null && node.val >= max)) {
            return false;
        }
        return isValid(node.left, min, node.val) && isValid(node.right, node.val, max);
    }
}

