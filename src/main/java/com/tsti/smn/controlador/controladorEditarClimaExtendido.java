package com.tsti.smn.controlador;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tsti.smn.entidades.clima_extendido;
import com.tsti.smn.servicios.serviciosCiudad;
import com.tsti.smn.servicios.serviciosClima_extendidoImp;

@Controller
public class controladorEditarClimaExtendido {
	@Autowired
	serviciosClima_extendidoImp s_climaExtendido;
	@Autowired
	serviciosCiudad sc ;
	
	@GetMapping("/editarClimaExtendido")
	public String editarClimaExtendidoView(Model model) {

		model.addAttribute("clima_extendido",new clima_extendido());
		model.addAttribute("ciudades", sc.getCiudades());


		return "editarClimaExtendido";
	}
	

       
	
	@PostMapping("/climaExtendidoEditar")
	public String nuevoClimaExtendido(@ModelAttribute("clima_extendido") @Valid  clima_extendido clima_extendido,Model model, @RequestParam String action){
		
		if(action.equals("seleccionar")) {
			model.addAttribute("climas_extendidos", s_climaExtendido.getPronosticoExtendidoCiudad(clima_extendido.getCodigo_postal()));
		}

		return "editarClimaExtendido";
	}
}
