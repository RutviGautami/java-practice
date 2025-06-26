import java.util.Scanner;
class Time{
	int hour;
	int minute;
	public Time(int hour,int minute){
		this.hour=hour;
		this.minute=minute;
	}
	public void Sum(int hour,int minute){
          this.hour=this.hour+hour;
          this.minute=minute+this.minute;
          if(this.minute>=60){
          	this.hour=this.hour+1;
          	this.minute=this.minute-60;
          }
          if(this.hour>=24){
          	this.hour-=24;
          }
          System.out.println(this.hour+":"+this.minute);
	}
}
public class P6a2_2{
	public static void main(String[]args){
		Scanner s=new Scanner (System.in);
		System.out.print("Enter hour and minute for t1: ");
		int hour=s.nextInt();
		int minute=s.nextInt();
		Time t1=new Time(hour,minute);
		System.out.print("Enter hour and minute for t2: ");
		int hour2=s.nextInt();
		int minute2=s.nextInt();
		t1.Sum(hour2,minute2);
	}
}