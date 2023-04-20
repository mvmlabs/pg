package cat.institutmvm.guiproject.app;

import cat.institutmvm.ui.MyEventFrame;
import cat.institutmvm.ui.MyFrame;

public class Application {
    public static void main(String[] args) {
        //no és correcte, perquè la finestra no es pot tancar i queda executant-se
        /*JFrame window;
        window = new JFrame();
        window.setBounds(0, 0, 300, 400);
        window.setTitle("Primera Finestra en Java");
        window.setVisible(true);*/
        
        //var frm = new MyFrame();
        
        var efrm = new MyEventFrame();
    }  
}

