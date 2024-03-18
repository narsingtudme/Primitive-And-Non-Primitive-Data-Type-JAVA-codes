import java.util.Scanner;
class Army
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		if(age>18){
			System.out.println("Enter your height");
			double hght=sc.nextDouble();
			if(hght>162){
				System.out.println("Enter your weight");
				double wght=sc.nextDouble();
			if(wght>56){
				System.out.println("Yes u can join army");
			}else {
				System.out.println("Go and increase your weight");
			}
}else{
	System.out.println("Increase your height");
}
		}else{
			System.out.println("You r not able to join army come after " +(18-age) +" Years");
		}
	}
}