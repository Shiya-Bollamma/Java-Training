package NestedIf;
public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=80;
		if(marks>=35) {
			if(marks>=80) {
				System.out.println("A");
			}
			else {
				System.out.println("B");
			}
		}else {
				System.out.println("Fail");
		}
	}
}