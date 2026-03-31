package student;
import java.util.Scanner;

public class Student {
	
	void Show() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student name:");
		String name=sc.nextLine();
		
		// TODO Auto-generated method stub
		Student s=new Student();
		s.Show();
		

	}

}
