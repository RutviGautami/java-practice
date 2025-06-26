class Wish1 implements Runnable{
        public void run(){
            while(true){
                System.out.println("Good Morning");
                try{
                    Thread.sleep(1000);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
}
class Wish2 implements Runnable{
    public void run(){
        while(true){
            System.out.println("Good afternoon");
            try{
                Thread.sleep(3000);
            }catch(Exception e){
                 e.printStackTrace();
            }
        }
    }
}

public class P11a2{
    public static void main(String[] args){
         Thread w=new Thread(new Wish1());
         w.start();
         Thread w2=new Thread(new Wish2());
         w2.start();
    }
}