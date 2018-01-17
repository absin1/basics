package algorithm.searching;

/**
 * 
 * @author absin
 *
 *
 *         Given a sorted array arr[] of siz n and an element x to be searched
 *         in it. Return index of x if it is present in array else return -1.
 *         Fibonacci Search is a comparison-based technique that uses Fibonacci
 *         numbers to search an element in a sorted array.
 * 
 *         Similarities with Binary Search:
 * 
 *         Works for sorted arrays || A Divide and Conquer Algorithm. || Has Log
 *         n time complexity.
 * 
 *         Differences with Binary Search:
 * 
 *         Fibonacci Search divides given array in unequal parts || Binary
 *         Search uses division operator to divide range. Fibonacci Search
 *         doesn’t use /, but uses + and -. The division operator may be costly
 *         on some CPUs. || Fibonacci Search examines relatively closer elements
 *         in subsequent steps. So when input array is big that cannot fit in
 *         CPU cache or even in RAM, Fibonacci Search can be useful.
 * 
 *         Algorithm: Let the searched element be x.
 * 
 *         The idea it to first find the smallest Fibonacci number that is
 *         greater than or equal to length of given array. Let the found
 *         fibonacci number be fib (m’th fibonacci number). We use (m-2)’th
 *         Fibonacci number as index (If it is a valid index). Let (m-2)’th
 *         Fibonacci Number be i, we compare arr[i] with x, if x is same, we
 *         return i. Else if x is greater, we recur for subarray after i, else
 *         we recur for subarray before i.
 * 
 *         Below is complete algorithm Let arr[0..n-1] be th input array and
 *         element to be searched be x.
 * 
 *         Find the smallest Fibonacci Number greater than or equal n. Let this
 *         number be fibM [m’th Fibonacci Number]. Let the two Fibonacci numbers
 *         preceding it be fibMm1 [(m-1)’th Fibonacci Number] and fibMm2
 *         [(m-2)’th Fibonacci Number]. While the array has elements to be
 *         inspected: Compare x with the last element of the range covered by
 *         fibMm2 If x matches, return index Else If x is less than the element,
 *         move the three Fibonacci variables two Fibonacci down, indicating
 *         elimination of approximately rear two-third of the remaining array.
 *         Else x is greater than the element, move the three Fibonacci
 *         variables one Fibonacci down. Reset offset to index. Together these
 *         indicate elimination of approximately front one-third of the
 *         remaining array. Since there might be a single element remaining for
 *         comparison, check if fibMm1 is 1. If Yes, compare x with that
 *         remaining element. If match, return index.
 */
public class FibonacciSearch {
	static int[] fib;

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22 };
		int find = 17;
		// First we find the smallest fibonacci number which is greater than the
		// length of the given array let's call it fib[m]
		initFib(arr.length);

		System.out.println(iterative(arr, find, 0, arr.length - 1));
	}

	private static int iterative(int[] arr, int find, int start, int end) {
		// First we find the smallest fibonacci number which is greater than the
		// length of the given array let's call it fib[m]
		int m = findFib(end - start);
		// Next we compare the 'find' against the element in arr at index m-2th
		// fibonacci
		while (end > start) {
			if (find > arr[start + fib[m - 2]])
				// we check in the subarray of arr from index fib[m-2] onward
				start = fib[m - 2];
			else if (find < arr[start + fib[m - 2]])
				// we check in the subarray of arr from beginning index till
				// index fib[m-2]
				end = start + fib[m - 2];
			else
				// our find element is present in the array arr at index
				// fib[m-2]
				return start + fib[m - 2];
			m = findFib(end - start);
		}
		return -1;
	}

	private static int findFib(int i) {
		int j = 0;
		for (; j < fib.length; j++) {
			if (fib[j] > i)
				break;
		}
		return j;
	}

	private static void initFib(int length) {
		fib = new int[length];
		fib[0] = 1;
		fib[1] = 1;
		int index = 1;
		while (fib[index] <= length) {
			fib[index + 1] = fib[index] + fib[index - 1];
			index++;
		}
	}
}
