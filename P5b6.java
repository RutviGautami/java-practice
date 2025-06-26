import java.util.Scanner;
public class P5b6
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=s.nextInt();
		for (int i = 1; i <= n; i++)
    {
        for (int k = 1; k <= n - i; k++)
        {
           System.out.print(" ");
        }
        for (int j = 1; j <= i; j++)
        {
           System.out.print("* ");
        }
           System.out.println();
    }
    for (int l = (n-1); l >= 1; l--)
    {
        for (int m = 1; m <= n - l; m++)
        {
           System.out.print(" ");
        }
        for (int p = 1; p <= l; p++)
        {
           System.out.print("* ");
        }
           System.out.println();
    }
	}
}