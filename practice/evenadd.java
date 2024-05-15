package practice;

public class evenadd {
    public static void main(String[] args) {
        int num=0,i=0;
        for(i=0;i<=100;i++){
            if (i%2==0) {
                System.out.println(i);
                num+=i;
            }
            
        }
        System.out.println(num); 
        
    }

}

