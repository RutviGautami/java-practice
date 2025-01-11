import java.util.Scanner;
public class RangeLeap
{
	public static void main(String[]args)
	{
		RangeLeap p=new RangeLeap();
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a: ");
		int a=s.nextInt();
		System.out.print("Enter b: ");
		int b=s.nextInt();
		for(int i=a;i<=b;i++){
			p.findLeap(i);
		}
	}
	public void findLeap(int a)
	{
		if(a%400==0){
			if(a%100!=0){
				if(a%4==0){
					System.out.println(a+",");
				}
			}
		}
		
	}
}

