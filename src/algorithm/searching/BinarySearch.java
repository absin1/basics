package algorithm.searching;

public class BinarySearch {
	/**
	 * The idea of binary search is to use the information that the array is
	 * sorted and reduce the time complexity to O(Logn). Given a sorted array
	 * arr[] of n elements, write a function to search a given element x in
	 * arr[].
	 */
	static int search(int arr[], int start, int end, int find) {
		if (start <= end) {
			int i = (start + end) / 2;
			if (arr[i] > find)
				return search(arr, start, i - 1, find);
			else if (arr[i] < find)
				return search(arr, i + 1, end, find);
			else
				return i;
		}
		return -1;
	}

	public static void main(String args[]) {
		int[] arr = { 1, 2, 3, 5, 6 };
		int find = 4;
		System.out.println(search(arr, 0, arr.length - 1, find));
	}
}
