package objects;

class outer{
    int a,b;
    void display(){
    inner access=new inner();
    access.add();
}
    class inner{
        int c=3,d=6;
        void add(){
            if(c>d){
                System.out.println("c is greater than d");
            }
            else{
                System.out.println("d is greater than c");
        }
    }
}
}

public class nestedclass {
    public static void main(String[] args) {
        outer print=new outer();
        print.display();
    }
    
}
