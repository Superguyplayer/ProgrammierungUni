package uebung.u6.Aufgabe_3;

public class BinaryTree {
    private Node root;

    public BinaryTree(String root){
        this.root = new Node(root);

    };

    public Node getRoot() {
        return root;
    }

    public void printTree(Node node){
        if(node == null) {
            return;
        }
        printTree(node.getLeftTree());
        System.out.println(node.getContent());
        printTree(node.getRightTree());
    }

    public boolean contains(String content) {
        return contains(content, this.root);
    }

    public boolean contains(String content, Node node) {
        if(node == null) {
            return false;
        }

        if(contains(content, node.getLeftTree())) {
            return true;
        }else{
            if(node.getContent().equals(content)) {
                return true;
            }
            return contains(content, node.getRightTree());
        }


    }

}
