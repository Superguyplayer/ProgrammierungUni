package vorlesung.a23;

import java.util.ArrayList;

public class Stack<T> {

    private ArrayList<T> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public T push(T newItem) {
        list.add(newItem);
        return peek();
    }

    public T pop() {
        return list.remove(list.size() - 1);
    }

    public T peek() {
        return list.get(list.size() - 1);
    }

}
