package uebung.u6.Aufgabe_3;

public class Main {
    public static void main(String[] args) {

       BinaryTree bTree = new BinaryTree();



        bTree.addRecursive("Mein");
        bTree.addRecursive("Name");
        bTree.addRecursive("ist");
        bTree.addRecursive("Per");
        bTree.addRecursive("Henrik");
        bTree.addRecursive("ich");
        bTree.addRecursive("bin");
        bTree.addRecursive("19");
        bTree.addRecursive("Jahre");
        bTree.addRecursive("alt");




        bTree.printTree();

        bTree.delete("bin");
        System.out.println();

        bTree.printTree();















    }
}
