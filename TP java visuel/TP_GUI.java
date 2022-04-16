// import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.*;

class TP_GUI extends JFrame{

public static void main(String[] args) {
    TP_GUI f = new TP_GUI();
    f.setVisible(true);
}

public TP_GUI() {

    JPanel contentPane = new JPanel();
    setContentPane(contentPane);
    contentPane.setLayout(null);

    JLabel class1 = new JLabel("Classe BTS SN IR ");
    class1.setBounds(250, 75, 250 , 75);
    contentPane.add(class1);

    setSize(600,300);
    setTitle("BTS SN IR");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}


}