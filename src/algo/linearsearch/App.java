package algo.linearsearch;

public class App {
	
	public static void main(String[] args){
		
	}
	
	public static int linearSearch(int [] a, int x){
		for(int i = 0; i<a.length; i++){
			if(a[i] == x){
				return i;
			}
		}
		return -1;
	}
	
	public static int recursiveLinearSearch(int [] a, int i, int x){
		
		if (i > a.length - 1) return -1;
		else if (a[i] == x) return i;
		else {
			System.out.println("index at: " + i);
			return recursiveLinearSearch(a, i + 1, x);
		}

	}
}
