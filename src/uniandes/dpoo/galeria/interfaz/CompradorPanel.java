package uniandes.dpoo.galeria.interfaz;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

import uniandes.dpoo.galeria.modelo.Pieza;
import uniandes.dpoo.galeria.modelo.usuario.Comprador;


@SuppressWarnings("serial")
public class CompradorPanel extends JPanel {

	private Comprador comprador;
	private ActionListener principal;
	private Pieza pieza;
	private AdminPanel admin;
	private VistaPrincipal padre;
	private JButton comprar;
    private JLabel perfilLabel;
    private JLabel listaLabel;
    private JLabel galeriaLabel;
    private JLabel nombreLabel;
    private JLabel usuarioLabel;
    private JLabel saldoLabel;
    private JLabel listaPiezasLabel;
    private JList<String> listaPiezasComprador;
    private JPanel panelGeneral;
    private JPanel panelPerfil;
    private JPanel iconoPerfilPanel;
    private JPanel ofertaPiezasPanel;
    private JPanel piezasCompradorPanel;
    private JPanel panelBotones;
    private JScrollPane scrollPane1Piezas;
    private JButton limiteComprasBoton;
    private JButton botonOfertarSubasta;
    private JButton consultarPiezaBoton;
    private JButton comprarBoton;
    private JButton devolucionBoton;
    private JLabel iconoPerfilLabel;   
	
    public CompradorPanel(ActionListener principal, VistaPrincipal padre) {
    	this.padre = padre;
    	this.principal = principal;
        initComponents();
    }
    
    public Comprador getComprador() {
    	return this.comprador;
    }
    public Pieza getPieza() {
    	return this.pieza;
    }
    
    public void setComprador(Comprador comprador) {
    	this.comprador = comprador;
    	refrescar();
    }
    
    public void setPieza(Pieza pieza) {
    	this.pieza = pieza;
    	refrescar();    
    }
    
    public void setAdmin(AdminPanel admin) {
    	this.admin = admin;
    	refrescar();    
    }
    
    private void refrescar() {
    	this.removeAll();
    	this.initComponents();
    	this.updateUI();
    }

