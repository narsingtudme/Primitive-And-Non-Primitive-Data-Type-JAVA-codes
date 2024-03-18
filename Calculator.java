import java.util.Scanner;
class Calculator{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a num1 :");
		Double num1=sc.nextDouble();
		System.out.println("Enter a opertaion :");
		char op=sc.next().charAt(0);
		System.out.println("Enter a num2 :");
		double num2=sc.nextDouble();
		double output=0;
		boolean flag=true;
		switch(op){
		case '+': output=num1+num2;break;
		case '-': output=num1-num2;break;
		case '*': output=num1*num2;break;
		case '/': output=num1/num2;break;
		case '%': output=num1%num2;break;
		default : System.out.println("INVALID OPERATION");flag=false;
		}
		if(flag){
			System.out.println(num1 + " " + op + " " + num2 + " " + output);
		}
	}
}