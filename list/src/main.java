import java.util.Iterator;

public class main {
    public static void main(String[] args) {
        List<Integer> myList = new List<>();
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(1, 2);

        System.out.println(myList.getElement(-1));

        for (int i = 0; i < myList.getSize(); i++) {
            System.out.println(myList.getElement(i));
        }
    }
}
