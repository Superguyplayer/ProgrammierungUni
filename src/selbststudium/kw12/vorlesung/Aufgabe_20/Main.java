package selbststudium.kw12.vorlesung.Aufgabe_20;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack();

        for (int i = 0; i < 30; i++) {
            stack.push(new Stack.Node(i));

        }



        for (int i = 0; i < 30; i++) {
            System.out.println(stack.pop().data);
        }

    }
}
