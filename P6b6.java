class Counter{
	static int count=0;
	public Counter(){
		count++;
	}
}
public class P6b6{
	public static void main(String[]args){
		Counter t1=new Counter();
		Counter t2=new Counter();
		Counter t3=new Counter();
		Counter t4=new Counter();
		Counter t5=new Counter();
		Counter t6=new Counter();
		Counter t7=new Counter();
		Counter t8=new Counter();
		Counter t9=new Counter();
		Counter t10=new Counter();
		int count=Counter.count;
        System.out.println("total"+count);    
	}
}