package com.tsti.smn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tsti.smn.entidades.Ciudad;

@Repository
public interface dao_Ciudad extends JpaRepository<Ciudad, Integer>{

}
