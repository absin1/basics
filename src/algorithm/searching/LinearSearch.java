package algorithm.searching;

public class LinearSearch {
	/**
	 * Given an array arr[] of n elements, write a function to search a given
	 * element x in arr[] ** Start from the leftmost element of arr[] and one by
	 * one compare x with each element of arr[] ** If x matches with an element,
	 * return the index. ** If x doesn’t match with any of elements, return -1.
	 */
	static int search(int arr[], int find) {
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == find) {
				index = i;
				break;
			}
		}
		return index;
	}

	public static void main(String args[]) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int find = 4;
		search(arr, find);
	}
}
