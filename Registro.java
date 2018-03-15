package fierro;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Registro extends JFrame implements ActionListener, ItemListener {

    private JLabel etqIm, etq1, etq2, etq3, etq4, etq5, etq6, etq7;
    private JTextField fld1, fld2, fld3, fld4;
    private JComboBox<Object> cmb1, cmb2, cmb3;
    private JPasswordField pfld1, pfld2;
    private JButton btn1, btn2;
    private ImageIcon icono;
    private Font fnt1 = new Font("Tahoma", 1, 14);
    private int dias;
    private boolean cuser;
    private Usuario user1 = new Usuario();

    public Registro() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Registrate a Fierro");
        icono = new ImageIcon(this.getClass().getResource("images/icono.png"));
        setIconImage(icono.getImage());

        etqIm = new JLabel(icono);
        etqIm.setBounds(495, 315, 60, 60);
        add(etqIm);

        etq1 = new JLabel("Nombre: ");
        etq1.setBounds(30, 50, 100, 30);
        etq1.setFont(fnt1);
        add(etq1);

        fld1 = new JTextField();
        fld1.setBounds(100, 50, 170, 27);
        fld1.setFont(fnt1);
        add(fld1);

        etq2 = new JLabel("Apellido: ");
        etq2.setBounds(312, 50, 100, 30);
        etq2.setFont(fnt1);
        add(etq2);

        fld2 = new JTextField();
        fld2.setBounds(380, 50, 170, 27);
        fld2.setFont(fnt1);
        add(fld2);

        etq3 = new JLabel("Correo electronico: ");
        etq3.setBounds(30, 110, 150, 30);
        etq3.setFont(fnt1);
        add(etq3);

        fld3 = new JTextField();
        fld3.setBounds(171, 110, 379, 27);
        fld3.setFont(fnt1);
        add(fld3);

        etq5 = new JLabel("Fecha de nacimiento: ");
        etq5.setBounds(30, 170, 150, 30);
        etq5.setFont(fnt1);
        add(etq5);

        cmb1 = new JComboBox();
        cmb1.setBounds(185, 170, 70, 30);
        cmb1.setBackground(Color.WHITE);
        cmb1.setFont(fnt1);
        cmb1.addItem("");
        for (int i = 1; i < 32; i++) {
            cmb1.addItem(i);
        }
        add(cmb1);

        cmb2 = new JComboBox();
        cmb2.setBounds(275, 170, 70, 30);
        cmb2.setBackground(Color.WHITE);
        cmb2.setFont(fnt1);
        cmb2.addItem("");
        for (int i = 1; i < 13; i++) {
            cmb2.addItem(i);
        }
        cmb2.addItemListener(this);
        add(cmb2);

        cmb3 = new JComboBox();
        cmb3.setBounds(365, 170, 100, 30);
        cmb3.setBackground(Color.WHITE);
        cmb3.setFont(fnt1);
        cmb3.addItem("");
        for (int i = 1900; i < 2019; i++) {
            cmb3.addItem(i);
        }
        add(cmb3);

        etq4 = new JLabel("Nombre de usuario: ");
        etq4.setBounds(38, 230, 150, 30);
        etq4.setFont(fnt1);
        add(etq4);

        fld4 = new JTextField();
        fld4.setBounds(185, 230, 280, 27);
        fld4.setFont(fnt1);
        add(fld4);

        etq6 = new JLabel("Clave: ");
        etq6.setBounds(133, 290, 150, 30);
        etq6.setFont(fnt1);
        add(etq6);

        pfld1 = new JPasswordField();
        pfld1.setBounds(185, 290, 280, 27);
        pfld1.setFont(fnt1);
        add(pfld1);

        etq7 = new JLabel("Confirma tu clave: ");
        etq7.setBounds(50, 350, 150, 30);
        etq7.setFont(fnt1);
        add(etq7);

        pfld2 = new JPasswordField();
        pfld2.setBounds(185, 350, 280, 27);
        pfld2.setFont(fnt1);
        add(pfld2);

        btn1 = new JButton("Cancelar");
        btn1.setBounds(450, 420, 110, 30);
        btn1.setFont(fnt1);
        btn1.addActionListener(this);
        add(btn1);

        btn2 = new JButton("Continuar");
        btn2.setBounds(320, 420, 110, 30);
        btn2.setFont(fnt1);
        btn2.addActionListener(this);
        add(btn2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            PDInicio vent1 = new PDInicio("Fierro");
            vent1.setSize(370, 540);
            vent1.setResizable(false);
            vent1.setLocationRelativeTo(null);
            vent1.setVisible(true);
            this.dispose();
        }
        if (e.getSource() == btn2) {
            cuser = false;
            user1.setNombre(fld1.getText().trim());
            user1.setApellid(fld2.getText().trim());
            user1.setEmail(fld3.getText().trim());
            user1.setDian(cmb1.getSelectedIndex());
            user1.setMesn(cmb2.getSelectedIndex());
            user1.setAnion(cmb3.getSelectedIndex());
            user1.setNomusuario(fld4.getText().trim());
            user1.setClave(pfld1.getText().trim());
            user1.setCclave(pfld2.getText().trim());
            for (int i = 0; i < 10; i++) {
                if (user1.users[i][0] != null) {
                    if (user1.users[i][0].equals(user1.getNomusuario())) {
                        cuser = true;
                        break;
                    }
                }
                System.out.println("Vueltas de iterador: " + i);
            }
            Pattern mptr = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]{2,6})*(\\.[A-Za-z]{2,4})$");
            Matcher mtch = mptr.matcher(user1.getEmail());

            if (user1.getNombre().equals("") || user1.getApellid().equals("") || user1.getEmail().equals("")
                    || user1.getDian() == 0 || user1.getMesn() == 0 || user1.getAnion() == 0
                    || user1.getNomusuario().equals("") || user1.getClave().equals("") || user1.getCclave().equals("")) {
                JOptionPane.showMessageDialog(null, "LLene todos los campos.");
            } else if (!mtch.find()) {
                JOptionPane.showMessageDialog(null, "Correo elctronico invalido.");
            } else if (cuser) {
                JOptionPane.showMessageDialog(null, "El nombre de usuario ya existe. Elija otro.");
            } else if (user1.getClave().length() < 6) {
                JOptionPane.showMessageDialog(null, "La clave debe tener al menos seis caracteres.");
            } else if (!user1.getClave().equals(user1.getCclave())) {
                JOptionPane.showMessageDialog(null, "La clave y su confirmacion no coinciden.");
            } else {
                Terminos vent3 = new Terminos();
                vent3.setSize(590, 500);
                vent3.setLocationRelativeTo(null);
                vent3.setResizable(false);
                vent3.setVisible(true);
                this.dispose();
            }
        }
    }

    @Override
    public void itemStateChanged(ItemEvent ie) { //De acuerdo al mes elgido varia el numero de dias en cmb1.
        if (ie.getSource() == cmb2) {
            int mes = (int) cmb2.getSelectedItem();
            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    dias = (int) cmb1.getItemCount();
                    switch (dias) {
                        case 29:
                            cmb1.addItem(29);
                            cmb1.addItem(30);
                        case 31:
                            cmb1.addItem(31);
                            break;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    dias = cmb1.getItemCount();
                    switch (dias) {
                        case 29:
                            cmb1.addItem(29);
                            cmb1.addItem(30);
                            break;
                        case 32:
                            cmb1.removeItem(31);
                            break;
                    }
                    break;
                case 2:
                    dias = cmb1.getItemCount();
                    switch (dias) {
                        case 31:
                            cmb1.removeItem(29);
                            cmb1.removeItem(30);
                        case 32:
                            cmb1.removeItem(31);
                            break;
                    }
                    break;
            }
        }
    }

}
