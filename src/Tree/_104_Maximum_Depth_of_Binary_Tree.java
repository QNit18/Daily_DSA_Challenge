package Tree;

public class _104_Maximum_Depth_of_Binary_Tree {

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        int lengthLeft = maxDepth(root.left);
        int lengthRight = maxDepth(root.right);

        int result = Math.max(lengthLeft, lengthRight) + 1;

        return result;
    }
}
