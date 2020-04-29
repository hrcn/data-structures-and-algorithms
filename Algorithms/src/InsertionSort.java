public class InsertionSort {

    public void printArray(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void sort(int[] arr) {
        int n = arr.length;

        for(int i = 1; i < n; i++) {
            // unsorted part
            int temp = arr[i];
            // sorted part
            int j = i - 1;

            while(j >= 0 && arr[j] > temp) {
                // shifting larger elements to temp by 1 pos
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {5, 1, 2, 9, 10};
        InsertionSort is = new InsertionSort();
        is.printArray(arr);
        is.sort(arr);
        is.printArray(arr);
    }

}