package uebung.u6.Aufgabe_3;

public class Main {
    public static void main(String[] args) {

       BinaryTree bTree = new BinaryTree("root");

       bTree.getRoot().setLeftTree(new Node("links"));

       bTree.getRoot().setRightTree(new Node("rechts"));

       bTree.getRoot().getLeftTree().setLeftTree(new Node("linksLinks"));

       bTree.getRoot().getLeftTree().setRightTree(new Node("linksRechts"));

       bTree.getRoot().getRightTree().setLeftTree(new Node("rechtsLinks"));

       bTree.getRoot().getRightTree().setRightTree(new Node("rechtsRechts"));

       bTree.printTree(bTree.getRoot());

        System.out.println(bTree.contains("linksRechts"));


    }
}
