import java.util.Scanner;
class Digit3
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number");
		//int num=sc.nextInt();
		//int num=1234;
		int a=num%10;
		int b=(num/10)%10;
		int c=(num/100)%10;
		int d=(num/1000)%10;
		int sum=a+b+c+d;
		System.out.println(sum);
		



	}
}