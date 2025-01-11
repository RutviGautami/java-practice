import java.util.Scanner;
public class Even
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
        int[] a={1,2,3,4,5};
		for(int j:a){
			if(j%2==0){
				System.out.println("Even");
			}
			else{
				System.out.println("odd");
			}
		}
	}
}