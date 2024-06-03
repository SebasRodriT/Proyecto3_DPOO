package uniandes.dpoo.galeria.interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

import uniandes.dpoo.galeria.modelo.usuario.Comprador;
import uniandes.dpoo.galeria.persistencia.PersistenciaComprador;


@SuppressWarnings("serial")
public class RegisterPanel extends JPanel {
	
	private JButton signUp;
    private JCheckBox termsConds;
    private JLabel registerLabel;
    private JPanel registerPanel;
    private JPanel datosPanel;
    private JTextField confirmPass;
    private JTextField name;
    private JTextField identificacion;
    private JTextField edad;
    private JTextField usuario;
    private JTextField phone;
    private JTextField email;
    private JTextField pass;
    private ActionListener listener;
    

    public RegisterPanel(ActionListener listener) {
    	this.listener = listener;
        initComponents();
    }

                              
    private void initComponents() {

    	registerPanel = new JPanel();
    	registerLabel = new JLabel();
        datosPanel = new JPanel();
        confirmPass = new JTextField();
        name = new JTextField();
        identificacion = new JTextField();
        edad = new JTextField();
        usuario = new JTextField();
        phone = new JTextField();
        email = new JTextField();
        pass = new JTextField();
        termsConds = new JCheckBox();
        signUp = new JButton();

        this.setLayout(new AbsoluteLayout());

        registerPanel.setBackground(new Color(0, 153, 204));
        registerPanel.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
        registerPanel.setLayout(new AbsoluteLayout());

        registerLabel.setFont(new Font("Comic Sans MS", 0, 36)); 
        registerLabel.setForeground(new Color(255, 255, 255));
        registerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        registerLabel.setText("Register");
        registerPanel.add(registerLabel, new AbsoluteConstraints(100, 10, 210, 50));

        this.add(registerPanel, new AbsoluteConstraints(0, 0, 420, 80));

        datosPanel.setBackground(new Color(0, 51, 102));
        datosPanel.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
        datosPanel.setLayout(new AbsoluteLayout());

        confirmPass.setText("Confirm Password");
        confirmPass.setToolTipText("");
        confirmPass.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        
        datosPanel.add(confirmPass, new AbsoluteConstraints(70, 360, 272, 33));

        name.setText("Enter Full Name");
        name.setToolTipText("");
        name.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        
        datosPanel.add(name, new AbsoluteConstraints(70, 10, 272, 33));

        identificacion.setText("Enter Number ID");
        identificacion.setToolTipText("");
        identificacion.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        
        datosPanel.add(identificacion, new AbsoluteConstraints(70, 60, 272, 33));

        edad.setText("Enter Age");
        edad.setToolTipText("");
        edad.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        
        datosPanel.add(edad, new AbsoluteConstraints(70, 110, 272, 33));

        usuario.setText("Enter UserName");
        usuario.setToolTipText("");
        usuario.setBorder(new SoftBevelBorder(BevelBorder.RAISED));

        datosPanel.add(usuario, new AbsoluteConstraints(70, 160, 272, 33));

        phone.setText("Enter Number Phone");
        phone.setToolTipText("");
        phone.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
      
        datosPanel.add(phone, new AbsoluteConstraints(70, 210, 272, 33));

        email.setText("Enter Email");
        email.setToolTipText("");
        email.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        
        datosPanel.add(email, new AbsoluteConstraints(70, 260, 272, 33));

        pass.setText("Enter Password");
        pass.setToolTipText("");
        pass.setBorder(new SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        
        datosPanel.add(pass, new AbsoluteConstraints(70, 310, 272, 33));

        termsConds.setForeground(new Color(255, 255, 255));
        termsConds.setText("I agree with terms and conditions");
       
        datosPanel.add(termsConds, new AbsoluteConstraints(90, 420, -1, -1));

        signUp.setBackground(new Color(0, 153, 204));
        signUp.setFont(new Font("Comic Sans MS", 0, 18));
        signUp.setForeground(new Color(255, 255, 255));
        signUp.setText("Sign Up");
        signUp.setActionCommand("COMPRADOR");
        signUp.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
                String nombre = name.getText();
                
                String id = identificacion.getText();
                long identificacion = Long.parseLong(id);
                
                String age = edad.getText();
                int edad = Integer.parseInt(age);
                
                String user = usuario.getText();
                
                String contraseña = pass.getText();
                
                String numeroTelefono = phone.getText();
                
                String correo = email.getText();
                int saldo = 0;
                
                String conpass = confirmPass.getText();
                
                if (conpass.equals(contraseña) && termsConds.isSelected()) {
                	Comprador nuevoComprador = new Comprador(nombre, identificacion, edad, user, contraseña, numeroTelefono,correo,saldo);
                	PersistenciaComprador.guardarComprador(nuevoComprador);
                	signUp.addActionListener(listener);
        			
                }
                else if (termsConds.isSelected() == false){
                	JOptionPane.showMessageDialog(null, "Debes aceptar los términos y condiciones.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else {
                	JOptionPane.showMessageDialog(null, "Contraseñas no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
                }
        	}
          
        });
        datosPanel.add(signUp, new AbsoluteConstraints(130, 460, 120, 50));

        this.add(datosPanel, new AbsoluteConstraints(0, 80, 420, 560));

        
    }                                        
            

}
