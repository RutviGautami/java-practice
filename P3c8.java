import java.util.Scanner;
public class P3c8
{
	public static void main(String[]args)
	{
		P3c8 p=new P3c8();
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a: ");
		int a=s.nextInt();
		System.out.print("Enter b: ");
		int b=s.nextInt();
		for(int i=a;i<=b;i++){
			p.findPrime(i);
		}
	}
	public void findPrime(int a)
	{
		int count=0;
		for(int j=2;j<a;j++){
			if(a%j==0){
				count=1;
			    break; 
			}
		}
		if(count==0){
				System.out.print(a+",");
		}
	}
}
