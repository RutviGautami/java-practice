import java.util.Scanner;
public class P4a3
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
		for(int j=(v-1);j>=0;j--)
		{
		System.out.print(a[j]+",");
        }
    }
}