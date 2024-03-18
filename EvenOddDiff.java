 import java.util.Scanner;
 class EvenOddDiff
//we can find even odd without using mod poerator

{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int  num=sc.nextInt();
		//System.out.println(((num/2)*2)==num?"even": "odd");
		System.out.println((num/2.0)==(num/2)?"even":"odd");
	}
}