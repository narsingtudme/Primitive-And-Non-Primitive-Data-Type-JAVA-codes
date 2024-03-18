import java.util.Scanner;
class Celsius
{
public static void main(String [] args){
 double celsius;
 Scanner sc=new Scanner(System.in);
System.out.println("Enter A Degree In Celsius");
celsius= sc.nextDouble();
 double fara=((9/5)*celsius+32);
 System.out.println(celsius+ " Celsius is :"+fara+" Fahrenhiet");
}
}
