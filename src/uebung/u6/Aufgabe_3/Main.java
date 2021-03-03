package uebung.u6.Aufgabe_3;

public class Main {
    public static void main(String[] args) {

       BinaryTree bTree = new BinaryTree();



        bTree.addRecursive("a");
        bTree.addRecursive("8");
        bTree.addRecursive("c");
        bTree.addRecursive("b");
        bTree.addRecursive("6");
        bTree.addRecursive("d");



        bTree.printTree();

        bTree.delete("a");
        System.out.println();

        bTree.printTree();















    }
}
