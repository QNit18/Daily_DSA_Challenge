package Tree;

public class _700_Search_in_a_Binary_Search_Tree {

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null){
            return null;
        }
        if (root.val < val){
            root.right = searchBST(root.right, val);
        }else if (root.val > val){
            root.left = searchBST(root.left, val);
        }else { // Tim thay
            return root;
        }
        return null;
    }
}
