package com.formacionbdi.springboot.app.productos.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import me.silvernine.tutorial.dto.request.TarjetaDtoRequest;
import com.formacionbdi.springboot.app.commons.models.entity.TarjetaCredito;
import com.formacionbdi.springboot.app.productos.models.dao.TarjetaRepository;

@Service
public class TarjetaService {
    private final TarjetaRepository tarjetaRepository;

    public TarjetaService(TarjetaRepository _tarjetaRepository) {
        this.tarjetaRepository = _tarjetaRepository;
    }

    @Transactional
    public TarjetaCredito save(TarjetaDtoRequest tarjetaDto) {
    	TarjetaCredito tarjeta;
        TarjetaCredito tarjetaResult;
        try {
        	tarjeta = TarjetaDtoRequest.from(tarjetaDto);
            tarjetaResult = tarjetaRepository.save(tarjeta);	
        }catch(Exception ex) {
        	throw ex;
        }
        return tarjetaResult;
    }
    
    @Transactional
    public List<TarjetaCredito> findAll() {
        List<TarjetaCredito> listTarjeta = tarjetaRepository.findAll();
        return listTarjeta;
    }
    
    @Transactional
    public TarjetaCredito findById(Long id) {
        Optional<TarjetaCredito> listTarjeta = tarjetaRepository.findById(id);
        TarjetaCredito tarjeta;
        if(listTarjeta.isPresent()) {
        	tarjeta = listTarjeta.get();
        }else {
        	tarjeta = new TarjetaCredito();
        }
        return tarjeta;
    }

}
