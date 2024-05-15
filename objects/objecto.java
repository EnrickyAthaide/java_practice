package objects;

class giga{
    private int a,b,c,d,e;

     void suii(int a, int b,int c,int d, int e){
        System.out.println("average of 5 numbers:"+((a+b+c+d+e)/5));

    }
    void suii(String b){
        System.out.println("average of 5 numbers:"+b);
        
    }
    giga(String b){
        System.out.println("average of 5 numbers:"+b);
        
    }
    giga(int a, int b,int c,int d, int e){
        System.out.println("average of 5 numbers:"+((a+b+c+d+e)/5));

}
}

public class objecto {
    public static void main(String[] args){
        giga niga=new giga(1,3,4,6,5);
        niga.suii(4,5,2,6,7);
        niga.suii("sagar");
        giga miga=new giga("mohit rohit suiiii");
       
       
    }
}

