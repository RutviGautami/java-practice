import java.util.Scanner;
public class P2a4
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter temp in farenhait: ");
        double f=s.nextInt();
		double c = f-32*5/9;
		System.out.println("celcius="+c);
	}
}