/**
 * 
 */
package algorithm.sorting;

import java.util.Arrays;

/**
 * @author absin The selection sort algorithm sorts an array by repeatedly
 *         finding the minimum element (considering ascending order) from
 *         unsorted part and putting it at the beginning. The algorithm
 *         maintains two subarrays in a given array.
 * 
 *         1) The subarray which is already sorted. 2) Remaining subarray which
 *         is unsorted.
 * 
 *         In every iteration of selection sort, the minimum element
 *         (considering ascending order) from the unsorted subarray is picked
 *         and moved to the sorted subarray.
 *
 *
 *         Important thing to note down here is that there is a swapping action
 *         involved between the end of the unsorted array and the minimum
 *         element found. Can you think why?
 *
 */
public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 64, 25, 12, 22, 11 };
		//Iterative(arr);
		recursive(arr, 0);
	}

	public static void recursive(int[] arr, int sortedIndex) {
		int tempMinIndex = sortedIndex;
		for (int i = sortedIndex; i < arr.length; i++) {
			if (arr[tempMinIndex] > arr[i])
				tempMinIndex = i;
		}
		if (sortedIndex < tempMinIndex) {
			int temp = arr[tempMinIndex];
			arr[tempMinIndex] = arr[sortedIndex];
			arr[sortedIndex] = temp;
		}
		if (sortedIndex < arr.length)
			recursive(arr, sortedIndex + 1);
		else{
		System.out.println(Arrays.toString(arr));
			return;
		}
	}

	public static void Iterative(int[] arr) {
		int sortedIndex = 0;
		while (sortedIndex < arr.length) {
			int tempMinIndex = sortedIndex;
			for (int i = sortedIndex; i < arr.length; i++) {
				if (arr[tempMinIndex] < arr[i])
					tempMinIndex = i;
			}
			if (sortedIndex < tempMinIndex) {
				int temp = arr[tempMinIndex];
				arr[tempMinIndex] = arr[sortedIndex];
				arr[sortedIndex] = temp;
			}
			sortedIndex++;
		}
		System.out.println(Arrays.toString(arr));
	}

}
