package cat.institutmvm.ui;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;

public class MyEventFrame  extends JFrame{
    public MyEventFrame() {
        //<editor-fold desc="Centrar frame">
        Toolkit screen = Toolkit.getDefaultToolkit();
        Dimension screenSize = screen.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setSize(screenWidth / 2, screenHeight / 2);
        setLocation(screenWidth / 4, screenHeight / 4);
        //</editor-fold>

        this.setTitle("La meva finestra");
        Image myIcon = Toolkit.getDefaultToolkit().getImage("graphics/icon.png");
        setIconImage(myIcon);
        
        //Creem els botons
        JPanel buttons = new JPanel();
        JButton hello = new JButton("Digues Hola");
        JButton bye = new JButton("Digues Adéu");
        buttons.add(hello);
        buttons.add(bye);

        //Creem el camp de text
        JTextField txtOut = new JTextField("Pulsa un botó");

        //Afegim els listeners als components
        hello.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                txtOut.setText("Hola!");
            }
        });
        bye.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                txtOut.setText("Adéu!!!!");
            }
        });

        JSplitPane mainPanel
                = new JSplitPane(JSplitPane.VERTICAL_SPLIT, buttons, txtOut);
        getContentPane().add(mainPanel);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
