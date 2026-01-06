package secondjan;

public class max_Element {
	public static void main(String[] args) {
		int a[] = {1,1,2,5,2,54,72,23};
		int max = a[0];
		for(int i = 1; i<a.length; i++) {
			if(max<a[i]) {
				max = a[i];
			}
			
		}
		System.out.print("The max number is: "+max);
	}

}