    private void initComponents() {

    	panelGeneral = new JPanel();
    	panelPerfil = new JPanel();
        perfilLabel = new JLabel();
        iconoPerfilPanel = new JPanel();
        nombreLabel = new JLabel();
        usuarioLabel = new JLabel();
        saldoLabel = new JLabel();
        galeriaLabel = new JLabel();
        ofertaPiezasPanel = new JPanel();
        piezasCompradorPanel = new JPanel();
        listaPiezasLabel = new JLabel();
        listaLabel = new JLabel();
        scrollPane1Piezas = new JScrollPane();
        listaPiezasComprador = new JList<>();
        panelBotones = new JPanel();
        comprar = new JButton();
        limiteComprasBoton = new JButton();
        botonOfertarSubasta = new JButton();
        consultarPiezaBoton = new JButton();
        comprarBoton = new JButton();
        devolucionBoton = new JButton();
        iconoPerfilLabel = new JLabel();

        this.setLayout(new AbsoluteLayout());
        
        panelGeneral.setBackground(new Color(251, 227, 171));
        panelGeneral.setLayout(new AbsoluteLayout());

        panelPerfil.setBackground(new Color(207, 140, 194));
        panelPerfil.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        perfilLabel.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        perfilLabel.setHorizontalAlignment(SwingConstants.CENTER);
        perfilLabel.setText("PERFIL");
        perfilLabel.setBorder(new javax.swing.border.SoftBevelBorder(BevelBorder.RAISED));

        iconoPerfilPanel.setBackground(new Color(21, 95, 130));
        iconoPerfilLabel.setHorizontalAlignment(SwingConstants.CENTER);
        iconoPerfilLabel.setIcon(new ImageIcon(getClass().getResource("/IMG/8931836.png")));

        javax.swing.GroupLayout jPanel3Layout = new GroupLayout(iconoPerfilPanel);
        iconoPerfilPanel.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(iconoPerfilLabel, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(iconoPerfilLabel, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(14, Short.MAX_VALUE))
        );

        nombreLabel.setFont(new Font("Palatino Linotype", 0, 24)); 
        nombreLabel.setHorizontalAlignment(SwingConstants.CENTER);  
        String nom = "";
        if (this.comprador != null) {
        	nom = comprador.getNombre();
        } 
        nombreLabel.setText(nom);
        

        usuarioLabel.setFont(new Font("Palatino Linotype", 0, 24)); 
        usuarioLabel.setHorizontalAlignment(SwingConstants.CENTER); 
        String user = "";
        if (this.comprador != null) {
        	user = comprador.getNombreUsuario();
        }
        usuarioLabel.setText(user);

        saldoLabel.setFont(new Font("Palatino Linotype", 0, 24)); // NOI18N
        saldoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        int saldo = 0;
        if (this.comprador != null) {
        	saldo = comprador.getSaldo();
        }
        saldoLabel.setText(String.valueOf(saldo));

        javax.swing.GroupLayout jPanel2Layout = new GroupLayout(panelPerfil);
        panelPerfil.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(iconoPerfilPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(perfilLabel)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(usuarioLabel)
                            .addComponent(nombreLabel)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(saldoLabel)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(perfilLabel)
                .addGap(38, 38, 38)
                .addComponent(iconoPerfilPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(nombreLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuarioLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saldoLabel)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        panelGeneral.add(panelPerfil, new AbsoluteConstraints(6, 140, 200, 500));

        galeriaLabel.setBackground(new Color(255, 255, 255));
        galeriaLabel.setFont(new Font("Arial", 1, 56)); // NOI18N
        galeriaLabel.setHorizontalAlignment(SwingConstants.CENTER);
        galeriaLabel.setText("Galería Da Vinci");
        galeriaLabel.setBorder(new SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelGeneral.add(galeriaLabel, new AbsoluteConstraints(240, 20, 840, 110));

        

    
        JPanel catalogo = new PanelImagenTexto();
        ofertaPiezasPanel = catalogo;
        
        ofertaPiezasPanel.setBackground(new Color(137, 164, 185));
        panelGeneral.add(ofertaPiezasPanel, new AbsoluteConstraints(240, 150, 850, 410));

        piezasCompradorPanel.setBackground(new Color(207, 140, 194));
        piezasCompradorPanel.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        listaPiezasLabel.setFont(new Font("Arial", 1, 36)); // NOI18N
        listaPiezasLabel.setHorizontalAlignment(SwingConstants.CENTER);
        listaPiezasLabel.setText("LISTA");
        listaPiezasLabel.setBorder(new SoftBevelBorder(BevelBorder.RAISED));

        listaLabel.setFont(new Font("Arial", 1, 36)); // NOI18N
        listaLabel.setHorizontalAlignment(SwingConstants.CENTER);
        listaLabel.setText("PIEZAS");
        listaLabel.setBorder(new SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        
        limiteComprasBoton.setFont(new Font("Segoe UI Semibold", 0, 14)); // NOI18N
        limiteComprasBoton.setText("Aumentar limite de Compras");
        limiteComprasBoton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas aumentar el limite de compras?", "Confirmación", JOptionPane.YES_NO_OPTION);

                if (respuesta == JOptionPane.YES_OPTION) {
                	comprador.solicitarAumentoLimite();
                	saldoLabel.setText(String.valueOf(comprador.getValorMaxCompras()));
                	JOptionPane.showMessageDialog(null, "Límite de compras actualizado correctamente a: "+ comprador.getValorMaxCompras(), "Éxito", JOptionPane.INFORMATION_MESSAGE);
                	
                } else if (respuesta == JOptionPane.NO_OPTION) {
                	JOptionPane.showMessageDialog(null, "Su límite de compras no fue modificado, y es el siguiente: " + comprador.getValorMaxCompras(), "Éxito", JOptionPane.INFORMATION_MESSAGE);
                }
            	
            	
            }
        });
        
        botonOfertarSubasta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        botonOfertarSubasta.setText("Ofertar en subasta");
        botonOfertarSubasta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea participar en la subasta?", "Confirmación", JOptionPane.YES_NO_OPTION);
            	if (respuesta == JOptionPane.YES_OPTION) {
            		String piezaOferta = JOptionPane.showInputDialog(null, "Ingrese el nombre de la pieza participante en la subasta a la que quiere ofertar:", "Oferta Subasta", JOptionPane.QUESTION_MESSAGE);
            		Pieza pieza = comprador.ConsultarPieza(piezaOferta);
            		
            		String input = JOptionPane.showInputDialog(null, "Ingrese el valor de la oferta para la subasta (Sin puntos ni comas): ", "Valor Subasta", JOptionPane.QUESTION_MESSAGE);
            		int valor = Integer.parseInt(input);           	
            		String fecha = JOptionPane.showInputDialog(null, "Ingrese la fecha actual en el formato DIA/MES/AÑO: ", "Valor Subasta", JOptionPane.QUESTION_MESSAGE);
         
            		try {
						comprador.hacerOfertaSubasta(pieza, valor, fecha);
					} catch (Exception e) {
						e.printStackTrace();
					}
            		JOptionPane.showMessageDialog(null, "Buenas noticias!, eres participante de la subasta.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            	}
            	else {
            		JOptionPane.showMessageDialog(null, "Lo sentimos, intenta de nuevo, no has accedido a la subasta. ", "Error", JOptionPane.INFORMATION_MESSAGE);
            	}
            }
        });

        consultarPiezaBoton.setFont(new Font("Segoe UI Semibold", 0, 14)); 
        consultarPiezaBoton.setText("Consultar Pieza");
        consultarPiezaBoton.setActionCommand("Consultar Pieza");
        consultarPiezaBoton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {;
        		String nombrePieza = JOptionPane.showInputDialog(null, "Por favor, ingresa el nombre de la pieza a consultar:", "Consulta de Pieza", JOptionPane.QUESTION_MESSAGE);
        		if (nombrePieza != null && !nombrePieza.isEmpty()) {
        			Pieza pieza = comprador.ConsultarPieza(nombrePieza);
        			if (pieza != null) {
        				JOptionPane.showMessageDialog(null, "La pieza consultada es: "+ pieza.toString(), "Éxito", JOptionPane.INFORMATION_MESSAGE);
        				
        			} else {
        				JOptionPane.showMessageDialog(null, "La pieza no se encuentra en el inventario. ", "Pieza No Encontrada", JOptionPane.INFORMATION_MESSAGE);
        			}
        		}
        	}
        });

        comprarBoton.setFont(new Font("Segoe UI Semibold", 0, 14)); // NOI18N
        comprarBoton.setText("Comprar");
        comprarBoton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	String nombrePieza = JOptionPane.showInputDialog(null, "Por favor, ingresa el nombre de la pieza a comprar:", "Compra de Pieza", JOptionPane.QUESTION_MESSAGE);                    
                Pieza pieza = comprador.ConsultarPieza(nombrePieza);
                boolean vendida = pieza.isVendida();
                if (pieza != null  && vendida == false ) {
                    comprador.agregarPieza(pieza);
                    comprador.agregarPiezaColeccion(pieza);                
                    JOptionPane.showMessageDialog(null, "¡Compra realizada con éxito!", "Compra Exitosa", JOptionPane.INFORMATION_MESSAGE);
                } else {
                	JOptionPane.showMessageDialog(null, "La pieza no se encuentra en el inventario.", "Pieza no encontrada", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        devolucionBoton.setFont(new Font("Segoe UI Semibold", 0, 14)); // NOI18N
        devolucionBoton.setText("Devolución");
        devolucionBoton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String nombrePieza = JOptionPane.showInputDialog(null, "Por favor, ingresa el nombre de la pieza a devolver:", "Devolución Pieza", JOptionPane.QUESTION_MESSAGE);
                
                Pieza pieza = comprador.ConsultarPieza(nombrePieza);
                if (pieza != null && comprador.getPiezasCompradas().contains(pieza)) {
                    comprador.solicitarDevolucion(pieza);
                    JOptionPane.showMessageDialog(null, "¡Devolución procesada con éxito!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } else {
                	JOptionPane.showMessageDialog(null, "La pieza no fue comprada por este comprador.", "Error", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        listaPiezasComprador.setBackground(new Color(207, 140, 194));
        listaPiezasComprador.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        listaPiezasComprador.setModel(new AbstractListModel<String>() {
            String[] strings = { "- Pieza 1", "- Pieza 2", "- Pieza 3", "- Pieza 4" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scrollPane1Piezas.setViewportView(listaPiezasComprador);

        GroupLayout jPanel5Layout = new GroupLayout(piezasCompradorPanel);
        piezasCompradorPanel.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(listaLabel)
                    .addComponent(listaPiezasLabel, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(scrollPane1Piezas, GroupLayout.PREFERRED_SIZE, 111,GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listaPiezasLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaLabel)
                .addGap(35, 35, 35)
                .addComponent(scrollPane1Piezas, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        panelGeneral.add(piezasCompradorPanel, new AbsoluteConstraints(1120, 140, -1, -1));

        panelBotones.setBackground(new Color(159, 212, 252));

        comprar.setText("Comprar");

        javax.swing.GroupLayout jPanel6Layout = new GroupLayout(panelBotones);
        panelBotones.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
        		jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        		.addGroup(jPanel6Layout.createSequentialGroup()
        				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(limiteComprasBoton)
        				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
        				.addComponent(consultarPiezaBoton)
        				.addGap(18, 18, 18)
        				.addComponent(devolucionBoton, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
        				.addGap(18, 18, 18)
        				.addComponent(comprarBoton, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
        				.addGap(26, 26, 26)
        				.addComponent(botonOfertarSubasta)
        				.addGap(541, 541, 541))
        		);
        jPanel6Layout.setVerticalGroup(
        		jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(limiteComprasBoton, GroupLayout.PREFERRED_SIZE, 53,GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(botonOfertarSubasta,GroupLayout.PREFERRED_SIZE, 53,GroupLayout.PREFERRED_SIZE)
                                .addComponent(devolucionBoton,GroupLayout.PREFERRED_SIZE, 53,GroupLayout.PREFERRED_SIZE)
                                .addComponent(comprarBoton,GroupLayout.PREFERRED_SIZE, 53,GroupLayout.PREFERRED_SIZE)
                                .addComponent(consultarPiezaBoton,GroupLayout.PREFERRED_SIZE, 53,GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(22, Short.MAX_VALUE))
        );

        panelGeneral.add(panelBotones, new AbsoluteConstraints(240, 580, 850, -1));

        this.add(panelGeneral, new AbsoluteConstraints(0, 0, 1391, 698));
      
    }                         
}

