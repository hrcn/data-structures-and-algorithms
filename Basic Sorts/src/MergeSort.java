public class MergeSort {
    private void merge(int arr[], int left, int mid, int right) {
        // Sizes of sub-arrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temp arrays
        int L[] = new int [n1];
        int R[] = new int [n2];

        // Copy data to temp arrays
        for (int i=0; i < n1; ++i) {
            L[i] = arr[left+i];
        }
        for (int j=0; j < n2; ++j) {
            R[j] = arr[mid+1+j];
        }

        // Initial indexes of first and second sub-arrays
        int i = 0;
        int j = 0;

        // Initial index of merged sub-array array
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[]
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[]
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    private void sort(int arr[], int l, int r) {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr , m+1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    private static void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {35,15,2,17,19,26,41,17,17};

        System.out.println("Given Array");
        printArray(arr);

        MergeSort ms = new MergeSort();
        ms.sort(arr, 0, arr.length-1);

        System.out.println("\nSorted array");
        printArray(arr);
    }
}
