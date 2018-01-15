/**
 * 
 */
package algorithm.searching;

/**
 * Like Binary Search, Jump Search is a searching algorithm for sorted arrays.
 * The basic idea is to check fewer elements (than linear search) by jumping
 * ahead by fixed steps or skipping some elements in place of searching all
 * elements.
 * 
 * @author absin
 *
 */
public class JumpSearch {

	/**
	 * What is the optimal block size to be skipped? In the worst case, we have
	 * to do n/m jumps and if the last checked value is greater than the element
	 * to be searched for, we perform m-1 comparisons more for linear search.
	 * Therefore the total number of comparisons in the worst case will be
	 * ((n/m) + m-1). The value of the function ((n/m) + m-1) will be minimum
	 * when m = √n. Therefore, the best step size is m = √n.
	 */
	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610 };
		int jump = (int) Math.sqrt((double) arr.length);
		int find = 55;
		System.out.println(searchIterative(arr, jump, find));
	}

	private static int searchIterative(int[] arr, int jump, int find) {
		int index = -1;
		int i = 0;
		for (; i < arr.length; i += jump) {
			if (find < arr[i])
				break;
		}
		for (int j = i - jump; j < i; j++) {
			if (arr[j] == find) {
				index = j;
				break;
			}
		}
		return index;
	}

}
