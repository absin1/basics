package algorithm.searching;

/**
 * @author absin
 * 
 *         Given a sorted array of n uniformly distributed values arr[], write a
 *         function to search for a particular element x in the array.
 * 
 *         Exponential search involves two steps:
 * 
 *         Find range where element is present Do Binary Search in above found
 *         range. How to find the range where element may be present? The idea
 *         is to start with subarray size 1 compare its last element with x,
 *         then try size 2, then 4 and so on until last element of a subarray is
 *         not greater.
 * 
 *         Once we find an index i (after repeated doubling of i), we know that
 *         the element must be present between i/2 and i (Why i/2? because we
 *         could not find a greater value in previous iteration)
 * 
 * 
 *         Time Complexity : O(Log n) Auxiliary Space : The above implementation
 *         of Binary Search is recursive and requires O()Log n) space. With
 *         iterative Binary Search, we need only O(1) space.
 * 
 *         Applications of Exponential Search:
 * 
 *         Exponential Binary Search is particularly useful for unbounded
 *         searches, where size of array is infinite. Please refer Unbounded
 *         Binary Search for an example. It works better than Binary Search for
 *         bounded arrays also when the element to be searched is closer to the
 *         first element.
 *
 */
public class ExponenetialSearch {
	public static void main(String args[]) {
		int[] arr = { 1, 2, 3, 5, 6 };
		int find = 5;
		int i = findBinarySearchIndex(arr, find);
		System.out.println(BinarySearch.recursiveSearch(arr, i / 2, i, find));
	}

	private static int findBinarySearchIndex(int[] arr, int find) {
		if (arr[0] == find)
			return 0;
		int i = 1;
		while (i < arr.length - 1 && arr[i] < find) {
			i = i * 2;
		}
		return i;
	}
}
