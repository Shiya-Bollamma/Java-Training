package stringDemo;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello";
		System.out.println(s1);
		char[] s= {'J','A','V','A'};
		System.out.println(s);
		String s3="Hello World";
		boolean result=s3.contains("World");
		System.out.println(result);
		String s4="Hello World";
		int result1=s4.indexOf('W');
		System.out.println(result1);
		StringBuilder sb=new StringBuilder("hello world");
		sb.append(" world ");
		System.out.println(sb);
		String s6="ABC";
		System.out.println(s6.length());
		

	}

}
