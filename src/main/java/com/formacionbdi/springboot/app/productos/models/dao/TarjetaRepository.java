package com.formacionbdi.springboot.app.productos.models.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.formacionbdi.springboot.app.commons.models.entity.TarjetaCredito;

public interface TarjetaRepository extends JpaRepository<TarjetaCredito, Long> {
	   List<TarjetaCredito> findAll();
	   Optional<TarjetaCredito> findById(Long id);
	   //@EntityGraph(attributePaths = "authorities")
	   //Optional<Menu> findOneWithAuthoritiesByUsername(String username);
}
