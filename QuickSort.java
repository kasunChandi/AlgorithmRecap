import java.util.Arrays;

public class QuickSort {
	 int partition(int array[], int low, int high) {

		    int pivot = array[high];
		    int i = (low - 1);

		    for (int j = low; j < high; j++) {
		      if (array[j] <= pivot) {
		        i++;
		        int temp = array[i];
		        array[i] = array[j];
		        array[j] = temp;
		      }
		    }
		    int temp = array[i + 1];
		    array[i + 1] = array[high];
		    array[high] = temp;
		    return (i + 1);
		  }
	
	public void sorting(int[]array, int lowV, int highV) {
		 if (lowV < highV) {

		      int pi = partition(array, lowV, highV);
		      
		      sorting(array, lowV, pi - 1);

		      sorting(array, pi + 1, highV);
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   int[] data = {5,2,1,8,6,0,7, 7,10};
		    int size = data.length;
		    QuickSort qs = new QuickSort();
		    qs.sorting(data, 0, size - 1);
		    System.out.println(Arrays.toString(data));
		
	}

}
