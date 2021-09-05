package s2.uebung.u7.a.a3;

import java.util.ArrayList;

public class ArrayIntegerList implements IntegerList{

    private ArrayList<Integer> array = new ArrayList<Integer>();

    @Override
    public int getLenght() {
        return this.array.size();
    }

    @Override
    public void insertLast(int value) {
        this.array.add(value);
    }

    @Override
    public int getFirst() {
        return this.array.get(0);
    }

    @Override
    public void deleteFirst() {
        this.array.remove(0);
    }

    @Override
    public boolean search(int value) {
        return array.contains(value);
    }
}
