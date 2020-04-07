public class BinarySearch {
    // Must always operate on something that's sorted
    public static boolean binarySearchIterative(int[] nums, int key)  {
        int right = 0;
        int left = nums.length - 1;

        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (nums[mid] == key) {
                return true;
            } else if (key < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    public static boolean binarySearchRecursive(int[] nums, int key, int left, int right) {
        if (left > right) return false;

        int mid = left + ((right - left) / 2);

        if (nums[mid] == key) {
            return true;
        } else if (key < nums[mid]) {
            return binarySearchRecursive(nums, key, left, mid - 1);
        } else {
            return binarySearchRecursive(nums, key, mid + 1, right);
        }
    }
}
