package cat.institutmvm.ui;

import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
   public MyFrame(){
       this.setSize(500,300);
       this.setLocation(500,300);
       this.setBounds(500,300,550,250);//setLocation+setSize
       this.setResizable(false);//ni redimensionar ni maximizar
       this.setExtendedState(Frame.MAXIMIZED_BOTH);
       
       this.setTitle("La meva finestra");
       Image myIcon = Toolkit.getDefaultToolkit().getImage("graphics/icon.png");
       setIconImage(myIcon);
       
       JPanel buttons = new JPanel();
       JButton hello = new JButton("Digues Hola");
       JButton bye = new JButton("Digues Adéu");
       buttons.add(hello);
       buttons.add(bye);

       JTextField txtOut = new JTextField("Pulsa un botó");

       JSplitPane mainPanel =
               new JSplitPane(JSplitPane.VERTICAL_SPLIT,buttons,txtOut);
       getContentPane().add(mainPanel);
       this.setVisible(true);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}
