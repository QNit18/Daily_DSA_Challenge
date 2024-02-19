package Tree;

public class _450_Delete_Node_in_a_BST {

    public TreeNode findLeftNode(TreeNode root){
        if (root == null){
            return null;
        }
        TreeNode leftMode = root;
        while (leftMode.left != null){
            leftMode = leftMode.left;
        }
        return leftMode;
    }

    public TreeNode deleteNode(TreeNode root, int key){
        if (root == null){
            return null;
        }

        // Tim node can xoa
        if (root.val < key){
            root.right = deleteNode(root.right, key);
        }else if (root.val > key){
            root.left = deleteNode(root.left, key);
        }else{ // Tim thay
            // Xoa node

            // TH1: Root la leaf node
            if (root.right == null && root.left == null){
                return null;
            }
            // TH2: Chi co 1 con: ben trai
            if (root.left != null && root.right == null) {
                return root.left;
            } else if (root.right != null && root.left == null){
                return root.right;
            }
            // TH3: Truong hop con lai
            // Tim node trai cung cua cay con ben phai
            TreeNode leftModeNode = findLeftNode(root.right);
            root.val = leftModeNode.val;
            root.right = deleteNode(root.right, leftModeNode.val);

        }
        return root;
    }
}
