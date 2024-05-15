package lists_maps;

import java.util.ArrayList;

public class listss {
     public static void main(String[] args){
    ArrayList<String> kamu = new ArrayList<>();
    kamu.add("suiiiiii");
    kamu.add("pp");
    kamu.add("gg");
    kamu.add("wp");
    kamu.add("kamoi");
    int c=kamu.size();
    System.out.println("printing the size of the list: "+c);
    String bt= kamu.get(3);
    System.out.println("printing a specific item from the list:"+bt);
    kamu.set(4,"modify kiyela hai:"); //modifying alist item
    System.out.println(kamu);
    }
}
