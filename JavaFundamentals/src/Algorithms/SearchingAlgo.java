package Algorithms;

public class SearchingAlgo {

	/*
	 * In Linear Search Algorithm, Every element is considered as a potential match
	 * for the key and checked for the same. If any element is found equal to the
	 * key, the search is successful and the index of that element is returned. If
	 * no element is found equal to the key, the search yields “No match found”.
	 */

	public int linearSearch(int[] arr, int k) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k) {
				return i;
			}
		}
		return -1;
	}

	/*
	 * Binary Search is defined as a searching algorithm used in a sorted array by
	 * repeatedly dividing the search interval in half. The idea of binary search is
	 * to use the information that the array is sorted and reduce the time
	 * complexity to O(log N).
	 */

	public int binarySearch(int[] arr, int k) {
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == k)
				return mid;
			if (arr[mid] > k) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchingAlgo algo = new SearchingAlgo();
		int[] myArray = { 7, 3, 1, 4, 5, 6, 2 };
		int k = 5;
		// int found = algo.linearSearch(myArray,k);
		int found = algo.binarySearch(myArray, k);
		if (found >= 0) {
			System.out.println("Element found at index: " + found);
		} else {
			System.out.println("Element is not found in the given array. ");
		}
	}

}
