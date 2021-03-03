package uebung.u6.Aufgabe_3;

public class Main {
    public static void main(String[] args) {

       BinaryTree bTree = new BinaryTree();

        bTree.addRecursive("M");
        bTree.addRecursive("Guten");
        bTree.addRecursive("Morgen");
        bTree.addRecursive("Mein");
        bTree.addRecursive("Name");
        bTree.addRecursive("Ist");
        bTree.addRecursive("Per");
        bTree.addRecursive("Henrik");
        bTree.addRecursive("Stolte");

        bTree.printTree();

        bTree.delete("M");
        System.out.println();

        bTree.printTree();

        System.out.println(Node.count);












    }
}
