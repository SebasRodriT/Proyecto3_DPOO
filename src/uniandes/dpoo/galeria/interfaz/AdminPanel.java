package uniandes.dpoo.galeria.interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

@SuppressWarnings("serial")
public class AdminPanel extends JPanel {

	
    private JButton tableroActividadesBoton;
    private JButton agregarPiezaBoton;
    private JButton consultarPiezaBoton;
    private JButton historiaCompradorBoton;
    private JButton consultarArtistaBoton;
    private JLabel perfilLabel;
    private JLabel galeriaLabel;
    private JLabel nombreLabel;
    private JLabel usuarioLabel;
    private JLabel bienvenidaLabel;
    private JLabel iconLabel;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JPanel jPanel6;
    
    public AdminPanel() {
        initComponents();
    }

                   
    private void initComponents() {

        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        perfilLabel = new JLabel();
        jPanel3 = new JPanel();
        iconLabel = new JLabel();
        nombreLabel = new JLabel();
        usuarioLabel = new JLabel();
        galeriaLabel = new JLabel();
        jPanel4 = new JPanel();
        jPanel6 = new JPanel();
        bienvenidaLabel = new JLabel();
        jPanel5 = new JPanel();
        tableroActividadesBoton = new JButton();
        consultarPiezaBoton = new JButton();
        agregarPiezaBoton = new JButton();
        historiaCompradorBoton = new JButton();
        consultarArtistaBoton = new JButton();

        this.setLayout(new AbsoluteLayout());

        jPanel1.setBackground(new Color(251, 227, 171));
        jPanel1.setLayout(new AbsoluteLayout());

        jPanel2.setBackground(new Color(207, 140, 194));
        jPanel2.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));

        perfilLabel.setFont(new Font("Arial", 1, 36)); 
        perfilLabel.setHorizontalAlignment(SwingConstants.CENTER);
        perfilLabel.setText("PERFIL");
        perfilLabel.setBorder(new SoftBevelBorder(BevelBorder.RAISED));

        jPanel3.setBackground(new java.awt.Color(21, 95, 130));

        iconLabel.setHorizontalAlignment(SwingConstants.CENTER);
        iconLabel.setIcon(new ImageIcon(getClass().getResource("/IMG/8931836.png"))); 

        javax.swing.GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconLabel, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(iconLabel, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        nombreLabel.setFont(new Font("Palatino Linotype", 0, 24)); 
        nombreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        nombreLabel.setText("Nombre");

        usuarioLabel.setFont(new Font("Palatino Linotype", 0, 24)); 
        usuarioLabel.setHorizontalAlignment(SwingConstants.CENTER);
        usuarioLabel.setText("Usuario");

        javax.swing.GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(perfilLabel)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(usuarioLabel)
                            .addComponent(nombreLabel))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(perfilLabel)
                .addGap(38, 38, 38)
                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(nombreLabel)
                .addGap(18, 18, 18)
                .addComponent(usuarioLabel)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new AbsoluteConstraints(6, 140, 200, 500));

        galeriaLabel.setBackground(new Color(255, 255, 255));
        galeriaLabel.setFont(new Font("Arial", 1, 56)); 
        galeriaLabel.setHorizontalAlignment(SwingConstants.CENTER);
        galeriaLabel.setText("Galería Da Vinci");
        galeriaLabel.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        jPanel1.add(galeriaLabel, new AbsoluteConstraints(240, 20, 840, 110));

        jPanel4.setBackground(new Color(137, 164, 185));

        javax.swing.GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new AbsoluteConstraints(240, 150, 850, 410));

        jPanel6.setBackground(new Color(159, 212, 252));

        bienvenidaLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); 
        bienvenidaLabel.setHorizontalAlignment(SwingConstants.CENTER);
        bienvenidaLabel.setText("Bienvenido!, Administrador de Galeria");

        javax.swing.GroupLayout jPanel6Layout = new GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(bienvenidaLabel, GroupLayout.PREFERRED_SIZE, 795, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bienvenidaLabel, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new AbsoluteConstraints(240, 580, 850, -1));

        jPanel5.setBackground(new Color(207, 140, 194));
        jPanel5.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));

        tableroActividadesBoton.setFont(new Font("Segoe UI Semibold", 0, 14));
        tableroActividadesBoton.setText("Tablero Actividades");
        tableroActividadesBoton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                
            }
        });

        consultarPiezaBoton.setFont(new Font("Segoe UI Semibold", 0, 14));
        consultarPiezaBoton.setText("Consultar Pieza");
        consultarPiezaBoton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                
            }
        });

        agregarPiezaBoton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); 
        agregarPiezaBoton.setText("Agregar Pieza");
        agregarPiezaBoton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                
            }
        });

        historiaCompradorBoton.setFont(new Font("Segoe UI Semibold", 0, 14)); 
        historiaCompradorBoton.setText("Historia Comprador");
        historiaCompradorBoton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                
            }
        });

        consultarArtistaBoton.setFont(new Font("Segoe UI Semibold", 0, 14));
        consultarArtistaBoton.setText("Consultar Artista");
        consultarArtistaBoton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(tableroActividadesBoton, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(agregarPiezaBoton))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(consultarArtistaBoton)
                                    .addComponent(consultarPiezaBoton))))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(historiaCompradorBoton, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(tableroActividadesBoton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(consultarPiezaBoton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(consultarArtistaBoton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(historiaCompradorBoton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(agregarPiezaBoton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        jPanel1.add(jPanel5, new AbsoluteConstraints(1100, 130, 200, -1));

        this.add(jPanel1, new AbsoluteConstraints(0, 0, 1391, 698));

    }                
}
