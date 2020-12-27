import java.util.Arrays;

public class InsertionSortAlgo {

	public void getInsertionSort(int array[]) {
		//get length of the array
		int size = array.length;

	    for (int step = 1; step < size; step++) {
	      int key = array[step];
	      int j = step - 1;

	      while (j >= 0 && key < array[j]) {
	        array[j + 1] = array[j];
	        --j;
	      }

	      array[j + 1] = key;
	    }
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int[] data = {9,5,3,6,6,2,10,11,17};
		  InsertionSortAlgo is = new InsertionSortAlgo();
		    is.getInsertionSort(data);
		    System.out.println(Arrays.toString(data));

	}

}
