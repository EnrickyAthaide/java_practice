package applet;

import java.applet.*;
import java.awt.*;

/*<applet code="firstaplet" width="200" height="200"></applet>*/
public class firstaplet extends Applet{
    Label l1 = new Label("helllllllloooooooo");
    TextField t1 =new TextField("enter your name");
    Button b1=new Button("submit");
    Label l2 = new Label("password");
    TextField t2 =new TextField("modafoka");
    Button r1=new Button("reset");
    public void init() {
        add(l1);
        add(t1);
        add(b1);
        add(r1);
        add(l2);
        add(t2);

         

    }
    
}
