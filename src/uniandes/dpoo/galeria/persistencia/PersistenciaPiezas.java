package uniandes.dpoo.galeria.persistencia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import uniandes.dpoo.galeria.modelo.Artista;
import uniandes.dpoo.galeria.modelo.Inventario;
import uniandes.dpoo.galeria.modelo.Pieza;

public class PersistenciaPiezas {
    private static final String PATH_USUARIOS = "data/piezas.txt";

    /**
     * Guarda la información de un comprador en un archivo de texto.
     * 
     * @param comprador El objeto Comprador que contiene la información a guardar.
     */
    public static void guardarPieza(Pieza pieza) {
    File archivo = new File("data/piezas.txt"); 
    if (!archivo.exists()) {
        archivo.getParentFile().mkdirs(); 
        try {
            archivo.createNewFile(); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    try (PrintWriter writer = new PrintWriter(new FileWriter(archivo, true))) {
        StringBuilder sb = new StringBuilder();
        // Formato: vendida|tituloObra|año|lugarCreacion|nombreaAutor|tipoArtista|exhibido|tematica|precio
        sb.append(pieza.isVendida()).append("|")
          .append(pieza.getTituloObra()).append("|")
          .append(pieza.getAño()).append("|")
          .append(pieza.getLugarCreacion()).append("|")
          .append(pieza.getAutor().getNombre()).append("|")  
          .append(pieza.getAutor().getTipoArtista()).append("|")
          .append(pieza.isExhibido()).append("|")
          .append(pieza.getTematica()).append("|")
          .append(pieza.getPrecio());
        writer.println(sb.toString());
    } catch (IOException e) {
        e.printStackTrace();
    }
    }

    public static Pieza obtenerPiezaPorNombre(String nombrePie) {
        try (BufferedReader reader = new BufferedReader(new FileReader(PATH_USUARIOS))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter("\\|");
                
                try {
                boolean vendida = lineScanner.nextBoolean();
                String tituloObra = lineScanner.next();
                int año = lineScanner.nextInt();
                String lugarCreacion = lineScanner.next();
                String nombreArtista = lineScanner.next();
                String tipoArtista = lineScanner.next();
                boolean exhibido = lineScanner.nextBoolean();
                String tematica = lineScanner.next();
                int precio = lineScanner.nextInt();
                
                
                lineScanner.close();
                Artista autor = new Artista(nombreArtista, tipoArtista);
                
                Inventario inv = new Inventario();
                
                if (tituloObra.equals(nombrePie)) {
                	lineScanner.close();
                	Pieza pieza = new Pieza(vendida,tituloObra, año, lugarCreacion, autor, exhibido, tematica, precio);
                    inv.agregarPiezainventario(pieza);
                    return new Pieza(vendida,tituloObra, año, lugarCreacion, autor, exhibido, tematica, precio);
                }
            } catch (InputMismatchException e) {
                System.err.println("Error de formato en la línea: " + line);
               
            } catch (NoSuchElementException e) {
                System.err.println("Faltan datos en la línea: " + line);
            }
            lineScanner.close();
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

