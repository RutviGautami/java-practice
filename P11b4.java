class Odd implements Runnable{
    public void run(){
        for(int i=1;i<=20;i=i+2){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
class Even implements Runnable{
public void run(){
    for(int i=2;i<=20;i=i+2){
        System.out.println(i);
        try{
            Thread.sleep(1001);
        }catch(Exception e){
             e.printStackTrace();
        }
    }
}
}

public class P11b4{
public static void main(String[] args){
     Thread w=new Thread(new Odd());
     w.start();
     Thread w2=new Thread(new Even());
     w2.start();
}
}
