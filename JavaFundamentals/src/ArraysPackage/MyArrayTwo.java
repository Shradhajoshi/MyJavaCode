package ArraysPackage;

/* Search, Insert, and Delete in an Unsorted Array | Array Operations */

public class MyArrayTwo {

	// search the element in given array

	static int searchElement(int arr[], int n , int key) {
		for (int i = 0; i < n; i++)
			if (arr[i] == key)
				return i;

		return -1;
	}

	// Insert at the end.
	static int insertElementAtEnd(int arr[], int key, int n , int capacity) {

		if (n >= capacity)
			return n;

		arr[n] = key;

		return (n + 1);
	}

	// Insert at any position
	static void insertElementAtPosition(int arr[], int n, int x, int pos) {
		if (n >= arr.length || pos < 0 || pos >= arr.length)
	        return;

	    for (int i = n - 1; i >= pos; i--)
	        arr[i + 1] = arr[i];
	    arr[pos] = x;
	}
	
	static int deleteElement(int arr[], int n, int key)
    {
        int pos = searchElement(arr, n, key);
 
        if (pos == -1) {
            System.out.println("Element not found");
            return n;
        }

        int i;
        for (i = pos; i < n - 1; i++)
            arr[i] = arr[i + 1];
 
        return n - 1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = new int[10];
		myArray[0] = 4;
		myArray[1] = 5;
		myArray[2] = 1;
		myArray[3] = 2;
		myArray[4] = 6;
		myArray[5] = 8;
		int found = searchElement(myArray, 6 , 5);
		if (found >= 0) {
			System.out.println("Element found at index: " + found);
		} else {
			System.out.println("Element is not found in the given array. ");
		}

		int newSize = insertElementAtEnd(myArray, 9, 6 ,10);
		for (int i = 0; i < newSize; i++) {
			System.out.print(myArray[i] + " ");
		}
		System.out.println();
		insertElementAtPosition(myArray, newSize , 7, 4);
		for (int element : myArray) {
			System.out.print(element + " ");
		}
		System.out.println();
		
		int size = deleteElement(myArray, 8 , 2);
		for(int i = 0; i < size; i++) {
			System.out.print(myArray[i] + " ");
		}
		System.out.println();

	}

}
