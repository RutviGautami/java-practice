import java.util.Scanner;
public class P10a1 {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Number of Students");
         try{
           int n=sc.nextInt();
           int[] a=new int[n];
           double b=0;
           double avg;
           for(int i=0;i<10;i++){
            System.out.println("Enter marks of student"+(i+1)+":");
            a[i]=sc.nextInt();
            b=b+a[i];
           }
          avg =  b/n;
          System.out.println("avg:"+avg);
         }
         catch(ArithmeticException e){
            System.err.println("number cannot be 0");
         }
         catch(ArrayIndexOutOfBoundsException f){
            System.err.println("out of bound");
         }
         System.out.println("byyyyyyyyyyyy");
         

    }
    
}
