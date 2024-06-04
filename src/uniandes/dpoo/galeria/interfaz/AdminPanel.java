package uniandes.dpoo.galeria.interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

import uniandes.dpoo.galeria.modelo.Artista;
import uniandes.dpoo.galeria.modelo.Dibujo;
import uniandes.dpoo.galeria.modelo.Escultura;
import uniandes.dpoo.galeria.modelo.Fotografia;
import uniandes.dpoo.galeria.modelo.Impresion;
import uniandes.dpoo.galeria.modelo.Pintura;
import uniandes.dpoo.galeria.modelo.Video;
import uniandes.dpoo.galeria.modelo.empleado.AdministradorGaleria;

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
    private ActionListener principal;
    private VistaPrincipal padre;
    private AdministradorGaleria administrador;
    private PanelImagenTexto catalogo = new PanelImagenTexto();
    
    public AdminPanel(ActionListener principal, VistaPrincipal nVista) {
    	this.principal = principal;
    	this.padre = nVista;
    	this.administrador = AdministradorGaleria.obternerAdmin();
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
        agregarPiezaBoton = new JButton();
       
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
        jPanel4 = catalogo;

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
            	
            	 List<String> fechas = new ArrayList<>();
            	 //fechas simuladas
                 fechas.add("2024-01-01");
                 fechas.add("2024-02-15");
                 fechas.add("2023-06-01");
                 fechas.add("2023-06-15");
                 fechas.add("2023-06-30");
                 fechas.add("2023-07-05");
                 fechas.add("2023-07-20");
                 fechas.add("2023-07-31");
                 fechas.add("2023-08-10");
                 fechas.add("2023-08-25");
                 fechas.add("2023-08-31");
                 fechas.add("2023-09-05");
                 fechas.add("2023-09-20");
                 fechas.add("2023-09-30");
                 fechas.add("2023-10-10");
                 fechas.add("2023-10-25");
                 fechas.add("2023-10-31");
                 fechas.add("2023-11-05");
                 fechas.add("2023-11-20");
                 fechas.add("2023-11-30");
                 fechas.add("2023-12-10");
                 fechas.add("2023-12-25");
                 fechas.add("2023-12-25");
                 fechas.add("2023-12-25");
                 fechas.add("2023-12-25");
                 fechas.add("2023-12-31");
                 fechas.add("2024-01-01");
                 fechas.add("2024-01-15");
                 fechas.add("2024-01-31");
                 fechas.add("2024-02-10");
                 fechas.add("2024-02-25");
                 fechas.add("2024-02-29");
                 fechas.add("2024-03-05");
                 fechas.add("2024-03-20");
                 fechas.add("2024-04-15");
                 fechas.add("2024-04-16");
                 fechas.add("2024-05-30");
                 TableroActividad tableroActividad = new TableroActividad(fechas);
                
                 JDialog dialog = new JDialog();
                 dialog.setTitle("Tablero de Actividad");
                 dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                 dialog.getContentPane().add(tableroActividad);
                 dialog.pack();
                 dialog.setSize(600, 600);
                 dialog.setLocationRelativeTo(null); 
                 dialog.setVisible(true);
                
            }
        });
        
        agregarPiezaBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            
            
            }});
        
        

       
        agregarPiezaBoton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); 
        agregarPiezaBoton.setText("Agregar Pieza");
        agregarPiezaBoton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                
            }
        });
        
        agregarPiezaBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	JPanel panelArtista = new JPanel(new GridLayout(0, 2));
                JTextField nombreArtistaField = new JTextField();
                JTextField tipoArtistaField = new JTextField();
                panelArtista.add(new JLabel("Nombre del artista:"));
                panelArtista.add(nombreArtistaField);
                panelArtista.add(new JLabel("Tipo/especialidad del artista (ej: pintor):"));
                panelArtista.add(tipoArtistaField);

                int result = JOptionPane.showConfirmDialog(null, panelArtista, 
                    "Registrar Artista", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                
                if (result == JOptionPane.OK_OPTION) {
                    String nombreArtista = nombreArtistaField.getText();
                    String tipoArtista = tipoArtistaField.getText();
                    Artista artista = new Artista(nombreArtista, tipoArtista);

                    String[] opciones = { "Dibujo", "Escultura", "Fotografía", "Impresión", "Pintura" };
                    JComboBox<String> comboBox = new JComboBox<>(opciones);

                    JPanel panelPieza = new JPanel(new GridLayout(0, 1));
                    panelPieza.add(new JLabel("Seleccione el tipo de pieza:"));
                    panelPieza.add(comboBox);

                    int resultPieza = JOptionPane.showConfirmDialog(null, panelPieza, 
                        "Seleccionar Tipo de Pieza", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

                    if (resultPieza == JOptionPane.OK_OPTION) {
                        String opcionSeleccionada = (String) comboBox.getSelectedItem();
                        JPanel panelDetallesPieza = new JPanel(new GridLayout(0, 2));
                        JTextField tituloField = new JTextField();
                        JTextField anioField = new JTextField();
                        JTextField lugarField = new JTextField();
                        JTextField tematicaField = new JTextField();
                        JTextField precioField = new JTextField();
                        JTextField imagenField = new JTextField();

                        panelDetallesPieza.add(new JLabel("Título de la pieza:"));
                        panelDetallesPieza.add(tituloField);
                        panelDetallesPieza.add(new JLabel("Año de creación/publicación:"));
                        panelDetallesPieza.add(anioField);
                        panelDetallesPieza.add(new JLabel("Lugar de creación/publicación:"));
                        panelDetallesPieza.add(lugarField);
                        panelDetallesPieza.add(new JLabel("Temática:"));
                        panelDetallesPieza.add(tematicaField);
                        panelDetallesPieza.add(new JLabel("Valor/precio:"));
                        panelDetallesPieza.add(precioField);
                        panelDetallesPieza.add(new JLabel("Nombre del archivo de la imagen:"));
                        panelDetallesPieza.add(imagenField);

                        if (opcionSeleccionada.equals("Dibujo")) {
                            JTextField tecnicaField = new JTextField();
                            JTextField estiloField = new JTextField();
                            JTextField medioField = new JTextField();
                            JTextField tamanoField = new JTextField();

                            panelDetallesPieza.add(new JLabel("Técnica:"));
                            panelDetallesPieza.add(tecnicaField);
                            panelDetallesPieza.add(new JLabel("Estilo:"));
                            panelDetallesPieza.add(estiloField);
                            panelDetallesPieza.add(new JLabel("Medio (ej: lienzo):"));
                            panelDetallesPieza.add(medioField);
                            panelDetallesPieza.add(new JLabel("Tamaño (m x n):"));
                            panelDetallesPieza.add(tamanoField);

                            int resultDibujo = JOptionPane.showConfirmDialog(null, panelDetallesPieza, 
                                "Detalles del Dibujo", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

                            if (resultDibujo == JOptionPane.OK_OPTION) {
                                String titulo = tituloField.getText();
                                int anio = Integer.parseInt(anioField.getText());
                                String lugar = lugarField.getText();
                                String tematica = tematicaField.getText();
                                int precio = Integer.parseInt(precioField.getText());
                                String imagen = imagenField.getText();
                                String tecnica = tecnicaField.getText();
                                String estilo = estiloField.getText();
                                String medio = medioField.getText();
                                String tamano = tamanoField.getText();

                                Dibujo dibujo = new Dibujo(medio, tecnica, estilo, tamano, false, titulo, anio, lugar, artista, false, tematica, precio);
                                administrador.registrarPiezaInventario(dibujo);
                                System.out.println("Pieza ingresada exitosamente al inventario");
                            }
                        } else if (opcionSeleccionada.equals("Escultura")) {
                            JTextField alturaField = new JTextField();
                            JTextField anchoField = new JTextField();
                            JTextField pesoField = new JTextField();
                            JTextField electricidadField = new JTextField();

                            panelDetallesPieza.add(new JLabel("Altura:"));
                            panelDetallesPieza.add(alturaField);
                            panelDetallesPieza.add(new JLabel("Ancho:"));
                            panelDetallesPieza.add(anchoField);
                            panelDetallesPieza.add(new JLabel("Peso:"));
                            panelDetallesPieza.add(pesoField);
                            panelDetallesPieza.add(new JLabel("¿Requiere electricidad? (true/false):"));
                            panelDetallesPieza.add(electricidadField);

                            int resultEscultura = JOptionPane.showConfirmDialog(null, panelDetallesPieza, 
                                "Detalles de la Escultura", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

                            if (resultEscultura == JOptionPane.OK_OPTION) {
                                String titulo = tituloField.getText();
                                int anio = Integer.parseInt(anioField.getText());
                                String lugar = lugarField.getText();
                                String tematica = tematicaField.getText();
                                int precio = Integer.parseInt(precioField.getText());
                                String imagen = imagenField.getText();
                                double altura = Double.parseDouble(alturaField.getText());
                                double ancho = Double.parseDouble(anchoField.getText());
                                double peso = Double.parseDouble(pesoField.getText());
                                boolean electricidad = Boolean.parseBoolean(electricidadField.getText());

                                Escultura escultura = new Escultura(altura, ancho, peso, electricidad, false, titulo, anio, lugar, artista, false, tematica, precio);
                                administrador.registrarPiezaInventario(escultura);
                                System.out.println("Pieza ingresada exitosamente al inventario");
                            }
                        } else if (opcionSeleccionada.equals("Fotografía")) {
                            JTextField calidadField = new JTextField();
                            JTextField colorField = new JTextField();

                            panelDetallesPieza.add(new JLabel("Calidad (m x n):"));
                            panelDetallesPieza.add(calidadField);
                            panelDetallesPieza.add(new JLabel("¿A color? (true/false):"));
                            panelDetallesPieza.add(colorField);

                            int resultFotografia = JOptionPane.showConfirmDialog(null, panelDetallesPieza, 
                                "Detalles de la Fotografía", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

                            if (resultFotografia == JOptionPane.OK_OPTION) {
                                String titulo = tituloField.getText();
                                int anio = Integer.parseInt(anioField.getText());
                                String lugar = lugarField.getText();
                                String tematica = tematicaField.getText();
                                int precio = Integer.parseInt(precioField.getText());
                                String imagen = imagenField.getText();
                                String calidad = calidadField.getText();
                                boolean color = Boolean.parseBoolean(colorField.getText());

                                Fotografia fotografia = new Fotografia(calidad, color, false, titulo, anio, lugar, artista, false, tematica, precio);
                                administrador.registrarPiezaInventario(fotografia);
                                System.out.println("Pieza ingresada exitosamente al inventario");
                            }
                        } else if (opcionSeleccionada.equals("Impresión")) {
                            JTextField tipoImpresionField = new JTextField();
                            JTextField calidadField = new JTextField();
                            JTextField tamanoField = new JTextField();

                            panelDetallesPieza.add(new JLabel("Tipo de impresión:"));
                            panelDetallesPieza.add(tipoImpresionField);
                            panelDetallesPieza.add(new JLabel("Calidad / DPI (puntos por pulgada):"));
                            panelDetallesPieza.add(calidadField);
                            panelDetallesPieza.add(new JLabel("Tamaño (m x n):"));
                            panelDetallesPieza.add(tamanoField);

                            int resultImpresion = JOptionPane.showConfirmDialog(null, panelDetallesPieza, 
                                "Detalles de la Impresión", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

                            if (resultImpresion == JOptionPane.OK_OPTION) {
                                String titulo = tituloField.getText();
                                int anio = Integer.parseInt(anioField.getText());
                                String lugar = lugarField.getText();
                                String tematica = tematicaField.getText();
                                int precio = Integer.parseInt(precioField.getText());
                                String imagen = imagenField.getText();
                                String tipoImpresion = tipoImpresionField.getText();
                                String calidad = calidadField.getText();
                                String tamano = tamanoField.getText();

                                Impresion impresion = new Impresion(tipoImpresion, calidad, tamano, false, titulo, anio, lugar, artista, false, tematica, precio);
                                administrador.registrarPiezaInventario(impresion);
                                System.out.println("Pieza ingresada exitosamente al inventario");
                            }
                        } else if (opcionSeleccionada.equals("Pintura")) {
                            JTextField tecnicaField = new JTextField();
                            JTextField estiloField = new JTextField();
                            JTextField alturaField = new JTextField();
                            JTextField anchoField = new JTextField();

                            panelDetallesPieza.add(new JLabel("Técnica:"));
                            panelDetallesPieza.add(tecnicaField);
                            panelDetallesPieza.add(new JLabel("Estilo:"));
                            panelDetallesPieza.add(estiloField);
                            panelDetallesPieza.add(new JLabel("Altura:"));
                            panelDetallesPieza.add(alturaField);
                            panelDetallesPieza.add(new JLabel("Ancho:"));
                            panelDetallesPieza.add(anchoField);

                            int resultPintura = JOptionPane.showConfirmDialog(null, panelDetallesPieza, 
                                "Detalles de la Pintura", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

                            if (resultPintura == JOptionPane.OK_OPTION) {
                                String titulo = tituloField.getText();
                                int anio = Integer.parseInt(anioField.getText());
                                String lugar = lugarField.getText();
                                String tematica = tematicaField.getText();
                                int precio = Integer.parseInt(precioField.getText());
                                String imagen = imagenField.getText();
                                String tecnica = tecnicaField.getText();
                                String estilo = estiloField.getText();
                                double altura = Double.parseDouble(alturaField.getText());
                                double ancho = Double.parseDouble(anchoField.getText());

                                Pintura pintura = new Pintura(tecnica, estilo, altura, ancho, false, titulo, anio, lugar, artista, false, tematica, precio);
                                administrador.registrarPiezaInventario(pintura);
                                System.out.println("Pieza ingresada exitosamente al inventario");
                            }
                        
                        }
                    }
                }
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
                                   )))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        
        ))));
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(tableroActividadesBoton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                
                
                .addComponent(agregarPiezaBoton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        jPanel1.add(jPanel5, new AbsoluteConstraints(1100, 130, 200, -1));

        this.add(jPanel1, new AbsoluteConstraints(0, 0, 1391, 698));

    }                
}
