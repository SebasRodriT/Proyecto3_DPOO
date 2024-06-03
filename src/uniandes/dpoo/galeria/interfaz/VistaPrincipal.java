package uniandes.dpoo.galeria.interfaz;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import uniandes.dpoo.galeria.modelo.Pieza;
import uniandes.dpoo.galeria.modelo.usuario.Comprador;



@SuppressWarnings("serial")
public class VistaPrincipal extends JFrame implements ActionListener{
	private JPanel vistaTarjetas;
	private FormLogin login;
	private RegisterPanel register;
	private CompradorPanel comprador;
	private Pieza pieza;
	
	public VistaPrincipal() {
		vistaTarjetas = new JPanel();
		vistaTarjetas.setLayout(new CardLayout());
		this.add(vistaTarjetas);
		
		login = new FormLogin(this, this);
		register = new RegisterPanel(this);
		comprador = new CompradorPanel(this, this);
		
		vistaTarjetas.add(login, "LOGIN");
		vistaTarjetas.add(register, "REGISTER");
		vistaTarjetas.add(comprador, "COMPRADOR");
		
		
		
		
		this.setSize(750, 451);
		this.setVisible(true);
		
	}
	
	public void cambiarComprador(Comprador comprador) {
		this.comprador.setComprador(comprador);
	}
	
	public void cambiarPieza(Pieza pieza) {
		this.comprador.setPieza(pieza);
	}
	public static void main(String args[]) {
		
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VistaPrincipal vistaPrincipal = new VistaPrincipal();
            }
        });
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String siguienteVista = e.getActionCommand();
		CardLayout cl = (CardLayout)(vistaTarjetas.getLayout());
		cl.show(vistaTarjetas, siguienteVista);
		pack();
	}
}
