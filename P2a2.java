import  java.util.Scanner;
public class P2a2 
{
	public static void main(String[]args)
	{
	    Scanner s = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int a=s.nextInt();
		System.out.print("Enter second number: ");
		int b=s.nextInt();
		System.out.print("Enter first letter of operation: ");
		String str=s.next();
		if(str.equals("a")||str.equals("A")){
			double add=a+b;
		    System.out.println("Addition: "+add);
		}    
		else if(str.equals("s")||str.equals("S")){
			double sub=a-b;
		    System.out.println("Subtraction: "+sub);
		}
		else if(str.equals("m")||str.equals("M")){
			double mul=a*b;
		    System.out.println("Multiplication: "+mul);
		}
		else {
			if(b==0){
				System.out.println("not valid");
			}
			else{
			double div=a/b;
		    System.out.print("Division: "+div);
		   }
		}
	}
}