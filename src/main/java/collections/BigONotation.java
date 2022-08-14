package collections;

public class BigONotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100000;
		
		
		//O(1)
		int a = n*5;
		
		//O(N)
		for(int i=0; i<n; i++)
			a = 3;
		
		//O(N^2)
		for(int i=0; i<n; i++) //N
			for(int j=0; j<n-100; j++)  //N
				a = 5; //1
		
		permFunc(n);
		
	}
	
	//O(N!)
	static void permFunc(int n) {
		for(int i=0; i<n; i++)
			permFunc(n-1);
	}
	


}
