package uniandes.dpoo.aerolinea.modelo;

/**
 * Esta clase tiene la información de una ruta entre dos aeropuertos que cubre una aerolínea.
 */
public class Ruta
{
    private String horaSalida;
    private String horaLlegada;
    private String codigoRuta;
    private Aeropuerto origen;
    private Aeropuerto destino;
    
    public void Ruta(Aeropuerto origen, Aeropuerto destino, String horaSalida, String horaLlegada, String codigoRuta) {
    	        this.horaSalida = horaSalida;
    	        this.horaLlegada = horaLlegada;
    	        this.codigoRuta = codigoRuta;
    	        this.origen = origen;
    	        this.destino= destino;
       
    }
    
    


    public String getHoraSalida() {
		return horaSalida;
	}



	public String getHoraLlegada() {
		return horaLlegada;
	}





	public String getCodigoRuta() {
		return codigoRuta;
	}


	public Aeropuerto getOrigen () {
		return this.origen;
	}

	
	public Aeropuerto getDestino() {
		return this.destino;
	}
	
	public int getDuracion() {
		int llegada = Integer.parseInt(this.getHoraLlegada());
		int salida = Integer.parseInt(this.getHoraSalida());
		
		int duracion = llegada - salida;
		
		int minutos = this.getMinutos(duracion);
		int horasAminutos = this.getHoras(duracion) * 60;
		
		int duracionTotal = horasAminutos + minutos;
		
		
		return duracionTotal;
	}

	/**
     * Dada una cadena con una hora y minutos, retorna los minutos.
     * 
     * Por ejemplo, para la cadena '715' retorna 15.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de minutos entre 0 y 59
     */
    public static int getMinutos( int horaCompleta )
    {
        int minutos =  horaCompleta % 100;
        return minutos;
    }

    /**
     * Dada una cadena con una hora y minutos, retorna las horas.
     * 
     * Por ejemplo, para la cadena '715' retorna 7.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de horas entre 0 y 23
     */
    public static int getHoras( int horaCompleta )
    {
        int horas =  horaCompleta / 100;
        return horas;
    }

    
}
