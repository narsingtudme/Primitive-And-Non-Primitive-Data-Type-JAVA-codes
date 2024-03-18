import java.util.Scanner;
class DonationBlood
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		if(age<20){
			System.out.println("You are not able to donate blood so you will come after" + (20-age) +"Years");
		}else{
			System.out.println("have you consumed alchol or cigar (yes/no) :");
			String nasha=sc.next().toLowerCase();
			if(nasha.equals("no")){
				System.out.println("Enter your Weight :");
				double wght=sc.nextDouble();
				if(wght>=50){
					System.out.println("we can pump your blodd");
				}else
				{
					System.out.println("Go and have some food and increase your weight");
				}
			}else {
				System.out.println("You cannot donate your blood because you r in nasha");
			}
		}
	}
}