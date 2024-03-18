import java.util.Scanner;
class Election
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		if(age>=18){
			System.out.println("Do you have a voter Id (yes/no)");
			String voterId=sc.next().toLowerCase();
			if(voterId.equals("yes")){
				System.out.println("********* WELCOME ***********");
				System.out.println("1. BJP");
				System.out.println("2. CONGRESS");
				System.out.println("3. AAP");
				System.out.println("4. MNS");
				System.out.println("5. ShivSena");
				System.out.println("6. NCP");
				System.out.println("7. NOTA");
				System.out.println("Enter the option your fav Party  :");
				String vote=sc.next().toUpperCase();
				if(vote.equals("BJP")){
					System.out.println("YOU HAVE VOTED FOR BJP");
				}else if (vote.equals("CONGRESS")) {
					System.out.println("YOU HAVE VOTED FOR CONGRESS");
				}else if(vote.equals("AAP")){
					System.out.println("YOU HAVE VOTED FOR AAP");
				}else if(vote.equals("MNS")){
					System.out.println("YOU HAVE VOTED FOR MNS");
				}else if(vote.equals("ShivSena")){
					System.out.println("YOU HAVE VOTED FOR SHIVSENA");
				}else if (vote.equals("NCP")) {
					System.out.println("YOU HAVE VOTED FOR NCP");					
				}else if(vote.equals("NOTA")){
					System.out.println("YOU HAVE VOTED FOR NOTA");
				}else {
					System.out.println("You enter wrong option");
				}
		}
	}else{
		System.out.println("You are not mature you can apply after " +(18-age) +"years");
	}
}
}