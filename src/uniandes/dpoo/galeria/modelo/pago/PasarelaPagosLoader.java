package uniandes.dpoo.galeria.modelo.pago;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PasarelaPagosLoader {
	
	private static final String CONFIG_FILE = "payment_gateways.config";
	
	public static Map<String, PasarelaPagos> cargarPasarela(){
		Map<String, PasarelaPagos> pasarelas = new HashMap<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(CONFIG_FILE))) {
			String line;
			while((line = reader.readLine()) != null) {
				try {
                    Class<?> clase = Class.forName(line);
                    PasarelaPagos gateway = (PasarelaPagos) clase.getDeclaredConstructor().newInstance();
                    pasarelas.put(clase.getSimpleName(), gateway);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pasarelas;
    }
}
