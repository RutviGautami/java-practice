import java.util.Scanner;
public class P4a2
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter size of arry: ");
		int v=s.nextInt();
		int[] a=new int[v];
		for(int i=0;i<v;i++)
		{
		System.out.print("Enter element"+(i+1)+": ");
		  a[i]=s.nextInt();
		}
		int sum=0;
		for(int j=0;j<v;j++)
		{
           sum=sum+a[j];
		}
		System.out.println("avg="+((double)sum/v));
	}
}