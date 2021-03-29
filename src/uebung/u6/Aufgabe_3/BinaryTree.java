package uebung.u6.Aufgabe_3;


public class BinaryTree {
    private Node root;

    public Node getRoot() {
        return this.root;
    }

    public Node getNode(String cn) {
        return getNode(cn, getRoot());

    }
    public Node getNode(String cn, Node node) {
        if (node != null) {
            if (node.getContent().equals(cn)) {
                return node;
            }

            Node dummy = getNode(cn, node.getLeftTree()); // look at the leftTree

            if (dummy != null && dummy.getContent().equals(cn)) { // found smth?
                return dummy;
            }

            dummy = getNode(cn, node.getRightTree()); // look at the rightTree

            if (dummy != null && dummy.getContent().equals(cn)) { // found smth?
                return dummy;
            }
        }
        return null; // There's no Node with this content

    }

    public boolean contains(String content) {
        return getNode(content) != null; //getNode returns null if the nodes not there, so...

    }

    public Node addRecursive(String cn) {
        if (getRoot() == null) { // if its the first Node just create it
            root = new Node(cn);
            return root;
        }

        return addRecursive(getRoot(), cn);

    }
    public Node addRecursive(Node current, String cn) {

        if (current.getContent().toLowerCase().compareTo(cn.toLowerCase()) > 0) { // the new content is lower in the alphabet
            if (current.getLeftTree() == null) { // no left node, so create it
                current.setLeftTree(new Node(cn));
                return current.getLeftTree();
            }
            return addRecursive(current.getLeftTree(), cn); // going further down by recalling method with left child
        }

        if (current.getContent().toLowerCase().compareTo(cn.toLowerCase()) < 0) {// new content ist higher in the aplphabet
            if (current.getRightTree() == null) { // no right node, so create it
                current.setRightTree(new Node(cn));
                return current.getRightTree();
            }
            return addRecursive(current.getRightTree(), cn); // going further down by recalling method with right child
        }

        return current;
    }


    public Node findParent(Node nodeToFind) {
        if (nodeToFind == getRoot()) { // the root has no parent...
            return null;
        }
        return findParent(getRoot(), nodeToFind);
    }
    public Node findParent(Node node, Node nodeToFind) {

        if (node != null) { // going back
            if (node.isLeaf()) {
                return null;
            }

            if (node.getLeftTree() == nodeToFind || node.getRightTree() == nodeToFind) { // found the parent
                return node;
            }

            Node dummy = findParent(node.getLeftTree(), nodeToFind); // searching the left Tree

            if (dummy != null) { // return if found the parent
                return dummy;
            }

            dummy = findParent(node.getRightTree(), nodeToFind); // searching the right tree

            if (dummy != null) { // return if found the parent
                return dummy;
            }

        }
        return null; // nothing found

    }


    public Node delete(String cn) {

        if (!contains(cn)) {
            return null;
        }

        Node toDelete = getNode(cn);

        Node parent = findParent(toDelete);

        if (toDelete == getRoot()) {
            Node successor = findNextNodeInOrder(getRoot());

            getRoot().setContent(successor.getContent()); // replace content of root with content of next node in line

            if (findParent(successor).getRightTree() == successor) { // delete the Node we took the content of
                findParent(successor).setRightTree(successor.getRightTree());
            } else {
                findParent(successor).setLeftTree(successor.getLeftTree());
            }
            return getRoot(); // returning the root we put the new content in

        }

        if (toDelete.isLeaf()) { // if there's no child of the node to delete, just remove it from its parent

            if (parent.getLeftTree() == toDelete) {
                parent.setLeftTree(null);
            } else {
                parent.setRightTree(null);
            }

            return parent;

        }

        // only one child

        if (toDelete.getLeftTree() != null && toDelete.getRightTree() == null) { // child on the left side

            Node dummy = new Node(""); // save the status of toDelete
            dummy.setRightTree(toDelete.getRightTree());
            dummy.setLeftTree(toDelete.getLeftTree());

            toDelete.setContent(toDelete.getLeftTree().getContent()); // replace content of node toDelete with content of child


            toDelete.setLeftTree(dummy.getLeftTree().getLeftTree()); // setting the left Tree
            toDelete.setRightTree(dummy.getLeftTree().getRightTree()); // setting the right Tree


            return toDelete;

        }

        if (toDelete.getLeftTree() == null && toDelete.getRightTree() != null) { // child on the right side

            Node dummy = new Node(""); // save the status of toDelete
            dummy.setRightTree(toDelete.getRightTree());
            dummy.setLeftTree(toDelete.getLeftTree());

            toDelete.setContent(toDelete.getRightTree().getContent()); // replace content of node toDelete with content of child

            toDelete.setLeftTree(dummy.getRightTree().getLeftTree()); // setting the left Tree
            toDelete.setRightTree(dummy.getRightTree().getRightTree()); // setting the right Tree


            return toDelete;
        }


        // two children

        Node successor = findNextNodeInOrder(toDelete);

        toDelete.setContent(successor.getContent()); // replacing content of toDelete with next node


        //delete succesor
        if (findParent(successor).getRightTree() == successor) {
            findParent(successor).setRightTree(successor.getLeftTree());
        } else {
            findParent(successor).setLeftTree(successor.getRightTree());
        }
        return toDelete;


    }


    public Node findNextNodeInOrder(Node node) {
        if (node != null) {

            if (node.getRightTree() != null) { // one time right
                node = node.getRightTree();
            }

            while (node.getLeftTree() != null) { // left how long it goes
                node = node.getLeftTree();
            }
            return node;

        }
        return null;
    }

    public void printTree() {
        printTree(getRoot());
    }

    public void printTree(Node node) {
        if (node == null) {
            return;
        }
        printTree(node.getLeftTree());
        if (getRoot() == node) {
            System.out.print("root: ");
        }
        System.out.println(node.getContent());

        printTree(node.getRightTree());
    }



}
