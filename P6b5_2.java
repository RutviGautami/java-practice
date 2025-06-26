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
	public int realSum(int num){
          this.real+=num;
          return this.real;
	}
	public int imgSum(int num){
          this.img+=num;
          return this.img;
	}
}
public class P6b5_2{
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
		int real1=t1.realSum(t2.real);
		int img1=t1.imgSum(t2.img);
        System.out.println(real1+"+"+img1+"i");
	}
}
