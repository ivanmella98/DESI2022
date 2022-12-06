package com.tsti.smn.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsti.smn.dao.dao_clima_extendido;
import com.tsti.smn.entidades.clima_extendido;

@Service
public class serviciosClima_extendidoImp implements serviciosClima_extendido{
	@Autowired
	dao_clima_extendido repo;
	
	@Override
	public List<clima_extendido> getPronosticoExtendido(){
		return repo.findAll();
	}
	
	@Override
	public clima_extendido getClimaExtendido(int id){
		return repo.findByIdClima(id);
	}
	
	@Override
	public void guardarClimaExtendidoNuevo(clima_extendido c_e){
		repo.save(c_e);
	}
	
	
	@Override
	public void eliminarClimaExtendidoNuevo(int id){
		repo.deleteById(id);
	}
	
	@Override
	public void editarClimaExtendidoNuevo(clima_extendido c_e){
			repo.save(c_e);
	}
	@Override
	public List<clima_extendido>getPronosticoExtendidoCiudad(int codigo_postal){
		return repo.findById(codigo_postal);
		
	}
	
}
