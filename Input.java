import  java.util.Scanner;
public class Input 
{
	public static void main(String[]args)
	{
	    Scanner s = new Scanner(System.in);
		System.out.print("Enter a : ");
		int a=s.nextInt();
		System.out.print("Enter b : ");
		int b=s.nextInt();
		System.out.println("addition : "+(a+b));
	}
}