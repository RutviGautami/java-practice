import java.util.*;
public class P4a1 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String sentence=sc.nextLine();
        int vowels=0;
        int consonants=0;
        for(int i=0;i<sentence.length();i++){
            char m=sentence.charAt(i);
            if(m=='a'||m=='A'||m=='e'||m=='E'||m=='i'||m=='I'||m=='o'||m=='O'||m=='u'||m=='U'){
                vowels++;
            }
            else if(m==' '){}
            else{
                consonants++;
            }
        }
        System.out.print("vowels: "+vowels);
        System.out.println();
        System.out.print("consonants: "+consonants);
    }
}
