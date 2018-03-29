package fierro;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Nicolaás Vasquez
 */
public class PDInicio extends JFrame implements ActionListener {

    private JLabel etqIm, etq1, etq2;
    private JTextField fild1;
    private JPasswordField fild2;
    private JButton btn1, btn2;
    private String usr, clv;
    private ImageIcon logo, icono;
    private boolean cusr, cclv;

    public PDInicio(String titulo) {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle(titulo);
        icono = new ImageIcon(this.getClass().getResource("images/icono.png"));
        setIconImage(icono.getImage());

        URL URLlogo = this.getClass().getResource("images/logo.png");
        getContentPane().setBackground(new Color(25, 25, 80));
        logo = new ImageIcon(URLlogo);
        etqIm = new JLabel(logo);
        etqIm.setBounds(0, 25, 360, 250);
        add(etqIm);

        etq1 = new JLabel("Usuario: ");
        etq1.setBounds(30, 300, 100, 30);
        etq1.setForeground(Color.LIGHT_GRAY);
        etq1.setFont(new Font("Tahoma", 1, 14));
        add(etq1);

        etq2 = new JLabel("Clave: ");
        etq2.setBounds(44, 340, 100, 30);
        etq2.setForeground(Color.LIGHT_GRAY);
        etq2.setFont(new Font("Tahoma", 1, 14));
        add(etq2);

        fild1 = new JTextField();
        fild1.setBounds(100, 300, 170, 27);
        fild1.setBackground(new Color(230, 230, 250));
        fild1.setFont(new Font("Tahoma", 1, 12));
        add(fild1);

        fild2 = new JPasswordField();
        fild2.setBounds(100, 340, 170, 27);
        fild2.setBackground(new Color(230, 230, 250));
        fild2.setFont(new Font("Tahoma", 1, 12));
        add(fild2);

        btn1 = new JButton("Entrar");
        btn1.setBounds(135, 455, 100, 30);
        btn1.setBackground(new Color(25, 25, 80));
        btn1.setForeground(Color.LIGHT_GRAY);
        btn1.setFont(new Font("Tahoma", 1, 14));
        btn1.addActionListener(this);
        add(btn1);

        btn2 = new JButton("No estoy registrado");
        btn2.setBounds(95, 375, 180, 20);
        btn2.setBackground(new Color(25, 25, 80));
        btn2.setBorderPainted(false);
        btn2.setForeground(Color.LIGHT_GRAY);
        btn2.setFont(new Font("Tahoma", 1, 12));
        btn2.addActionListener(this);
        add(btn2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            UsoUsuarios lista1 = new UsoUsuarios();
            usr = fild1.getText().trim();
            clv = fild2.getText().trim();
            cusr = cclv = false;
            for (int i = 0; i < lista1.getTamano() && !cusr && !cclv; i++) {
                if (usr.equals(lista1.getNombreUsuario(i))) {
                    cusr = true;
                    if (clv.equals(lista1.getClave(i))) {
                        cclv = true;
                    }
                }
            }
            
            if (usr.equals("") || clv.equals("")) {
                JOptionPane.showMessageDialog(null, "Ingrese su Usuario y su Clave.");

            } else if (cusr) {
                if (cclv) {
                    System.out.println("Ingresó");
                    System.exit(0);

                } else {
                    JOptionPane.showMessageDialog(null, "Clave incorrecta.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario inexistente.");
            }

        }
        if (e.getSource() == btn2) {
            Registro vent2 = new Registro();
            vent2.setSize(590, 500);
            vent2.setLocationRelativeTo(null);
            vent2.setResizable(false);
            vent2.setVisible(true);
            this.dispose();
        }
    }

    public static void main(String[] args) {

        PDInicio vent1 = new PDInicio("Fierro");
        vent1.setSize(370, 540);
        vent1.setResizable(false);
        vent1.setLocationRelativeTo(null);
        vent1.setVisible(true);

    }
}
