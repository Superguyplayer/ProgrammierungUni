package uebung.u7.a.a3;

public class InterfaceMain {
    public static void main(String[] args) {
        ArrayIntegerList list = new ArrayIntegerList();

        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);

        System.out.println(list.getFirst());
        System.out.println(list.getLenght());
        System.out.println(list.search(3));
        System.out.println(list.search(1));
    }
}
