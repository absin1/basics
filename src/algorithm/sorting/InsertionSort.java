/**
 * 
 */
package algorithm.sorting;

import java.util.Arrays;

/**
 * @author absin
 *
 *         Insertion sort is a simple sorting algorithm that works the way we
 *         sort playing cards in our hands.
 * 
 *         Steps: Keep an indicator for the index till which the array is
 *         sorted, if any adjacent element beyond the index are not in ascending
 *         order get the element to the correct location.
 */
public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 64, 25, 12, 22, 11 };
		//iterative(arr);
		recursive(arr, 1);
	}

	public static void recursive(int[] arr, int index) {
		if (index < arr.length) {
			if (arr[index] < arr[index - 1]) {
				int temp = arr[index];
				int j;
				for (j = index - 1; j >= 0; j--)
					if (arr[j] > temp)
						arr[j + 1] = arr[j];
					else
						break;
				arr[j + 1] = temp;
			}
			recursive(arr, index+1);
		} else
			System.out.println(Arrays.toString(arr));
	}

	public static void iterative(int[] arr) {
		for (int i = 1; i < arr.length; i++)
			if (arr[i] < arr[i - 1]) {
				int temp = arr[i];
				int j;
				for (j = i - 1; j >= 0; j--)
					if (arr[j] > temp)
						arr[j + 1] = arr[j];
					else
						break;
				arr[j + 1] = temp;
			}
		System.out.println(Arrays.toString(arr));
	}

}
