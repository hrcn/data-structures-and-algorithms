public class oneSum {
    public static int count(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) count++;
        }
        return count;
    }
}
