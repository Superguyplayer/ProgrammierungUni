package uebung.u6.Aufgabe_3;

public class Node {
    private String content;
    private Node leftTree;
    private Node rightTree;
    public static int count = 0;


    public Node(String content) {
        this.content = content;
        count++;

    }


    public Node setLeftTree(Node leftTree) {
        this.leftTree = leftTree;
        return this;
    }

    public Node setRightTree(Node rightTree) {
        this.rightTree = rightTree;
        return this;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Node getLeftTree() {
        return leftTree;
    }

    public Node getRightTree() {
        return rightTree;
    }


    public Boolean isLeaf() {
        return leftTree == null && rightTree == null;
    }

}
