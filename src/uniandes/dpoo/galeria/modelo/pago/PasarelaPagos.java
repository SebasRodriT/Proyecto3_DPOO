package uniandes.dpoo.galeria.modelo.pago;

public interface PasarelaPagos {
	
	boolean procesarPago(String numTarjeta, String titularTarjeta, double cantidad, String IdTransaccion);
}
