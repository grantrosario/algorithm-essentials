package algo.mergesort;

public class MergeSort {

	public static void sort(int inputArray[]){
		sort(inputArray, 0, inputArray.length - 1);
	}
	
	public static void sort(int inputArray[], int start, int end){
		if(end <= start){
			return;  // done traversing array
		}
		
		int mid = (start + end) / 2;
		sort(inputArray, start, mid); // sort left half
		sort(inputArray, mid + 1, end); // sort right half
		merge(inputArray, start, mid, end); // merge sorted results into the inputArray
	}
	
	public static void merge(int inputArray[], int start, int mid, int end){
		
		int tempArray[] = new int [end - start + 1];
		
		// index counter for left side of array
		int leftSlot = start;
		// index counter for right side of array
		int rightSlot = mid+1;
		int k = 0;
		
		while(leftSlot <= mid && rightSlot <= end){
			if(inputArray[leftSlot] < inputArray[rightSlot]){
				tempArray[k] = inputArray[leftSlot];
				leftSlot++;
			} else {
				tempArray[k] = inputArray[rightSlot];
				rightSlot++;
			}
			k++;
		}
		
		/*
		 * When it get's here, the above loop has completed so both left and right side can be considered sorted
		 */
		
		if(leftSlot <= mid){ // consider the right side done being sorted. Left must already be sorted
			while(leftSlot <= mid){
				tempArray[k] = inputArray[leftSlot];
				leftSlot++;
				k++;
			}
		} else if (rightSlot <= end){
			while(rightSlot <= end){
				tempArray[k] = inputArray[rightSlot];
				rightSlot++;
				k++;
			}
		}
		
		// copy over temp array into correct slots inputArray
		for(int i = 0; i < tempArray.length; i++){
			inputArray[start + i] = tempArray[i];
		}
		
	}
	
}
