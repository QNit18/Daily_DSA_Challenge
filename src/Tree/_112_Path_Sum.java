package Tree;

public class _112_Path_Sum {

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
