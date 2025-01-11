import java.util.Scanner;
public class fibo
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int a=s.nextInt();
		System.out.print("Enter 2nd number: ");
		int b=s.nextInt();
		System.out.print("upto: ");
		int n=s.nextInt();
		System.out.print(a+","+b+",");
		for(int i=3;i<=n;i++){
			int c=a+b;
            System.out.print((c)+",");
            a=b;
            b=c;
		}
	}
}