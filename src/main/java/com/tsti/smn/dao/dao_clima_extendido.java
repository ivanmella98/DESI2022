package com.tsti.smn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tsti.smn.entidades.Ciudad;
import com.tsti.smn.entidades.clima_extendido;

@Repository
public interface dao_clima_extendido extends JpaRepository<clima_extendido , Ciudad>{

}
