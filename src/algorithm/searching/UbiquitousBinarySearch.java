package algorithm.searching;

public class UbiquitousBinarySearch {

	public static void main(String[] args) {
		int[] arr = { -1, 2, 3, 5, 6, 8, 9, 10 };
		int find = 7;
		System.out.println(returnMaxIndexMatch(arr, 0, arr.length - 1, find) + 1);
	}

	/**
	 * Given an ascending array of N distinct integers, find floor value of
	 * input ‘key’. Say, A = {-1, 2, 3, 5, 6, 8, 9, 10} and key = 7, we should
	 * return 6 as outcome.
	 *
	 */
	public static int returnMaxIndexMatch(int arr[], int start, int end, int find) {
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == find)
				return mid + 1;
			if (arr[mid] > find)
				end = mid - 1;
			else
				start = mid + 1;
		}
		return start < end ? end : start;
	}

	/**
	 * Given a sorted array with possible duplicate elements. Find number of
	 * occurrences of input ‘key’ in log N time.
	 */
	public static int countOccurences(int arr[], int find) {
		int count = 0;
		int start = 0;
		int end = arr.length - 1;
		int mid;
		while ((mid=BinarySearch.recursiveSearch(arr, start, end, find)) != -1) {
			
		}
		return count;
	}
}
