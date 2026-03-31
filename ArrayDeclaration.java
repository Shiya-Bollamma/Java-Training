package arraydeclaration;
import java.util.Scanner;

public class ArrayDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,8,9,6,89};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if (arr[i]>max) {
				max=arr[i];
				System.out.println(max);
				
			}
	
			
		}

	}

}
