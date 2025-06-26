interface A{
    int a=10;
    public void printA();
}
interface A1 extends A{
    int a1=20;
    public void printA1();
}
interface A2 extends A{
    int a2=30;
    public void printA2();
}
interface A12 extends A1,A2{
    int a12=40;
    public void printA12();
}
class B implements A12{
    int b=50;
    public void printA(){
        System.out.println("a="+a);
    }
    public void printA1(){
        System.out.println("a1="+a1);
    }
    public void printA2(){
        System.out.println("a2="+a2);
    }
    public void printA12(){
        System.out.println("a12="+a12);
    }
    public void printB(){
        System.out.println("b="+b);
    }
}
public class P8a2 {
    public static void main(String[]args){
       B b1=new B();
       b1.printA();
       b1.printA1(); 
       b1.printA2(); 
       b1.printA12(); 
       b1.printB(); 
    }
}
