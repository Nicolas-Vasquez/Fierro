package fierro;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class Terminos extends JFrame implements ActionListener, ChangeListener {

    private JLabel etqIm, etq1;
    private JTextArea txa;
    private JScrollPane scp;
    private JCheckBox chb1;
    private JButton btn1, btn2, btn3;
    private ImageIcon icono;
    private Font fnt1 = new Font("Tahoma", 1, 14);
    private String nya;
    private Usuario userb = new Usuario();

    public Terminos() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Terminos y condiciones");
        icono = new ImageIcon(this.getClass().getResource("images/icono.png"));
        setIconImage(icono.getImage());
        nya = userb.getNombre() + " " + userb.getApellid();

        etqIm = new JLabel(icono);
        etqIm.setBounds(500, 20, 60, 60);
        add(etqIm);

        etq1 = new JLabel("Lea atentamente los terminos y condiciones");
        etq1.setBounds(0, 35, 500, 30);
        etq1.setHorizontalAlignment(SwingConstants.CENTER);
        etq1.setFont(new Font("Tahoma", 1, 16));
        add(etq1);

        txa = new JTextArea();
        txa.setFont(new Font("Andale Mono", 0, 11));
        txa.setText("\n\n          TÉRMINOS Y CONDICIONES\n\n"
                + "          A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DEL AUTOR.\n"
                + "          B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS"
                + " INTERFACES GRÁFICAS.\n"
                + "          C.  EL AUTOR NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE.\n\n"
                + "          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED"
                + " HAGA DE\n"
                + "          ESTE SOFTWARE.\n"
                + "          EL AUTOR NO SE RESPONSABILIZAN DEL USO QUE USTED HAGA CON ESTE SOFTWARE Y SUS\n"
                + "          SERVICIOS. PARA ACEPTAR ESTOS TERMINOS MARQUE EL CASILLERO DE\n"
                + "          (Acepto terminos y condiciones).\n"
                + "          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (Cancelar) Y NO UTILICE"
                + " ESTE SOFTWARE.\n\n"
                + "          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR"
                + " VISITE\n"
                + "          no sabria desirte.");
        txa.setEditable(false);
        scp = new JScrollPane(txa);
        scp.setBounds(20, 100, 550, 270);
        add(scp);
        
        chb1 = new JCheckBox("Yo " + nya + " acepto.");
        chb1.setBounds(20, 375, 300, 30);
        chb1.setFont(fnt1);
        chb1.addChangeListener(this);
        add(chb1);
        
        btn1 = new JButton("Cancelar");
        btn1.setBounds(450, 420, 110, 30);
        btn1.setFont(fnt1);
        btn1.addActionListener(this);
        add(btn1);
                
        btn2 = new JButton("Finalizar");
        btn2.setBounds(320, 420, 110, 30);
        btn2.setEnabled(false);
        btn2.setFont(fnt1);
        btn2.addActionListener(this);
        add(btn2);
        
        btn3 = new JButton("Volver");
        btn3.setBounds(190, 420, 110, 30);
        btn3.setFont(fnt1);
        btn3.addActionListener(this);
        add(btn3);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==btn1){
            PDInicio vent1 = new PDInicio("Fierro");
            vent1.setSize(370, 540);
            vent1.setResizable(false);
            vent1.setLocationRelativeTo(null);
            vent1.setVisible(true);
            this.dispose();           
        }
        if(ae.getSource()==btn2){
            userb.setUsuario();
            JOptionPane.showMessageDialog(null, userb.getMensaje());
            PDInicio vent1 = new PDInicio("Fierro");
            vent1.setSize(370, 540);
            vent1.setResizable(false);
            vent1.setLocationRelativeTo(null);
            vent1.setVisible(true);
            this.dispose();        
        }
        if(ae.getSource()==btn3){
            Registro vent2 = new Registro();
            vent2.setSize(590, 500);
            vent2.setLocationRelativeTo(null);
            vent2.setResizable(false);
            vent2.setVisible(true);
            this.dispose();
        }  
    }

    @Override
    public void stateChanged(ChangeEvent ce) {
        if(chb1.isSelected() == true){
            btn2.setEnabled(true);
        }else{
            btn2.setEnabled(false);            
        }
    }

}
