import java.util.Scanner;
class LogicalOperator
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=sc.nextInt();
		System.out.println((num%2==0)? num + " number is even " : num+ " number is odd");
		
	}
}