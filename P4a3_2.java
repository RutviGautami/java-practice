import java.util.Scanner;
public class P4a3_2
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
		for(int j=0;j<(v/2);j++){
			int b=v-j-1;
		   a[j]=a[b]+a[j];
		   a[b]=a[j]-a[b];
		   a[j]=a[j]-a[b];
		}
		for(int k=0;k<v;k++)
		{
		System.out.print(a[k]+",");
		}
    }
}