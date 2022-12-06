package com.tsti.smn.servicios;
import java.util.List;


import com.tsti.smn.entidades.clima_extendido;


public interface serviciosClima_extendido {
			
	List<clima_extendido>getPronosticoExtendido();
	clima_extendido getClimaExtendido(int id);
	void guardarClimaExtendidoNuevo(clima_extendido c_e);
	void eliminarClimaExtendidoNuevo(int id);
	void editarClimaExtendidoNuevo(clima_extendido c_e);
	List<clima_extendido>getPronosticoExtendidoCiudad(int codigo_postal);
	
	
}
