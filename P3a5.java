import java.util.Scanner;
public class P3a5
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number: ");
		double a=s.nextDouble();
		int count=0;
		for(int i=2;i<a;i++){
			if(a%i==0){
			System.out.println("is not prime");
			    count=1;
			    break; 
			}
		}
		if(count==0){
			System.out.println("is prime");
		}
	}
}