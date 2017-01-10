package algo.binarysearch;

public class App {

	public static void main(String[] args) {
		System.out.println(binarySearch(new int[] {1, 2, 3, 4, 7, 9, 12, 18}, 5 ));
	}
	
	public static int binarySearch(int [] a, int x){
		int p = 0;
		int r = a.length - 1;
	
		while (p <= r){
			
			int q = (p + r) / 2;
			
			if (a[q] > x) r = q - 1; 
			else if (a[q] < x) p = q + 1;
			else return q;
		}
		
		return -1;	
	}

}
