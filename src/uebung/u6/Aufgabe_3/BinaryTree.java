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
        if (node != null && node.getContent().equals(cn)) {
            return node;
        }
        if (node != null) {
            Node dummy = getNode(cn, node.getLeftTree());
            if (dummy != null && dummy.getContent().equals(cn)) {
                return dummy;
            }
            dummy = getNode(cn, node.getRightTree());
            if (dummy != null && dummy.getContent().equals(cn)) {
                return dummy;
            }
        }
        return null;

    }

    public boolean contains(String content) { // nach Inhalt suchen
        return contains(content, this.root);
    }

    public boolean contains(String content, Node node) {

        if (node == null) {
            return false;
        }

        if (contains(content, node.getLeftTree())) {
            return true;
        } else {
            if (node.getContent().equals(content)) {
                return true;
            }
            return contains(content, node.getRightTree());
        }


    }

    public Node addRecursive(String cn) {
        if (getRoot() == null) {
            root = new Node(cn);
            return root;
        }

        return addRecursive(getRoot(), cn);

    }


    public Node addRecursive(Node current, String cn) {


        if (current.getContent().toLowerCase().compareTo(cn.toLowerCase()) > 0) {
            if (current.getLeftTree() == null) {
                current.setLeftTree(new Node(cn));
                return current.getLeftTree();
            }
            return addRecursive(current.getLeftTree(), cn);
        }
        if (current.getContent().toLowerCase().compareTo(cn.toLowerCase()) < 0) {
            if (current.getRightTree() == null) {
                current.setRightTree(new Node(cn));
                return current.getRightTree();
            }
            return addRecursive(current.getRightTree(), cn);
        }

        return current;
    }


    public Node findParent(Node nodeToFind) {
        if (nodeToFind == getRoot()) {
            return null;
        }
        return findParent(getRoot(), nodeToFind);
    }

    public Node findParent(Node node, Node nodeToFind) {

        if (node != null) {
            if (node.isLeaf()) {
                return null;
            }

            if (node.getLeftTree() == nodeToFind || node.getRightTree() == nodeToFind) {
                return node;
            }

            Node dummy = findParent(node.getLeftTree(), nodeToFind);
            if (dummy != null) {
                return dummy;
            }
            dummy = findParent(node.getRightTree(), nodeToFind);
            if (dummy != null) {
                return dummy;
            }

        }
        return null;

    }


    public Node delete(String cn) {

        Node toDelete = getNode(cn);
        Node parent = findParent(toDelete);

        if(toDelete == null){
            Node successor = findNextNodeInOrder(getRoot());

            getRoot().setContent("root: " + successor.getContent());

            if(findParent(successor).getRightTree() == successor) {
                findParent(successor).setRightTree(null);
            }else{
                findParent(successor).setLeftTree(null);
            }
            return getRoot();

        }else


        if (toDelete.isLeaf()) {

            if (parent.getLeftTree() == toDelete) {
                parent.setLeftTree(null);
            } else {
                parent.setRightTree(null);
            }

            return parent;

        }

        //nur ein Child
        if (toDelete.getLeftTree() != null && toDelete.getRightTree() == null) {
            toDelete.setContent(toDelete.getLeftTree().getContent());

            toDelete.setLeftTree(null);

            return toDelete;

        }

        if (toDelete.getLeftTree() == null && toDelete.getRightTree() != null) {
            toDelete.setContent(toDelete.getRightTree().getContent());

            toDelete.setRightTree(null);

            return toDelete;
        }
        // two children

        Node successor = findNextNodeInOrder(toDelete);

        toDelete.setContent(successor.getContent());

        if(findParent(successor).getRightTree() == successor) {
            findParent(successor).setRightTree(null);
        }else{
            findParent(successor).setLeftTree(null);
        }
        return toDelete;


    }


    public Node findNextNodeInOrder(Node node) {
        if (node != null) {
            if (node.getRightTree() != null) {
                node = node.getRightTree();
            }
            while (node.getLeftTree() != null) {
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
        if(getRoot() == node){
            System.out.print("root: ");
        }
        System.out.println(node.getContent());

        printTree(node.getRightTree());
    }


}
