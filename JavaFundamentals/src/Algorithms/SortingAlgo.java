package Algorithms;

import java.util.Arrays;

public class SortingAlgo {

	/*
	 * > In Bubble Sort algorithm, traverse from left and compare adjacent elements
	 * and the higher one is placed at right side. In this way, the largest element
	 * is moved to the rightmost end at first. This process is then continued to
	 * find the second largest and place it and so on until the data is sorted.
	 */
	public void bubbleSort(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	/*
	 * > To sort an array of size N in ascending order iterate over the array and
	 * compare the current element (key) to its predecessor, if the key element is
	 * smaller than its predecessor, compare it to the elements before. Move the
	 * greater elements one position up to make space for the swapped element.
	 */

	public void insertionSort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int temp = nums[i];
			int j = i - 1;
			while (j > -1 && temp < nums[j]) {
				nums[j + 1] = nums[j];
				nums[j] = temp;
				j--;
			}
		}
	}

	/*
	 * > The algorithm repeatedly selects the smallest (or largest) element from the
	 * unsorted portion of the list and swaps it with the first element of the
	 * unsorted part. This process is repeated for the remaining unsorted portion
	 * until the entire list is sorted.
	 */

	public void selectionSort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] < nums[minIndex]) {
					minIndex = j;
				}
			}
			if (i != minIndex) {
				int temp = nums[i];
				nums[i] = nums[minIndex];
				nums[minIndex] = temp;
			}
		}

	}

	private int[] merge(int[] arr1, int[] arr2) {
		int[] combined = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				combined[k] = arr1[i];
				i++;
			} else {
				combined[k] = arr2[j];
				j++;
			}
			k++;
		}
		while (i < arr1.length) {
			combined[k] = arr1[i];
			i++;
			k++;
		}
		while (j < arr2.length) {
			combined[k] = arr2[j];
			j++;
			k++;
		}

		return combined;
	}

	/*
	 * Merge sort is defined as a sorting algorithm that works by dividing an array
	 * into smaller subarrays, sorting each subarray, and then merging the sorted
	 * subarrays back together to form the final sorted array.
	 */

	public int[] mergeSort(int[] arr) {
		if (arr.length == 1)
			return arr;
		int midIndex = arr.length / 2;
		int[] left = mergeSort(Arrays.copyOfRange(arr, 0, midIndex));
		int[] right = mergeSort(Arrays.copyOfRange(arr, midIndex, arr.length));
		return merge(left, right);
	}

	private void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

	private int pivotElement(int[] array, int pivotIndex, int endIndex) {

		int swappedIndex = pivotIndex;
		for (int i = pivotIndex + 1; i <= endIndex; i++) {
			if (array[i] < array[pivotIndex]) {
				swappedIndex++;
				swap(array, swappedIndex, i);
			}
		}
		swap(array, pivotIndex, swappedIndex);

		return swappedIndex;
	}

	private void quickSortHelper(int[] arr, int left, int right) {

		if (left < right) {
			int pivotIndex = pivotElement(arr, left, right);
			quickSortHelper(arr, left, pivotIndex - 1);
			quickSortHelper(arr, pivotIndex + 1, right);
		}

	}

	/*
	 * QuickSort is a sorting algorithm based on the Divide and Conquer algorithm
	 * that picks an element as a pivot and partitions the given array around the
	 * picked pivot by placing the pivot in its correct position in the sorted
	 * array.
	 */

	public void quickSort(int[] arr) {
		quickSortHelper(arr, 0, arr.length - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortingAlgo algo = new SortingAlgo();
		int[] myArray = { 7, 3, 1, 4, 5, 6, 2 };
		algo.bubbleSort(myArray);
		algo.insertionSort(myArray);
		algo.selectionSort(myArray);
		algo.quickSort(myArray);
		for (int val : myArray) {
			System.out.print(val + " ");
		}
		System.out.println();
		int[] result = algo.mergeSort(myArray);

		for (int val : result) {
			System.out.print(val + " ");
		}

	}

}
