package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete {
	private String codigo;
	private double tarifa;
	private boolean usado;
	private Vuelo vuelo;
	private Cliente cliente;
	
// constructor
	
	public Tiquete(String codigo, Vuelo vuelo, Cliente clienteComprador, double tarifa) {
		this.codigo = codigo;
		this.vuelo = vuelo;
		this.cliente = clienteComprador;
		this.tarifa = tarifa;
	}
	
// getters
	public double getTarifa() {
		return tarifa;
	}

	public String getCodigo() {
		return codigo;
	}
	
	public Vuelo getVuelo() {
		return vuelo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
// methods
	
	public void marcarComoUsado() {
		this.usado = true;
		
	}
	
	public boolean esUsado() {
		return usado;
	}
	
}
