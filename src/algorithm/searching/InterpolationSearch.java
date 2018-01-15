package algorithm.searching;

/**
 * 
 * @author absin Given a sorted array of n uniformly distributed values arr[],
 *         write a function to search for a particular element x in the array.
 * 
 *         Linear Search finds the element in O(n) time, Jump Search takes O(√
 *         n) time and Binary Search take O(Log n) time. The Interpolation
 *         Search is an improvement over Binary Search for instances, where the
 *         values in a sorted array are uniformly distributed. Binary Search
 *         always goes to middle element to check. On the other hand
 *         interpolation search may go to different locations according the
 *         value of key being searched. For example if the value of key is
 *         closer to the last element, interpolation search is likely to start
 *         search toward the end side. To find the position to be searched, it
 *         uses following formula.
 * 
 *         The idea of formula is to return higher value of pos when element to
 *         be searched is closer to arr[hi]. And smaller value when closer to
 *         arr[lo]
 * 
 *         pos = lo + [ (x-arr[lo])*(hi-lo) / (arr[hi]-arr[Lo]) ]
 * 
 *         arr[] ==> Array where elements need to be searched x ==> Element to
 *         be searched lo ==> Starting index in arr[] hi ==> Ending index in
 *         arr[]
 */
public class InterpolationSearch {
	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		int find = 13;
		System.out.println(searchRecursive(arr, find, arr.length - 1, 0));
		System.out.println(searchiterative(arr, find));
	}

	private static int searchiterative(int[] arr, int find) {
		boolean found = false;
		int low = 0;
		int high = arr.length - 1;
		while (!found) {
			int pos = low + (int) Math.floor(
					Math.abs(((double) (find - arr[low]) / (double) (arr[high] - arr[low])) * (double) (high - low)));
			if (arr[pos] > find)
				high = pos - 1;
			else if (arr[pos] < find)
				low = pos + 1;
			else
				return pos;
			if ((pos == low & arr[low] != find) || (pos == high & arr[high] != find))
				found = true;
		}
		return -1;

	}

	private static int searchRecursive(int[] arr, int find, int high, int low) {

		int pos = low + (int) Math.floor(
				Math.abs(((double) (find - arr[low]) / (double) (arr[high] - arr[low])) * (double) (high - low)));
		if ((pos == low & arr[low] != find) || (pos == high & arr[high] != find))
			return -1;
		if (arr[pos] > find)
			return searchRecursive(arr, find, pos - 1, low);
		else if (arr[pos] < find)
			return searchRecursive(arr, find, high, pos + 1);
		else
			return pos;
	}
}
