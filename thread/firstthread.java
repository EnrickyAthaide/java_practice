package thread;

public class firstthread {
    public static void main(String[] args) {
        hii h1 = new hii();
        byee b1 = new byee();
        h1.start();
        b1.start();
    }
}

class hii extends Thread{
@Override
public void run() {
    for(int i=1;i<=10;i++){
        System.out.println("hii");
    }
}
}

class byee extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=20;i++){
            System.out.println("bye");
        }
    }
}