class Random extends Thread {
    int e;

    public void run() {
        while (true) {
            this.e = (int) (Math.random() * 100);
            System.out.println(e);
            if (e % 2 == 0) {
                Even e1 = new Even(e);
                e1.start();
            }
            if (e % 2 == 1) {
                Odd o1 = new Odd(e);
                o1.start();
            }
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Even extends Thread {
    int e;

    Even(int e) {
        this.e = e;
    }

    public void run() {
        System.out.println("Even " + (e * e));
    }
}

class Odd extends Thread {
    int e;

    Odd(int e) {
        this.e = e;
    }

    public void run() {
        System.out.println("Odd " + (e * e * e));
    }
}

public class P11b5 {
    public static void main(String[] args) {
        Random r = new Random();
        r.start();

    }
}
