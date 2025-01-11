import java.util.Scanner;
public class p2a3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length: ");
        double l=sc.nextDouble();
        System.out.println();
        System.out.print("Enter breath: ");
        double b=sc.nextDouble();
        double a=l*b;
        System.out.print("Area="+a);
    }
}