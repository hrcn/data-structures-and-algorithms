public class binarySearch {
    static int binarySearch(String[] sorts, String x, int lo, int hi) {
        if (lo > hi) return -1;
        int m = (lo + hi) / 2;
        int cmp = x.compareTo(sorts[m]);
        if (cmp < 0) return binarySearch(sorts, x, lo, m-1);
        else if (cmp > 0) return binarySearch(sorts, x, m+1, hi);
        else return m;
    }
}
