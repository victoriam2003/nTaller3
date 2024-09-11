package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import uniandes.dpoo.aerolinea.modelo.Aerolinea;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {
	
	private List<Tiquete> tiquetesSinUsar= new ArrayList<>();
	private List<Tiquete> tiquetesUsados= new ArrayList<>();
	
	public void cliente() {
	}

	public abstract String getTipoCliente(); 
	
	public List<Tiquete> getTiquetesSinUsar() {
		return tiquetesSinUsar;
	}
	
	public List<Tiquete> getTiquetesUsados() {
		return tiquetesUsados;
	}
	
	
	public abstract String getIdentificador();
	
	
	public void agregarTiquete(Tiquete tiquete) {
		tiquetesSinUsar.add(tiquete);
	}
	
	public int calcularValorTotal() {
		int valor = 0;
		
		for (Tiquete tiquete : tiquetesSinUsar) {
			valor+=tiquete.getTarifa();
			}
		
		return valor;
    }

	public void usarTiquetes(Vuelo vuelo) {
		Collection<Tiquete>tiquetes = vuelo.getTiquetes();
	
		
		for (Tiquete tiquete : tiquetes) {
			Cliente cliente = tiquete.getCliente();
			
			if (cliente.getIdentificador().equals(this.getIdentificador())) {
				tiquete.marcarComoUsado();
				tiquetesUsados.add(tiquete);
				tiquetesSinUsar.remove(tiquete);
			}}}}
		

