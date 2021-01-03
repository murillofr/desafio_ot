package com.murillofr.desafio_ot.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.murillofr.desafio_ot.domain.Cliente;

@RestController
@RequestMapping(value="/clientes")
public class ClienteResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Cliente> find() {
		
		Cliente cliente1 = new Cliente(1, "João", "joao@gmail.com", "00011122233", "01/01/2001");
		
		Cliente cliente2 = new Cliente(2, "Maria", "maria@gmail.com", "99988877766", "02/02/2002");
		
		List<Cliente> lista = new ArrayList<>();
		lista.add(cliente1);
		lista.add(cliente2);
		
		return lista;
	}
	
}
