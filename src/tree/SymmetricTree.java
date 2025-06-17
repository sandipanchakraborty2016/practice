package tree;

public class SymmetricTree {

    public boolean isSymmetric(TreeNode node){
        return isMirror(node, node);
    }

    private boolean isMirror(TreeNode leftTree, TreeNode rightTree){
        if(leftTree==null && rightTree==null){
            return true;
        }
        if(leftTree==null || rightTree==null){
            return false;
        }
        return leftTree.val==rightTree.val
                && isMirror(leftTree.left,rightTree.right)
                && isMirror(leftTree.right, rightTree.left);
    }
}
