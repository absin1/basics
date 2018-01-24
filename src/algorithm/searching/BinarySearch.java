package algorithm.searching;

public class BinarySearch {
	/**
	 * The idea of binary search is to use the information that the array is
	 * sorted and reduce the time complexity to O(Logn). Given a sorted array
	 * arr[] of n elements, write a function to search a given element x in
	 * arr[].
	 */
	static int recursiveSearch(int arr[], int start, int end, int find) {
		if (start <= end) {
			int i = (start + end) / 2;
			if (arr[i] > find)
				return recursiveSearch(arr, start, i - 1, find);
			else if (arr[i] < find)
				return recursiveSearch(arr, i + 1, end, find);
			else
				return i;
		}
		System.out.println(start + ">>" + end);
		return -1;
	}

	static int iterativeSearch(int arr[], int find) {
		int start = 0;
		int end = arr.length - 1;
		int index = -1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] > find)
				end = mid - 1;
			if (arr[mid] < find)
				start = mid + 1;
			if (arr[mid] == find) {
				index = mid;
				break;
			}
		}
		System.out.println(start + ">>" + end);
		return index;
	}

	public static void main(String args[]) {
		int[] arr = { -1, 2, 3, 5, 6, 8, 9, 10 };
		int find = 7;
		// System.out.println(recursiveSearch(arr, 0, arr.length - 1, find));
		System.out.println(iterativeSearch(arr, find));
	}
}
