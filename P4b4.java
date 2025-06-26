import java.util.Scanner;
public class P4b4{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        String name =s.nextLine();
        int a=name.length();
        for(int i=(a/2);i<a;i++)
        {    
            if(name.charAt(i)==' '){
            }
            else{
            System.out.print(name.charAt(i));
            }
        }
    }
}