import java.util.Scanner;
class  
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch=sc.next().charAt(0);
		System.out.println(((ch>=65 && ch<=90) || (ch>=97 && ch<=122))? "Alphabet":"Not an Alphabet");

	}
}