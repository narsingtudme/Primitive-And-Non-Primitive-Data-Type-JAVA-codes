import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		System.out.println((num%2==0)?"no is even":"no is odd");
}
}