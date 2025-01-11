import java.util.Scanner;
public class Avg
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three number: ");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		System.out.println("avg= "+((a+b+c)/3.0));
	}
}