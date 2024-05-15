package thread;

/**
 * oddeven
 */class even extends Thread{
@Override
public void run() {
    for(int i=0;i<=100;i++){
        if (i%2==0){
            System.out.println("even:"+i);
        }
    }
}
 }
 class odd extends Thread{
    @Override
    
    public void run() {
        for(int i=0;i<=100;i++){
            if (i%2!=0){
                System.out.println("odd:"+i);
            }
        }
    }
     }
public class oddeven {
    public static void main(String[] args) {
        even m1 = new even();
        odd m2 = new odd();
        m1.start();
        m2.start();

    }
}
