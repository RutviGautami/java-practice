import java.util.Scanner;
public class P3a1
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter mark out of 100 for sub 1: ");
		double a=s.nextDouble();
		System.out.print("Enter mark out of 100 for sub 2: ");
		double b=s.nextDouble();
		System.out.print("Enter mark out of 100 for sub 3: ");
		double c=s.nextDouble();
		System.out.print("Enter mark out of 100 for sub 4: ");
		double d=s.nextDouble();
		System.out.print("Enter mark out of 100 for sub 5: ");
		double e=s.nextDouble();
		double per=(a+b+c+d+e)/5;
		if(per>=60){
			System.out.println("First division");
		}
		if(per>=50){
			System.out.println("Second division");
		}
		if(per>=40){
			System.out.println("Third division");
		}
        else{
			System.out.println("Fail");
		}
	}
}