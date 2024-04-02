package ArraysPackage;

import java.util.Arrays;
import java.util.Stack;

/* Given an array (or string), the task is to reverse the array/string. */

public class MyArrayOne {

	// 1. Array Reverse Using an Extra Array (Non In-place)

	public static void reverseArrayUsingExtraArray(int[] arr) {
		int[] reveredArray = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			reveredArray[i] = arr[arr.length - 1 - i];
		}
		System.out.println("The reversed array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(reveredArray[i] + " ");
		}
		System.out.println();
	}

	// 2. Array Reverse Using a Loop (In-place)

	public static void reverseArray(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}

		System.out.println("The reversed array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// 3. Array Reverse Recursion

	static void recursiveReverseArrayHelper(int arr[], int start, int end) {
		int temp;
		if (start >= end)
			return;
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		recursiveReverseArrayHelper(arr, start + 1, end - 1);
	}

	static void recursiveReverseArray(int arr[]) {
		recursiveReverseArrayHelper(arr, 0, arr.length - 1);
		System.out.println("The reversed array is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// using stack
	static void reverseArrayUsingStack(int[] arr) {
		Stack<Integer> myStack = new Stack<>();
		for (int element : arr) {
			myStack.push(element);
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = myStack.pop();
		}
		System.out.println("The reversed array is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = { 4, 5, 1, 2, 6, 8 };
		// reverseArrayUsingExtraArray(myArray);
		// reverseArray(myArray);
		//recursiveReverseArray(myArray);
		reverseArrayUsingStack(myArray);

	}

}
