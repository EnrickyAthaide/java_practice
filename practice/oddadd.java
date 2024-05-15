package practice;

public class oddadd {
        public static void main(String[] args) {
            int sum=0,i=0;
            for(i=0;i<=100;i++){
                if (i%2!=0) {
                    sum+=i;
                }
                
            }
            System.out.println("the sum of all natural odd numbers="+sum); 
            
        }
}
