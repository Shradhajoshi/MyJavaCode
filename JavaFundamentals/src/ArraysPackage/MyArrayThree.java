package ArraysPackage;

/* Search, Insert, and Delete in an sorted Array | Array Operations */

public class MyArrayThree {

	static int binarySearch(int arr[], int n , int key) {
		int left = 0;
		int right = n - 1;
		while(left <= right) {
			int mid = left + (right - left) / 2;
			if(arr[mid] == key) return mid;
			if(arr[mid] > key) 
				right = mid - 1;
			else
				left = mid + 1;
		}

		return -1;
	}

	// Insert at the end.
	static int insertElement(int arr[], int key, int n , int capacity) {

		if (n >= capacity)
			return n;
        int i;
		for (i = n - 1; (i >= 0 && arr[i] > key); i--) 
            arr[i + 1] = arr[i];
		
		arr[i + 1] = key;

		return (n + 1);
	}
	
	static int deleteElement(int arr[], int n, int key)
    {
        int pos = binarySearch(arr, n, key);
 
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
		myArray[0] = 1;
		myArray[1] = 2;
		myArray[2] = 3;
		myArray[3] = 4;
		myArray[4] = 5;
		myArray[5] = 6;
		int found = binarySearch(myArray, 6, 6);
		if (found >= 0) {
			System.out.println("Element found at index: " + found);
		} else {
			System.out.println("Element is not found in the given array. ");
		}
		
		int newSize = insertElement(myArray, 0, 6 ,10);
		for (int i = 0; i < newSize; i++) {
			System.out.print(myArray[i] + " ");
		}
		System.out.println();
		
		int size = deleteElement(myArray, 7 , 2);
		for(int i = 0; i < size; i++) {
			System.out.print(myArray[i] + " ");
		}
		System.out.println();
	}

}
