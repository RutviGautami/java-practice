abstract class Vegetable{
    String color;
    public Vegetable(String color){
        this.color=color;
    }
    public String toString(){
        return color;
    }
}
class Potato extends Vegetable{
     Potato(String color){
        super(color);
    }
}
class Brinjal extends Vegetable{
     Brinjal(String color){
        super(color);
    }
}
class Tomato extends Vegetable{
     Tomato(String color){
        super(color);
    }
}

public class P8a1 {
    public static void main(String[] args) {
        Potato p=new Potato("Brown");
        Brinjal b=new Brinjal("Purple");
        Tomato t=new Tomato("Red");

    }
}
