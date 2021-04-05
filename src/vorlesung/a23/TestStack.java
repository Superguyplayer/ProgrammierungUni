package vorlesung.a23;

public class TestStack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.isEmpty());

        stack.push(5);
        stack.push(6);
        stack.push(1);

        System.out.println(stack.peek());
        stack.push(7);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());

    }
}
