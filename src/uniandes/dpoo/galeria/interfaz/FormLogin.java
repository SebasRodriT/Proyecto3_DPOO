package uniandes.dpoo.galeria.interfaz;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

import uniandes.dpoo.galeria.modelo.usuario.Comprador;
import uniandes.dpoo.galeria.persistencia.PersistenciaComprador;


@SuppressWarnings("serial")
public class FormLogin extends JPanel {
	
	private JButton signUp;
    private JLabel labelIconX;
    private JLabel titleLoginLabel;
    private JLabel msgBienvenidaLabel2;
    private JLabel msgBienvenidaLabel1;
    private JLabel labelPassword;
    private JLabel labelIngresa;
    private JLabel labelUsername;
    private JLabel iconLabel;
    private JButton jButton1;
    private JPanel panelBienvenida;
    private JPasswordField jPasswordField1;
    private JTextField campoUsername;
    private ActionListener listener;
    private VistaPrincipal padre;
   
   
    public FormLogin(ActionListener listener, VistaPrincipal padre) {
    	this.padre = padre;
    	this.listener = listener;
        initComponents();
    }

                            
    @SuppressWarnings("deprecation")
	private void initComponents() {

    	panelBienvenida = new JPanel();
    	labelIconX = new JLabel();
    	msgBienvenidaLabel2 = new JLabel();
    	msgBienvenidaLabel1 = new JLabel();
    	iconLabel = new JLabel();
        titleLoginLabel = new JLabel();
        labelIngresa = new JLabel();
        labelUsername = new JLabel();
        campoUsername = new JTextField();
        labelPassword = new JLabel();
        signUp = new JButton();
        jButton1 = new JButton();
        jPasswordField1 = new JPasswordField();

        this.setLayout(new AbsoluteLayout());

        panelBienvenida.setBackground(new Color(0, 102, 153));
        panelBienvenida.setLayout(new AbsoluteLayout());
        
        

        labelIconX.setHorizontalAlignment(SwingConstants.CENTER);
        labelIconX.setIcon(new ImageIcon(getClass().getResource("/IMG/2763138.png")));
        labelIconX.setToolTipText("Exit");
        labelIconX.setCursor(new Cursor(Cursor.HAND_CURSOR));
        labelIconX.setPreferredSize(new Dimension(512, 512));
        panelBienvenida.add(labelIconX, new AbsoluteConstraints(0, 0, 40, 40));

        msgBienvenidaLabel2.setFont(new Font("Segoe UI Light", 0, 24)); 
        msgBienvenidaLabel2.setForeground(new Color(255, 255, 255));
        msgBienvenidaLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        msgBienvenidaLabel2.setText("A la Galeria Da Vinci");
        panelBienvenida.add(msgBienvenidaLabel2, new AbsoluteConstraints(0, 300, 350, -1));

        msgBienvenidaLabel1.setFont(new Font("Segoe UI Light", 0, 24)); 
        msgBienvenidaLabel1.setForeground(new Color(51, 204, 255));
        msgBienvenidaLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        msgBienvenidaLabel1.setText("Bienvenidos");
        panelBienvenida.add(msgBienvenidaLabel1, new AbsoluteConstraints(0, 250, 350, -1));

        iconLabel.setHorizontalAlignment(SwingConstants.CENTER);
        iconLabel.setIcon(new ImageIcon(getClass().getResource("/IMG/4201213.png"))); 
        iconLabel.setPreferredSize(new Dimension(512, 512));
        panelBienvenida.add(iconLabel, new AbsoluteConstraints(0, 90, 350, 160));

        this.add(panelBienvenida, new AbsoluteConstraints(0, 0, 350, 420));

        titleLoginLabel.setFont(new Font("Segoe UI Semibold", 0, 24)); 
        titleLoginLabel.setText("Galeria Da Vinci Login");
        this.add(titleLoginLabel, new AbsoluteConstraints(370, 50, -1, -1));

        labelIngresa.setFont(new Font("Segoe UI Semibold", 0, 16)); 
        labelIngresa.setForeground(new Color(153, 153, 153));
        labelIngresa.setText("Ingresa tu usuario");
        this.add(labelIngresa, new AbsoluteConstraints(370, 90, -1, -1));

        labelUsername.setFont(new Font("Segoe UI Semibold", 0, 16)); 
        labelUsername.setForeground(new Color(153, 153, 153));
        labelUsername.setText("Username");
        this.add(labelUsername, new AbsoluteConstraints(370, 140, -1, -1));

        campoUsername.setText("Enter Username");
        campoUsername.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
        campoUsername.setName(""); // NOI18N
        campoUsername.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               
            }
        });
        this.add(campoUsername, new AbsoluteConstraints(370, 170, 300, 40));

        labelPassword.setFont(new Font("Segoe UI Semibold", 0, 16)); 
        labelPassword.setForeground(new Color(153, 153, 153));
        labelPassword.setText("Password");
        this.add(labelPassword, new AbsoluteConstraints(370, 240, -1, -1));

        signUp.setBackground(new Color(0, 153, 0));
        signUp.setFont(new Font("Segoe UI Semibold", 0, 18)); 
        signUp.setForeground(new Color(255, 255, 255));
        signUp.setLabel("Login");
        

        signUp.addActionListener(new ActionListener() {
        	
            @Override
			public void actionPerformed(ActionEvent e) {
            	String user = campoUsername.getText();
            	String pass = jPasswordField1.getText();

            	try {
            		Comprador comprador = PersistenciaComprador.obtenerCompradorPorUsernamePassword(user, pass);
            		if (user.equals("admin") && pass.equals("admin123")) {
            			signUp.setActionCommand("ADMINISTRADOR");
            			signUp.addActionListener(listener);            			
            		} else if (comprador == null) {
            			JOptionPane.showMessageDialog(null, "Username o password incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
            		} else
            			signUp.setActionCommand("COMPRADOR");
            			signUp.addActionListener(listener);
            			padre.cambiarComprador(comprador);
            			
            	} catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error al procesar la solicitud: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        this.add(signUp, new AbsoluteConstraints(370, 350, 120, 50));

        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); 
        jButton1.setForeground(new java.awt.Color(0, 153, 204));
        jButton1.setText("Create Account");
        jButton1 .setActionCommand("REGISTER");
        jButton1.addActionListener(listener);
        this.add(jButton1, new AbsoluteConstraints(620, 0, -1, -1));

        jPasswordField1.setText("Enter Password");
        jPasswordField1.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
        jPasswordField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                
            }
        });
        this.add(jPasswordField1, new AbsoluteConstraints(370, 270, 310, 40));

       
    }
}
