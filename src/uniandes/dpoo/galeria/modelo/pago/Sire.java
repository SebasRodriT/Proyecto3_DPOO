package uniandes.dpoo.galeria.modelo.pago;

import java.io.FileWriter;
import java.io.IOException;

public class Sire {
	
	public boolean procesarPago(String numTarjeta, String titularTarjeta, double cantidad, String IdTransaccion) {
		boolean exito = simularPago(numTarjeta, cantidad);
		try (FileWriter writer = new FileWriter("PayPal.log", true)) {
            String logEntry = "ID de Transaccion: " + IdTransaccion + 
                              ", Titular de Tarjeta: " + titularTarjeta + 
                              ", Cantidad: " + cantidad + 
                              ", Exito: " + exito + "\n";
            writer.write(logEntry);} catch (IOException e) {
			e.printStackTrace();
		}
		return exito;
	}

	private boolean simularPago(String numTarjeta, double cantidad) {
		//De momento el pago siempre será correcto
		if (numTarjeta == null || numTarjeta.isEmpty()) {
			return false;
		}
		if (cantidad <= 0) {
			return false;
		}
		
		return true;
	}
}


