package com.tsti.smn.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tsti.smn.entidades.Clima;
import com.tsti.smn.entidades.clima_extendido;

@Repository
public interface dao_Clima extends JpaRepository<Clima,Integer>{
		
		
}
