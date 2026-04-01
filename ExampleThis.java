package exampleThis;

public class ExampleThis {
	int rollNo;
	String name;
		ExampleThis(int rollNo,String name){
			this.name=name;
			this.rollNo=rollNo;
		}
		void display() {
		System.out.println("The name is:"+name);
		System.out.println("The rollNo is:"+rollNo);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ExampleThis Student=new ExampleThis(101,"Shiya");
			Student.display();
		}
}
