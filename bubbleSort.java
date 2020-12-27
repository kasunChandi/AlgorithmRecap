
public class bubbleSort {
	void bubbleSort(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i = 0; i < n-1; i++) 
			for (int j = 0; j < n-i-1; j++) 
				if (arr[j] > arr[j+1]) 
				{ 
					int temp = arr[j]; 
					arr[j] = arr[j+1]; 
					arr[j+1] = temp; 
				} 
	} 


	void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	} 

	public static void main(String args[]) 
	{ 
		//get length of the array
		bubbleSort bubSor = new bubbleSort(); 
		int arr[] = {54, 43, 25, 13, 32, 11, 91}; 
		bubSor.bubbleSort(arr); 
		System.out.println("Sorted order of the given val  "); 
		bubSor.printArray(arr); 
	} 
}
