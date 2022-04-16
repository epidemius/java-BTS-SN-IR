import javax.swing.*;
import java.awt.*;

class Connexion extends JFrame {

    private JPanel pane1, pane2, pane3,c ;
    private JLabel titre1, titre2, icone;
    private Container contentPane;
    private JTextField jTxtField1;
    private JPasswordField jPwdField;
    private JButton jBtnOk, jBtnNon;

    public Connexion() {
        contentPane = getContentPane();
        contentPane.setLayout(null);
        this.setTitle("Sécurité Windows");
        this.setSize(550, 330);
        this.setLocationRelativeTo(getOwner());
        this.setResizable(false);

        //Création des trois panels
        pane1 = new JPanel();
        pane2 =new JPanel();
        pane3 =new JPanel();

        //Annuler la mise en forme automatique des panels
        pane1.setLayout(null);
        pane2.setLayout(null);
        pane3.setLayout(null);

        //Création des labels du panel 1
        titre1 = new JLabel("Authentification réseau");
        titre2 = new JLabel("Veuillez entrer les informations d'identification utilisateur");

        titre1.setFont(new Font("Helvetica", Font.BOLD, 21));
        titre2.setFont(new Font("Helvetica", Font.BOLD, 13));


        //Création du label image pour le panel 2
        String chemin = "C:\\Users\\rllar\\IdeaProjects\\ProjetExemple\\src\\images\\index.jpg";
        icone = new JLabel(new ImageIcon(chemin));

       //Positionnement des trois panels
        pane1.setLocation(0,0);
        pane1.setSize(550,85);

        pane2.setLocation(0,86);
        pane2.setSize(550,125);

        pane3.setLocation(0,126);
        pane3.setSize(550,156);

        pane1.setBackground(Color.CYAN);
        pane2.setBackground(Color.BLUE.darker());
        pane3.setBackground(new Color(199,200,100));

        titre1.setBounds(10, 10, titre1.getPreferredSize().width, titre1.getPreferredSize().height);
        pane1.add(titre1);

        titre2.setBounds(10, 45, titre2.getPreferredSize().width, titre2.getPreferredSize().height);
        pane1.add(titre2);

        icone.setBounds(25,15, 115, 100);
        pane2.add(icone);

        jTxtField1 = new JTextField();
        jTxtField1.setFont(new Font("Helvetica", Font.PLAIN, 19));
        jTxtField1.setBounds(250, 25, 250, 30);
        pane2.add(jTxtField1);

        jPwdField = new JPasswordField();
        jPwdField.setEchoChar('*');
        jPwdField.setFont(new Font("Helvetica", Font.PLAIN, 20));
        jPwdField.setBounds(250, 65, 250, 30);
        pane2.add(jPwdField);

        jBtnOk = new JButton("Valider");
        jBtnNon = new JButton("Annuler");

        pane3.add(jBtnOk);
        jBtnOk.setBounds(180, 100, 150, 40);
        jBtnOk.setFont(new Font("Helvetica", Font.BOLD, 17));

        pane3.add(jBtnNon);
        jBtnNon.setBounds(360, 100, 150, 40);
        jBtnNon.setFont(new Font("Helvetica", Font.BOLD, 17));

        pane1.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
        pane2.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));

        this.contentPane.add(pane1);
        this.contentPane.add(pane2);
        this.contentPane.add(pane3);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}