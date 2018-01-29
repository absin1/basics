/**
 * 
 */
package algorithm.sorting;

import java.util.Arrays;

/**
 * @author absin
 * 
 *         Bubble Sort is the simplest sorting algorithm that works by
 *         repeatedly swapping the adjacent elements if they are in wrong order.
 * 
 *         Steps: Start from beginning, if the order breaks swap the elements,
 *         restart; continue till no swap happens
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 64, 25, 12, 22, 11 };
		// iterative(arr);
		recursive(arr);
	}

	public static void recursive(int[] arr) {
		boolean isSwapRequired = false;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1]) {
				isSwapRequired = true;
				int temp = arr[i];
				arr[i] = arr[i - 1];
				arr[i - 1] = temp;
				break;
			}
		}
		if (isSwapRequired) {
			recursive(arr);
		} else {
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void iterative(int[] arr) {
		boolean isSwapRequired = true;
		while (isSwapRequired) {
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] < arr[i - 1]) {
					isSwapRequired = true;
					int temp = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = temp;
					break;
				}
				isSwapRequired = false;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
