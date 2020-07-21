import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        int n = 5; // size of the ArrayList

        ArrayList<Integer> arrli = new ArrayList<Integer>(n);

        // appending new elements at the end of the list
        for (int i = 0; i <= n; i++) {
            arrli.add(i);
        }

        System.out.println(arrli);

        // remove element at index 3
        arrli.remove(3);

        System.out.println(arrli);

        for (int i = 0; i < arrli.size(); i++) {
            System.out.println(arrli.get(i) + " ");
        }
    }
}
