public class HeapSort {
    public void heapify(int arr[], int n, int i) {
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i +2;

        if (left < n && arr[left] > arr[largest]) largest = left;
        if (right < n && arr[right] > arr[largest]) largest = right;
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr,n,largest); // Recursively heapify the affected sub-tree.
        }
    }

    private void sort(int arr[]) {
        int n = arr.length;

        for (int i = n/2 - 1; i >= 0; i--) {
            heapify(arr,n,i);
        }

        for (int i = n-1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr,i,0);
        }
    }

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {35,15,2,17,19,26,41,17,17};
        int n = arr.length;

        HeapSort hs = new HeapSort();
        hs.sort(arr);

        System.out.println("Sorted array is");
        printArray(arr);
    }
}
