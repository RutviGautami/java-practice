import java.util.Scanner;
interface Shape{
    public void getArea();
}
class Rectangle implements Shape{
    int a;
    int b;
    public Rectangle(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void getArea(){
       System.out.println("area of rectangle  "+(this.a*this.b));
    }
}
class Circle implements Shape{
    double m;
    public Circle(double m){
        this.m=m;
    }
    public void getArea(){
     System.out.println("area of circle :"+(Math.PI*this.m*this.m));
    }
}
class Triangle implements Shape{
    double a;
    double b;
    public Triangle(double a,double b){
        this.a=a;
        this.b=b;
    }
    public void getArea(){
        System.out.println("area of triangle  "+(0.5*this.a*this.b));
    }
}
public class P9b5{
     public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter height and width for rectangle:");
        int a=s.nextInt();
        int b=s.nextInt();
        Shape Ar= new Rectangle(a,b);
        Ar.getArea();
        System.out.println("Enter radius for circle:");
        double r=s.nextDouble();
        Shape Cr= new Circle(r);
        Cr.getArea();
        System.out.println("Enter height and width for triangle:");
        double h=s.nextDouble();
        double w=s.nextDouble();
        Shape Tr= new Triangle(h,w);
        Tr.getArea();

    }
}
