import java.util.Scanner;
class BankAccount{
	int accountNo;
	String userName;
	String email;
	String accountType;
	double accountBalance;
	public void getAccountDetils(int accountNo,String userName,String email,String accountType,double accountBalance){
	       this.accountNo=accountNo;
	       this.userName=userName;
	       this.email=email;
	       this.accountType=accountType;
	       
	}
	public void displayAccountDetails(int accountNo,String userName,String email,String accountType,double accountBalance){
		System.out.println("accountNo:"+accountNo+"\n username:"+userName+"\n email:"+email+"\n accountType:"+accountType+"\n accountBalance:"+accountBalance);
	}
}
public class P6a4{
	public static void main(String[]args){
		Scanner s=new Scanner (System.in);
		BankAccount b1=new BankAccount();
		System.out.println("enter account number:");
		int accountNo=s.nextInt();
		System.out.println("Enter username: ");
		String userName=s.nextLine();
		System.out.println("Enter email: ");
		String email=s.nextLine();
		System.out.println("Enter accountType: ");
		String accountType=s.nextLine();
		System.out.println("Enter accountBalance: ");
        double accountBalance=s.nextDouble();
		b1.getAccountDetils(accountNo,userName,email,accountType,accountBalance);
		b1.displayAccountDetails(accountNo,userName,email,accountType,accountBalance);
    }
} 