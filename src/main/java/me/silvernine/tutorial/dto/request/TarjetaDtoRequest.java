package me.silvernine.tutorial.dto.request;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.formacionbdi.springboot.app.commons.models.entity.TarjetaCredito;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
public class TarjetaDtoRequest {


	private int id;
	
	
	private String titular;

 
	private String numeroTarjeta;


	private String fechaExpiracion;

	private String cvv; 
	
	public static TarjetaCredito from(TarjetaDtoRequest tarjetaDto) {
	      if(tarjetaDto == null) return null;
	      return TarjetaCredito.builder()
	              .titular(tarjetaDto.getTitular())
	              .numerotarjeta(tarjetaDto.getNumeroTarjeta())
	              .fechaExpiracion(tarjetaDto.getFechaExpiracion())
	              .cvv(tarjetaDto.getCvv())
	              .build();
	   }
	
}
