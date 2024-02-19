package Tree;

import java.util.ArrayList;
import java.util.List;

public class MyBST {
    public TreeNode mRoot;

    public MyBST(){

    }

    public TreeNode insert(TreeNode root, int value){
        // TH1
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

    public TreeNode insertIntoDB(TreeNode root, int value){
        // TH1ode =
        if (root == null){
            return new TreeNode(value);
        }

        if (root.val < value){
            if (root.right == null){
                root.right = new TreeNode(value);
            }else{
                insertIntoDB(root.right, value);
            }
        }else{
            if (root.left == null){
                root.left = new TreeNode(value);
            }else{
                insertIntoDB(root.left, value);
            }
        }
        return root;
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

    public TreeNode findLeftNode(TreeNode root){
        if (root == null){
            return null;
        }
        TreeNode leftMode = root.left;
        while (leftMode.left != null){
            leftMode = leftMode.left;
        }
        return leftMode;
    }

    public TreeNode findRightNode(TreeNode root){
        if (root == null){
            return null;
        }
        TreeNode rightNode = root.right;
        while (rightNode.left != null){
            rightNode = rightNode.right;
        }
        return rightNode;
    }

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

    // Root -> L -> R
    public void PreOrder(TreeNode root){
        if (root == null){
            return ;
        }
        System.out.println(root.val + ' ');
        PreOrder(root.left);
        PreOrder(root.right);
    }

    // L -> Root -> R
    public void InOrder(TreeNode root){
        if (root == null){
            return ;
        }
        PreOrder(root.left);
        System.out.println(root.val + ' ');
        PreOrder(root.right);
    }

    // L -> R -> Root
    public void PostOrder(TreeNode root){
        if (root == null){
            return ;
        }
        PreOrder(root.left);
        PreOrder(root.right);
        System.out.println(root.val + ' ');
    }

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        int lengthLeft = maxDepth(root.left);
        int lengthRight = maxDepth(root.right);

        int result = Math.max(lengthLeft, lengthRight) + 1;

        return result;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return findNode(root, targetSum, 0);
    }

    public boolean findNode(TreeNode curr, int targetSum, int currSum){
        if (curr == null){
            return false;
        }

        currSum += curr.val;
        if (isLeafNode(curr)){
            return currSum == targetSum;
        }
        boolean ansL = findNode(curr.left, targetSum, currSum);
        boolean ansR = findNode(curr.right, targetSum, currSum);

        return ansL || ansR;

    }

    public boolean isLeafNode(TreeNode node){
        return node.left==null && node.right==null;
    }
}
