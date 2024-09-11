package uniandes.dpoo.aerolinea.modelo;
import java.util.ArrayList;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import uniandes.dpoo.aerolinea.exceptions.VueloSobrevendidoException;
import uniandes.dpoo.aerolinea.modelo.Avion;
import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {
	
	private String fecha;
	private Avion avion;
	private Ruta ruta;
	private Map<String, Tiquete> tiquetes;
	
	public Vuelo(Ruta ruta, String fecha, Avion avion) {

		this.fecha = fecha;
		this.ruta = ruta;
		this.avion = avion;

	}
// Getters
	
	public String getFecha() {
		return fecha;
	}
	public Avion getAvion() {
		return avion;
	}
	public Ruta getRuta() {
		return ruta;
	}
	
	public Collection<Tiquete> getTiquetes() {
		return tiquetes.values();
	}
	

// Setters
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public void setAvion(String fecha) {
		this.fecha = fecha;
	}
	
	public void setRuta(String fecha) {
		this.fecha = fecha;
	}
	
	
//funciones
	
	public double venderTiqutes (Cliente cliente, CalculadoraTarifas calculadora, int cantidad) throws VueloSobrevendidoException
	{
		Collection<Tiquete> tiquete = getTiquetes();
		double tarifa = calculadora.CalcularTarifa(this, cliente);

		
		if (tiquete.size()+ cantidad > avion.getCapacidad()) {
			throw new VueloSobrevendidoException(this);
			
        }
		double valor = tarifa*cantidad;
		return valor;}

	
	
	public boolean equals(Object obj) {
		return false;
	}
	
}


