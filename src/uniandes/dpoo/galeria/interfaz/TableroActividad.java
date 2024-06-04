package uniandes.dpoo.galeria.interfaz;


import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TableroActividad extends JPanel {
    private Map<String, Integer> actividadPorMes;
    private int maxOcurrencias;
    
    private static final String[] MESES = {
        "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE",
        "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"
    };

    public TableroActividad(List<String> fechas) {
        this.actividadPorMes = new HashMap<>();
        this.maxOcurrencias = 0;
        procesarFechas(fechas);
    }

    private void procesarFechas(List<String> fechas) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        for (String fecha : fechas) {
            LocalDate date = LocalDate.parse(fecha, formatter);
            String mes = date.getMonth().name();

            actividadPorMes.put(mes, actividadPorMes.getOrDefault(mes, 0) + 1);
            maxOcurrencias = Math.max(maxOcurrencias, actividadPorMes.get(mes));
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        int width = getWidth();
        int height = getHeight();
        int boxWidth = width / 12;
        int boxHeight = height;

        int x = 0;

        for (String mes : MESES) {
            int ocurrencias = actividadPorMes.getOrDefault(mes, 0);
            float intensidad = maxOcurrencias == 0 ? 0 : (float) ocurrencias / maxOcurrencias;
            Color color = new Color(0, (int) (255 * intensidad), 0);

            g2d.setColor(color);
            g2d.fillRect(x, 0, boxWidth, boxHeight);

            g2d.setColor(Color.BLACK);
            g2d.drawRect(x, 0, boxWidth, boxHeight);
            g2d.drawString(mes.substring(0, 3), x + boxWidth / 2 - g.getFontMetrics().stringWidth(mes.substring(0, 3)) / 2, boxHeight / 2);

            x += boxWidth;
        }
    }
  
}