package uebung.u6.Aufgabe_3;

public class Node {
    private String content;
    private Node leftTree;
    private Node rightTree;

    public Node(String content) {
        this.content = content;
    }

    public Node addRecursive(Node current, String content) {
        return current;
    }



    public void setLeftTree(Node leftTree) {
        this.leftTree = leftTree;
    }

    public void setRightTree(Node rightTree) {
        this.rightTree = rightTree;
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
}
