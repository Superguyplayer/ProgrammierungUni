package s2.vorlesung.a20;

public class Stack {
    Node top;


    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

    }

    void push(Node node) {
        if (this.top == null) { // Stack ist noch leer
            this.top = node;
        } else {
            node.next = this.top;
            this.top = node;
        }
    }

    Node pop() {
        Node dummy = this.top;
        this.top = this.top.next;
        return dummy;

    }



}
