package secondjan;
import java.util.*;

public class array {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8};
		System.out.print("Enter the index number: ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		try{
			System.out.println("The element in index " +i  +" is " +a[i]);
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.print("Error: Index out of range!");
		}
			
		}
		
	}

