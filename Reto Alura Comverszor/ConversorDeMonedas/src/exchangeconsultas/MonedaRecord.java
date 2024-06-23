package exchangeconsultas;

public record MonedaRecord(Moneda moneda, double valorInicial) {

	@Override
	public String toString() {
		return "El valor " + valorInicial + "" + moneda;
	}
	
	
	
}
