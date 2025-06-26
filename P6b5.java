import java.util.Scanner;
class Complex{
	int real;
	int img;
	public Complex(){
	    real=0;
		img=0;
	}
	public Complex(int real,int img){
		this.real=real;
		this.img=img;
	}
	public void Sum(Complex t2){
          this.real=this.real+t2.real;
          this.img=t2.img+this.img;
          System.out.println(this.real+"+"+this.img+"i");
	}
}
public class P6b5{
	public static void main(String[]args){
		Scanner s=new Scanner (System.in);
		System.out.print("Enter real and imaginary cofficient for t1: ");
		int real=s.nextInt();
		int img=s.nextInt();
		Complex t1=new Complex(real,img);
		System.out.print("Enter real and imaginary cofficient for t2: ");
		int real2=s.nextInt();
		int img2=s.nextInt();
		Complex t2=new Complex(real2,img2);
		t1.Sum(t2);
	}
}
