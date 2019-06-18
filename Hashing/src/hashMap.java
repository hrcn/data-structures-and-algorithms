public class hashMap {
    private final float loadFactor;
    private int maxCapacity;

    public hashMap(int initialCapacity, float loadFactor) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal initial capacity");
        }
        if (initialCapacity > maxCapacity){
            initialCapacity = maxCapacity;
        }
        if(loadFactor <= 0 || Float.isNaN(loadFactor)) {
            throw new IllegalArgumentException("Illegal load factor");
        }

        this.loadFactor = loadFactor;
        int threshold = initialCapacity;
    }
}
