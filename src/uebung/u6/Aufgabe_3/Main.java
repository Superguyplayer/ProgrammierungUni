package uebung.u6.Aufgabe_3;

public class Main {
    public static void main(String[] args) {

       BinaryTree bTree = new BinaryTree();

        Node n1 = bTree.addRecursive("hi1", 7);
        Node n2 = bTree.addRecursive("hi2", 2);
        Node n3 = bTree.addRecursive("hi3", 3);
        Node n4 = bTree.addRecursive("hi4", 4);
        Node n5 = bTree.addRecursive("hi5", 6);
        Node n6 = bTree.addRecursive("hi6", 7);
        Node n7 = bTree.addRecursive("hi7", 8);
        Node n8 = bTree.addRecursive("hi8", 9);
        Node n9 = bTree.addRecursive("hi9", 10);
        Node n10 = bTree.addRecursive("hi10", 11);
        Node n11 = bTree.addRecursive("hi11", 12);
        Node n12 = bTree.addRecursive("hi12", 13);
        Node n13 = bTree.addRecursive("hi13", 0);





       /*
       bTree.getRoot().setRightTree(new Node("rechts"));

       bTree.getRoot().getLeftTree().setLeftTree(new Node("linksLinks"));

       bTree.getRoot().getLeftTree().setRightTree(new Node("linksRechts"));

       bTree.getRoot().getRightTree().setLeftTree(new Node("rechtsLinks"));

       bTree.getRoot().getRightTree().setRightTree(new Node("rechtsRechts"));
       */


       bTree.printTree(bTree.getRoot());

        System.out.println(bTree.contains("linksRechts"));


    }
}
