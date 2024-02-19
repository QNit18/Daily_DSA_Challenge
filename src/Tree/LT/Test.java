package Tree.LT;

import Tree.MyBST;

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

        myBST.mRoot = myBST.insertIntoDB(myBST.mRoot, 5);
        myBST.mRoot = myBST.insertIntoDB(myBST.mRoot, 1);
        myBST.mRoot = myBST.insertIntoDB(myBST.mRoot, 6);
        myBST.mRoot = myBST.insertIntoDB(myBST.mRoot, 4);
        myBST.mRoot = myBST.insertIntoDB(myBST.mRoot, 8);
        myBST.mRoot = myBST.insertIntoDB(myBST.mRoot, 2);
        myBST.mRoot = myBST.insertIntoDB(myBST.mRoot, 12);

        System.out.println("DONE");
    }
}
