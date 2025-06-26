interface Playable{
    public void play();
}
class Football implements Playable{
    public void play(){
        System.out.println("play Football");
    }
}
 class Volleyball implements Playable {
public void play(){
    System.out.println("play volleyball");
}
    
}
class Basketball implements Playable{
    public void play(){
        System.out.println("play baskteball");
    }
}
public class P9c6 {
    public static void main(String[] args) {
        Playable football = new Football();
        Playable volleyball = new Volleyball();
        Playable basketball = new Basketball();
        
        football.play();
        volleyball.play();
        basketball.play();
    }
}
