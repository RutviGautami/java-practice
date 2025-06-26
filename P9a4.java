interface EventListener{
    public void performEvent();
}
interface MouseListener extends EventListener{
    public void mouseClicked();
    public void mousePressed(); 
    public void mouseReleased();
    public void mouseMoved();
    public void mouseDragged();
}
interface KeyListener extends EventListener{
    public void keyPressed();
    public void keyReleased();
}
class EventDemo implements KeyListener,MouseListener{
    public void performEvent(){
        System.out.println("performevent");
    }
    public void mouseClicked(){
        System.out.println("mouseClicked");
    }
    public void mousePressed(){
        System.out.println("mousePressed");
    }
    public void mouseReleased(){
        System.out.println("mouseReleased");
    }
    public void mouseMoved(){
        System.out.println("mouseMoved");
    }
    public void mouseDragged(){
        System.out.println("mouseDragged");
    }
    public void keyPressed(){
        System.out.println("keyPressed");
    }
    public void keyReleased(){
        System.out.println("keyReleased");
    }
}
public class P9a4 {
    public static void main(String[]args){
          EventDemo e=new EventDemo();
          e.performEvent();
          e.mouseClicked();
          e.mousePressed();
          e.mouseReleased();
          e.mouseMoved();
          e.mouseDragged();
          e.keyPressed();
          e.keyReleased();

    }
}
