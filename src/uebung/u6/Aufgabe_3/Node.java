package uebung.u6.Aufgabe_3;

public class Node {
    private String content;
    private Node leftTree;
    private Node rightTree;
    private int key;

    public Node(String content, int key) {
        this.content = content;
        this.key = key;
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


    public Node getLeftTree() {
        return leftTree;
    }

    public Node getRightTree() {
        return rightTree;
    }

    public int getKey() {
        return key;
    }
}
