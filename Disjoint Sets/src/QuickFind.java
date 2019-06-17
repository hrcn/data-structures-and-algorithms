public class QuickFind implements DisjointSets {
    private int[] id;

    public boolean isConnected(int p, int q) {
        return id[p] == id[q];
    }

    public void connect(int p, int q) {
        int p_id = id[p];
        int q_id = id[q];

        for (int i = 0; i < id.length; i++) {
            if (id[i] == p_id) {
                id[i]= q_id;
            }
        }
    }

    public QuickFind(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

}
