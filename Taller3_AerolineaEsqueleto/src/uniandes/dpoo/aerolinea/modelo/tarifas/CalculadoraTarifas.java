package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Aeropuerto;
import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public abstract class CalculadoraTarifas {
	public double impuesto = 0.28;
	
	public CalculadoraTarifas() {
        
    }
	
	
	public double CalcularTarifa (Vuelo vuelo, Cliente cliente) {
		
		int costoBase = calcularCostoBase(vuelo, cliente);
		double descuento = calcularPorcentajeDescuento(cliente);
		int impuestos = calcularValorImpuestos(costoBase);
	
		return costoBase-(costoBase*descuento)+impuestos;
	}
		
	
	protected abstract int calcularCostoBase(Vuelo vuelo, Cliente cliente);
 
	
	protected abstract double calcularPorcentajeDescuento(Cliente cliente);

	
	protected int calcularDistanciaVuelo(Ruta ruta) {
		
		Aeropuerto origen =ruta.getOrigen();
		Aeropuerto destino = ruta.getDestino();
		
		int distancia = Aeropuerto.calcularDistancia(origen, destino);
		
		return distancia;
		        
	}
	
	protected int calcularValorImpuestos(int costoBase) {
		return (int) (costoBase * impuesto);
	}
	
	
}
