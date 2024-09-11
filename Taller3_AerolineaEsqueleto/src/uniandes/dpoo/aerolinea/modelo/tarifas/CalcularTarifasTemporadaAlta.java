package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalcularTarifasTemporadaAlta extends CalculadoraTarifas {

	protected int costo_por_km = 1000;
	
	public CalcularTarifasTemporadaAlta() {
        super();
        }
	
	@Override
	public int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		
		
		int distancia = calcularDistanciaVuelo(vuelo.getRuta());
		
		return distancia * costo_por_km;
	}	
@Override
	public double calcularPorcentajeDescuento(Cliente cliente) {
		return 0;
	}
}
