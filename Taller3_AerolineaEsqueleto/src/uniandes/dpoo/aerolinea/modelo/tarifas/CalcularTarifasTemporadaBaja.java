package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.cliente.ClienteCorporativo;

public class CalcularTarifasTemporadaBaja extends CalculadoraTarifas {

	protected int costo_por_km_natural = 600;
	protected int costo_por_km_ejecutivo = 900;
	protected double descuento_peq = 0.02;
	protected double descuento_medianos = 0.1;
	protected double descuento_grandes = 0.2;
	
	public CalcularTarifasTemporadaBaja() {
		super();
	}
	
	@Override
	public int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		
		int distancia = calcularDistanciaVuelo(vuelo.getRuta());
		
		if (cliente.getTipoCliente().equals("Natural")) {
			
			return distancia * costo_por_km_natural;
		} else {
			return distancia * costo_por_km_ejecutivo;
		}
	}
	
	
	@Override
	public double calcularPorcentajeDescuento(Cliente cliente) {
		
		String tipo = cliente.getTipoCliente();
		
		if (tipo.equals("corporativo")) {
			
			ClienteCorporativo ClienteCorporativo = (ClienteCorporativo) cliente;
			int tamano = ClienteCorporativo.getTamanoEmpresa();
			if (tamano == 3) {
				return descuento_grandes;
			} else if (tamano == 2) {
				return descuento_medianos;
			} else if (tamano==1){
				return descuento_peq;}
		}
		
			return 0.0;
		}
		}


		
