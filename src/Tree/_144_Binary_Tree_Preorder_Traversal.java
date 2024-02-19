package Tree;

import java.util.ArrayList;
import java.util.List;

public class _144_Binary_Tree_Preorder_Traversal {

    List<Integer> paradeOrder = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null){
            return paradeOrder;
        }
        paradeOrder.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return paradeOrder;
    }
}
