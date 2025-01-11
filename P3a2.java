import java.util.Scanner;
public class P3a2
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number: ");
		double a=s.nextDouble();
		if(a%2==0){
			System.out.println("Even");
		}
		else{
			System.out.println("odd");
		}
	}
}