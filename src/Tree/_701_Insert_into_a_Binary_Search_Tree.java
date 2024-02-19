package Tree;

public class _701_Insert_into_a_Binary_Search_Tree {
    public TreeNode insertIntoBST(TreeNode root, int value) {
        TreeNode newNode = new TreeNode(value);
        if (root == null){
            root = newNode;
            return root;
        }else {
            TreeNode temp = root;
            while (true){
                if (temp.val < value){
                    if(temp.right == null){
                        temp.right = newNode;
                        break;
                    }else {
                        temp = temp.right;
                    }
                }else{
                    if(temp.left == null){
                        temp.left = newNode;
                        break;
                    }else{
                        temp = temp.left;
                    }
                }
            }
            return root;
        }
    }
}
