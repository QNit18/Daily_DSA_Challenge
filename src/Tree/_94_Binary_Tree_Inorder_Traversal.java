package Tree;

import java.util.ArrayList;
import java.util.List;

public class _94_Binary_Tree_Inorder_Traversal {

    List<Integer> listOrder = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null){
            return listOrder;
        }

        inorderTraversal(root.left);
        listOrder.add(root.val);
        inorderTraversal(root.right);

        return listOrder;
    }
}
