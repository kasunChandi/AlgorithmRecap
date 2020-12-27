
public class bubbleSort {
	void bubbleSort(int arrVal[]) 
	{ 
		int n = arrVal.length; 
		for (int i = 0; i < n-1; i++) 
			for (int j = 0; j < n-i-1; j++) 
				if (arrVal[j] > arrVal[j+1]) 
				{ 
					int temp = arrVal[j]; 
					arrVal[j] = arrVal[j+1]; 
					arrVal[j+1] = temp; 
				} 
	} 


	void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i] + " "); //printed 
		System.out.println(); 
	} 

	public static void main(String args[]) 
	{ 
		//get length of the array
		bubbleSort bubSor = new bubbleSort(); 
		int arrVal[] = {54, 43, 25, 13, 32, 11, 91}; 
		bubSor.bubbleSort(arrVal); 
		System.out.println("Sorted order of the given val  "); 
		bubSor.printArray(arrVal);  //call to printed sorted val
	} 
}
