import java.util.Scanner;
class Time{
	static int hour;
	static int minute;
	public Time(int hour,int minute){
		this.hour=hour;
		this.minute=minute;
	}
	public void Sum(Time t2){
          this.hour=this.hour+t2.hour;
          this.minute=t2.minute+this.minute;
          if(this.minute>=60){
          	this.hour=this.hour+1;
          	this.minute=this.minute-60;
          }
          System.out.println(this.hour+":"+this.minute);
	}
}
public class P6c7{
	public static void main(String[]args){
		Scanner s=new Scanner (System.in);
		System.out.print("Enter hour and minute for t1: ");
		int hour=s.nextInt();
		int minute=s.nextInt();
		Time t1=new Time(hour,minute);
		System.out.print("Enter hour and minute for t2: ");
		int hour2=s.nextInt();
		int minute2=s.nextInt();
		Time t2=new Time(hour2,minute2);
		t1.Sum(t2);
	}
}