package oops;

public class MethodOverriding {
	int add(int a,int b) {
		int sum=a+b;
		return sum;
	}
	float add(int a,float b) {
		float sum=a+b;
		return sum;
	}
	 double add(double a,int b) {
		double sum=a+b;
		return sum;
	 }

	public static void main(String[] args) {
		MethodOverriding ov=new MethodOverriding();
		ov.add(5,10);
		ov.add(6,2);
		ov.add(4,2);
		System.out.println("The sum is:"+ov.add(5,10));
		System.out.println("The sum is:"+ov.add(6,2.0f));
		System.out.println("The sum is:"+ov.add(4.0,2));
		 }
}
