import java.util.Scanner;
class LogicalOp2
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num1 :");
		int num1=sc.nextInt();
		System.out.println("Enter a num2 :");
		int num2=sc.nextInt();
		System.out.println((num1>num2)? num2:num1);
		System.out.println((num1>num2)? "no is smaller" +num2 : "no is samller"+num1);
	}
}