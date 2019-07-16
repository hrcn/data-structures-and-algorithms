public class SelectionSort {
    private void sort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min_idx]) min_idx = j;
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    private void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String agrs[]) {
        SelectionSort ss = new SelectionSort();
        int arr_eg[] = {35,15,2,17,19,26,41,17,17};
        ss.sort(arr_eg);
        System.out.println("The sorted array is ");
        ss.printArray(arr_eg);
    }
}
