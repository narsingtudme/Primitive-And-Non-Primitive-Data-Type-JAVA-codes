import java.util.Scanner;
class EligibleDriving
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		if(age>18){
			System.out.println("Enter your Marks");
			double rto=sc.nextDouble();
			if(rto<60){
				System.out.println("You r not able to drive so give retest of driving");
			}else{
				System.out.println("yes you r able to driving");
			}

		}else{
			System.out.println("you are not able to drive please come after "+ (18-age) +" years");
		}
	}
}