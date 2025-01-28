
public class SearchInRotatedSorted {
    public static int search(int[] arr, int n, int k) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            // If mid points to the target
            if (arr[mid] == k)
                return mid;

            // If left part is sorted
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= k && k <= arr[mid]) {
                    // Element exists
                    high = mid - 1;
                } else {
                    // Element does not exist
                    low = mid + 1;
                }
            } else { // If right part is sorted
                if (arr[mid] <= k && k <= arr[high]) {
                    // Element exists
                    low = mid + 1;
                } else {
                    // Element does not exist
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int n = arr.length, k = 0;
        int ans = search(arr, n, k);
        if (ans == -1)
            System.out.print("Target is not present.");
        else
            System.out.print("The target is at index: " + ans);
    }
}