package secondjan;
import java.util.Arrays;

public class kthSmallestArray {
	    public static void main(String[] args) {
	        int a[] = {7, 10, 4, 3, 20, 15};
	        int k = 3;

	        Arrays.sort(a);

	        System.out.println("Kth smallest element is: " + a[k - 1]);
	    }
	}



