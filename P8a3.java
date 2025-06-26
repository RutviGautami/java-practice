interface Transport{
    public void deliver();
}
abstract class Animal{
     abstract public void disply();
}
class Tiger extends Animal{
    public void disply(){
        System.out.println("Displayed by tiger");
    }
}
class Deer extends Animal{
    public void disply(){
        System.out.println("Displayed by Deer");
    }
}
class Donkey extends Animal implements Transport{
    public void disply(){
        System.out.println("Displayed by Donkey");
    }
    public void deliver(){
        System.out.println("delivered by donkey");
    }
}
class Camel extends Animal implements Transport{
    public void disply(){
        System.out.println("Displayed by Camel");
    }
    public void deliver(){
        System.out.println("delivered by camel");
    }
}

public class P8a3 {
    public static void main(String[]args){
        Animal[] a=new Animal[4];
        a[0]=new Tiger();
        a[1]=new Deer();
        a[2]=new Donkey();
        a[3]=new Camel();
        a[0].disply();
        a[1].disply();
        a[2].disply();
        a[3].disply();
        ((Transport)a[2]).deliver();
        ((Transport)a[3]).deliver();
    }
    
}
