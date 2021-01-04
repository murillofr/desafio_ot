package com.murillofr.desafio_ot;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.murillofr.desafio_ot.domain.Cliente;
import com.murillofr.desafio_ot.repositories.ClienteRepository;

@SpringBootApplication
public class DesafioOtApplication implements CommandLineRunner {
	
	@Autowired
	private ClienteRepository clienteRepository;

	public static void main(String[] args) {
		SpringApplication.run(DesafioOtApplication.class, args);		
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		Cliente cliente1 = new Cliente(null, "João", "joao@gmail.com", "00011122233", "01/01/2001");
		Cliente cliente2 = new Cliente(null, "Maria", "maria@gmail.com", "99988877766", "02/02/2002");
		Cliente cliente3 = new Cliente(null, "José", "jose@gmail.com", "12345678900", "03/03/2003");
		
		clienteRepository.saveAll(Arrays.asList(cliente1, cliente2, cliente3));
		
	}

}
