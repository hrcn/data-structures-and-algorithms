public class AList<Item> {

    private Item[] items;
    private int size;
    private static int RFACTOR = 2;

    public AList() {
        size = 0;
        items = (Item[]) new Object[100];
    }

    private void resize(int capacity) {
        Item[] a = (Item[]) new Object[capacity];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }

    public void insertBack(Item x) {
        if (size == items.length) {
            resize(size * RFACTOR);
        }

        items[size] = x;
        size = size + 1;
    }

    public Item getBack() {
        int lastActualItemIndex = size - 1;
        return items[lastActualItemIndex];
    }

    public Item get(int i) {
        return items[i];
    }

    public int size() {
        return size;
    }

    public Item deleteBack() {
        Item itemToReturn = getBack();

        items[size - 1] = null;
        size = size - 1;
        return itemToReturn;
    }
}