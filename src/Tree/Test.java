package Tree;

public class Test {
//
//    public static void main(String[] args) {
//        MyBinaryTree myBinaryTree = new MyBinaryTree();
//        myBinaryTree.init();
//
//        System.out.println("Done");
//    }

    public static void main(String[] args) {
        MyBST myBST = new MyBST();

        myBST.mRoot = myBST.insert(myBST.mRoot, 5);
        myBST.mRoot = myBST.insert(myBST.mRoot, 1);
        myBST.mRoot = myBST.insert(myBST.mRoot, 6);
        myBST.mRoot = myBST.insert(myBST.mRoot, 4);
        myBST.mRoot = myBST.insert(myBST.mRoot, 8);
        myBST.mRoot = myBST.insert(myBST.mRoot, 2);
        myBST.mRoot = myBST.insert(myBST.mRoot, 12);

        System.out.println(myBST.maxDepth(myBST.mRoot));
        System.out.println(myBST.hasPathSum(myBST.mRoot, 12));
        System.out.println(myBST.hasPathSum(myBST.mRoot, 10));
        System.out.println("DONE");
    }
}
