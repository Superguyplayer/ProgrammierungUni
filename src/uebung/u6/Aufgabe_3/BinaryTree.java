package uebung.u6.Aufgabe_3;

public class BinaryTree {
    private Node root;



    public Node getRoot() {
        return this.root;
    }

    public void printTree(Node node) {
        if (node == null) {
            return;
        }
        printTree(node.getLeftTree());
        System.out.println(node.getContent());
        printTree(node.getRightTree());
    }

    private int countNodes(Node node) {
        int sum = 0;
        if (node == null) {
            return 0;
        }
        sum += countNodes(node.getLeftTree());
        sum++;
        sum += countNodes(node.getRightTree());
        return sum;
    }


    public boolean contains(String content) {
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

    public Node addRecursive(String cn, int key) {
        if(getRoot() == null){
            root = new Node("root: " + cn, key);
        }
        return addRecursive(getRoot(), cn, key);
    }

    public Node addRecursive(Node current, String cn, int key) {

        if(current.getKey() == key) {
            return current;
        }



        if(current.getKey() > key){
            if(current.getLeftTree() == null){
                current.setLeftTree(new Node(cn, key));
                return current.getLeftTree();
            }
            return addRecursive(current.getLeftTree(), cn, key);
        }
        if(current.getKey() < key) {
            if(current.getRightTree() == null){
                current.setRightTree(new Node(cn, key));
                return current.getRightTree();
            }
            return addRecursive(current.getRightTree(), cn, key);
        }

        return current;

    }


}
