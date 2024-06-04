package uniandes.dpoo.galeria.interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;

public class PanelImagenTexto extends JPanel {

    private BufferedImage image;
    private JLabel labelTitle;
    private JLabel labelValue;
    private JLabel labelPrice;
    private JPanel imagePanel;
    private JPanel textPanel;
    private JComboBox<String> comboBox; // Añadir JComboBox para seleccionar imágenes

    // Listas dinámicas para almacenar información
    private List<String> imagePaths;
    private List<String> titles;
    private List<String> values;
    private List<String> precios;

    public PanelImagenTexto() {
        imagePaths = new ArrayList<>();
        titles = new ArrayList<>();
        values = new ArrayList<>();
        precios = new ArrayList<>();

        imagePaths.add("src\\IMG\\Mona_Lisa11.jpg");
        imagePaths.add("src\\IMG\\OIP.jpg");
        imagePaths.add("src\\IMG\\img2.jpg");
        imagePaths.add("src\\IMG\\R.jpg");
        imagePaths.add("src\\IMG\\img3.jpg");
        imagePaths.add("src\\IMG\\img4.jpg");
        imagePaths.add("src\\IMG\\img6.jpg");
        imagePaths.add("src\\IMG\\img5.jpg");

        titles.add("La Mona Lisa");
        titles.add("La Última Cena");
        titles.add("La Noche Estrellada");
        titles.add("El Grito");
        titles.add("La Persistencia de la Memoria");
        titles.add("Guernica");
        titles.add("impression sunrise");
        titles.add("Las Meninas");

        values.add("Leonardo da Vinci");
        values.add("Leonardo da Vinci");
        values.add("Vincent van Gogh");
        values.add("Edvard Munch");
        values.add("Salvador Dalí");
        values.add("Pablo Picasso");
        values.add("Claude Monet");
        values.add("Diego Velázquez");

        precios.add("10000000");
        precios.add("20000000");
        precios.add("30000000");
        precios.add("40000000");
        precios.add("50000000");
        precios.add("60000000");
        precios.add("70000000");
        precios.add("80000000");

       
        setLayout(new BorderLayout());

        comboBox = new JComboBox<>(titles.toArray(new String[0]));
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cargarImagenYTextos(comboBox.getSelectedIndex());
            }
        });

        add(comboBox, BorderLayout.NORTH);

       
        imagePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (image != null) {
                    int panelWidth = getWidth();
                    int panelHeight = getHeight() - 90; // Restar espacio para los textos

                    double imageAspect = (double) image.getWidth() / image.getHeight();
                    int imageWidth = panelWidth;
                    int imageHeight = (int) (panelWidth / imageAspect);
                    if (imageHeight > panelHeight) {
                        imageHeight = panelHeight;
                        imageWidth = (int) (panelHeight * imageAspect);
                    }
                    int imageX = (panelWidth - imageWidth) / 2;
                    int imageY = (panelHeight - imageHeight) / 2;

                    g.drawImage(image, imageX, imageY, imageWidth, imageHeight, this);
                }
            }
        };

       
        textPanel = new JPanel(new GridLayout(3, 1));
        labelTitle = new JLabel("", SwingConstants.CENTER);
        labelValue = new JLabel("", SwingConstants.CENTER);
        labelPrice = new JLabel("", SwingConstants.CENTER);

        Font font = new Font("Arial", Font.BOLD, 20); // Por ejemplo, Arial en negrita, tamaño 20
        labelTitle.setFont(font);
        labelValue.setFont(font);
        labelPrice.setFont(font);

        textPanel.add(labelTitle);
        textPanel.add(labelValue);
        textPanel.add(labelPrice);

        add(imagePanel, BorderLayout.CENTER);
        add(textPanel, BorderLayout.SOUTH);

       
        cargarImagenYTextos(0);
    }

    public void cargarImagenYTextos(int index) {
        try {
            image = ImageIO.read(new File(imagePaths.get(index)));
            labelTitle.setText(titles.get(index));
            labelValue.setText(values.get(index));
            labelPrice.setText("Precio: $" + precios.get(index));
            repaint();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

   
    public void agregarPieza(String imagePath, String title, String value, String precio) {
        imagePaths.add("src\\IMG\\"+imagePath+".jpg");
        titles.add(title);
        values.add(value);
        precios.add(precio);
        comboBox.addItem(title); 
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Panel de Imagen y Texto");
        PanelImagenTexto panel = new PanelImagenTexto();

        
        panel.agregarPieza("src\\IMG\\new_image.jpg", "Nueva Obra", "Nuevo Autor", "90000000");

        frame.add(panel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}