import java.util.Scanner;
public class P5a5
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=s.nextLine();
		for(int i=0;i<str.length();i++){
		for(int j=0;j<=i;j++){
			System.out.print(str.charAt(j));
		}
            System.out.println();
		}
	}
}