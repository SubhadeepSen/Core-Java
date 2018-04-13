package parallelArraySorting;

import java.util.Arrays;

/*Arrays.sort() is used when the number elements are less but if the number of elements are large enough then we should 
use Arrays.parallelSort() method
 */

public class ParallelArraySortingExample {

	public static void main(String[] args) {
		/*String[] names = {"Sunny", "Subha", "Deep", "Subhadeep", "Diana"};
		
		//Sorting using previous sort method
		Arrays.sort(names);
		for (String name : names) {
			System.out.println(name);
		}
		
		//Sorting using newly added parallelSort method in Java 8
		Arrays.parallelSort(names);
		for (String name : names) {
			System.out.println(name);
		}*/
		
		parallelSortMethod();
		normalSortMethod();
	}

	private static void parallelSortMethod() {
		System.out.println("==========Parallel Sort Method==========");
		int[] loopValue = {10000, 100000, 1000000, 10000000};
		int k = 0;
		int arr[] = null;
		for (int i = 0; i < loopValue.length; i++) {
			arr = new int[loopValue[i]];
			k = 0;
			for (int j = loopValue[i]; j >0; j--) {
				arr[k] = j;
				k++;
			}
			long startTime = System.currentTimeMillis();
			Arrays.parallelSort(arr);
			long endTime = System.currentTimeMillis();
			System.out.println(loopValue[i] + " : " + (endTime - startTime));
		}
		
		/*Note: when the number of elements are large enough parallel sort is advantageous since it takes 
		less time due to involvement of multiple threads but you may run out of heap memory. For example:
		add 100000000 value in the array to get out of heap exception*/
	}
	
	private static void normalSortMethod() {
		System.out.println("==========Old Sort Method==========");
		int[] loopValue = {10000, 100000, 1000000, 10000000, 100000000};
		int k = 0;
		int arr[] = null;
		for (int i = 0; i < loopValue.length; i++) {
			arr = new int[loopValue[i]];
			k = 0;
			for (int j = loopValue[i]; j >0; j--) {
				arr[k] = j;
				k++;
			}
			long startTime = System.currentTimeMillis();
			Arrays.sort(arr);
			long endTime = System.currentTimeMillis();
			System.out.println(loopValue[i] + " : " + (endTime - startTime));
		}
		
		/*Note: This sort method uses single thread for sorting hence it takes more time but there is no exception
		 as out of heap. */
	}

}
