package uniandes.dpoo.galeria.interfaz;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TableroActividad extends JPanel {
    private final Map<String, Integer> actividadPorMes;
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

    private Color determinarColor(int ocurrencias) {
        if (ocurrencias == 0) {
            return new Color(235, 235, 235); 
        } else if (ocurrencias <= maxOcurrencias * 0.2) {
            return new Color(200, 255, 200); 
        } else if (ocurrencias <= maxOcurrencias * 0.4) {
            return new Color(150, 255, 150); 
        } else if (ocurrencias <= maxOcurrencias * 0.6) {
            return new Color(100, 255, 100); 
        } else if (ocurrencias <= maxOcurrencias * 0.8) {
            return new Color(50, 255, 50); 
        } else {
            return new Color(0, 255, 0); 
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        int width = getWidth();
        int height = getHeight();
        int boxWidth = width / 12;
        int boxHeight = height;

        int x = 0;

        for (String mes : MESES) {
            int ocurrencias = actividadPorMes.getOrDefault(mes, 0);
            Color color = determinarColor(ocurrencias);

            g.setColor(color);
            g.fillRect(x, 0, boxWidth, boxHeight);

            g.setColor(Color.BLACK);
            g.drawRect(x, 0, boxWidth, boxHeight);
            g.drawString(mes.substring(0, 3), x + boxWidth / 2 - g.getFontMetrics().stringWidth(mes.substring(0, 3)) / 2, boxHeight / 2);

            x += boxWidth;
        }
    }

}