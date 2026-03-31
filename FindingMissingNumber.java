package findingMissingNumber;

public class FindingMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,5,6};
		int num=1;
		for(int i=0;i<=arr.length;i++) {
			if(arr[i]!=num) {
				System.out.println("missing number is:"+num);
				break;
			}
				num++;
			}
			
		}

	}
