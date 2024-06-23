package exchangeconsultas;



import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;

public class ExchangeConsultaApi { 
	
	public static Moneda hacerConsulta(String monedaBase, String monedaFinal, double d) {
		
		
		URI direccion = URI.create("https://v6.exchangerate-api.com/v6/732f2d654c0496bf56b1d875/pair/" + monedaBase + "/" + monedaFinal + "/" + d);
		
		HttpClient clienteConver = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();
		
		try {
			HttpResponse<String> response = clienteConver.send(request, HttpResponse.BodyHandlers.ofString());
			return new Gson().fromJson(response.body(), Moneda.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("No se pudo hacer la conversión.");
		}
		
	}
	
}
