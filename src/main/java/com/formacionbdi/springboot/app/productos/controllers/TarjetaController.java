package com.formacionbdi.springboot.app.productos.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formacionbdi.springboot.app.commons.models.entity.TarjetaCredito;
import com.formacionbdi.springboot.app.productos.models.service.TarjetaService;

import me.silvernine.tutorial.dto.request.TarjetaDtoRequest;


@RestController
//@RequestMapping("/tarjeta")
@CrossOrigin
@Controller
public class TarjetaController {
	private final TarjetaService tarjetaService;

    public TarjetaController(TarjetaService _tarjetaService) {
        this.tarjetaService = _tarjetaService;
    }

    @PostMapping("/")
    public ResponseEntity<TarjetaCredito> save(@Valid @RequestBody TarjetaDtoRequest tarjetaDto) {
        
    	return ResponseEntity.ok(tarjetaService.save(tarjetaDto));
    }
    
    @GetMapping("/")
    public ResponseEntity<List<TarjetaCredito>> findAll() {
    	List<TarjetaCredito> listTarjetas = tarjetaService.findAll();
        return ResponseEntity.ok(listTarjetas);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<TarjetaCredito> findById(Long id) {
        return ResponseEntity.ok(tarjetaService.findById(id));
    }

}
