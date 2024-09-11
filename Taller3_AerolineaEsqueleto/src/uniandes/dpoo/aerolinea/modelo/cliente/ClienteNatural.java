package uniandes.dpoo.aerolinea.modelo.cliente;

public class ClienteNatural extends Cliente {

	public static String NATURAL= "Natural";
	private String nombre;
	
	public ClienteNatural(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	@Override
	public String getIdentificador() {
		return "CN-" + nombre;
	}

	@Override
	public String getTipoCliente() {
		return NATURAL;
	}
	
}
