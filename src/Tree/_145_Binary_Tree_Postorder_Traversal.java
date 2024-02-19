package Tree;

import java.util.ArrayList;
import java.util.List;

public class _145_Binary_Tree_Postorder_Traversal {

    List<Integer> listOrder = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null){
            return listOrder;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        listOrder.add(root.val);

        return listOrder;
    }
}
