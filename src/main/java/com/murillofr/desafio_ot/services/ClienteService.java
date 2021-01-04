package com.murillofr.desafio_ot.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.murillofr.desafio_ot.domain.Cliente;
import com.murillofr.desafio_ot.dto.ClienteDTO;
import com.murillofr.desafio_ot.repositories.ClienteRepository;
import com.murillofr.desafio_ot.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));

	}
	
	public Cliente insert(Cliente obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	
	public Cliente fromDTO(ClienteDTO objDto) {
		return new Cliente(objDto.getId(), objDto.getNome(), objDto.getEmail(), objDto.getCpf(), objDto.getDtnasc());
	}

}
