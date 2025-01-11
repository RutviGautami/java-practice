import java.util.Scanner;
public class P2c5
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three number: ");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int d=(a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
		System.out.println("Largest: "+d);
	}
}