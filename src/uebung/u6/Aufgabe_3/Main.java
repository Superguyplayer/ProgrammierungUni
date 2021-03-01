package uebung.u6.Aufgabe_3;

public class Main {
    public static void main(String[] args) {

       BinaryTree bTree = new BinaryTree();

        bTree.addRecursive("hi1", 7);
        bTree.addRecursive("hi2", 2);
        bTree.addRecursive("hi3", 1);
        bTree.addRecursive("hi10", 11);
        bTree.addRecursive("hi9", 10);
        bTree.addRecursive("tach", 5);

        bTree.printTree(bTree.getRoot());

        bTree.delete("hi1");

        System.out.println();


        bTree.printTree(bTree.getRoot());






    }
}
