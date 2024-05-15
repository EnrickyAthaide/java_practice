package thread;
class even implements Runnable{
    public void run() {
        for(int i=0;i<=50;i++){
            if (i%2==0){
                System.out.println("even:"+i);
            }
        }
    }
     }
     class odd implements Runnable{
        
        public void run() {
            for(int i=0;i<=50;i++){
                if (i%2!=0){
                    System.out.println("odd:"+i);
                }
            }
        }
         }

public class oddevenimpli {
    public static void main(String[] args) {
        even m1 = new even();
        Thread t1 = new Thread(m1);
        odd m2 = new odd();
        Thread t2 = new Thread(m2);
        t1.start();
        t2.start();
}
}