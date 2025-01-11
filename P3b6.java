import java.util.Scanner;
public class P3a2
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter year: ");
		double a=s.nextDouble();
		if(a%400==0){
			if(a%100!=0){
				if(a%4==0){
					System.out.println("Is leap Year");
				}
			}
		}
		else{
			System.out.println("Not leap Year");
		}
	}
}