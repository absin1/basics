/**
 * 
 */
/**
 * @author absin
 *
 */
package algorithm.sorting;

/**
 * In Place: An in-place sorting algorithm is called so because it can sort the
 * collection with a constant space overhead (meaning by modifying the input
 * array). Selection and Insertion sort are in-place whereas a typical merge
 * sort is not in-place
 * 
 * Internal vs External Sorting: Suppose we are sorting a collection so huge, it
 * can't fit in the memory, we then need to store the data externally like in a
 * hard drive. Such a sorting methodology is called external sort. Merge sort
 * can be used to do external sorting. On the other hand when all the data can
 * be placed in memory then sorting is called internal sorting.
 * 
 * Stablility in sorting algorithms: When 2 equal elements are not relatively
 * moved while the sorting process, such an algorithm is called a stable sorting
 * algorithm. Meaning when 2 objects with equal values appear in the same order
 * as they are in the input. Stability is important if we are doing subsequent
 * sortings on ebjects with multiple properties. The best example is sorting
 * rows in an excel. If first we sort based on one column which has duplicates,
 * then we perform another sort for some other column a stable sorting will
 * retain the order of the duplicates. Algos such as bubble sort, insertion
 * sort, merge sort, count sort are stable by nature if implmented properly.
 * Quick sort, heap sort are not stable by design but we can modify them to make
 * stable.
 * 
 * Time complexity: In terms of worst time complexities 2 algorithms stand out:
 * Heap sort and Merge sort, with O(n log n) so its of use to understand them
 * deeply. Also there is Radix sort which gives us O(nk), the rest like
 * selection, bubble, quick, bucket fall on their worst scenario to O(n^2)
 * Learning external sort is equally important as it forms the base of huge
 * sorting use cases where RAM falls short
 */