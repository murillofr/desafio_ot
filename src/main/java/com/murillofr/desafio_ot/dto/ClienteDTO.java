package com.murillofr.desafio_ot.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import com.murillofr.desafio_ot.domain.Cliente;

public class ClienteDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	@NotEmpty(message="Preenchimento obrigatório")
	private String nome;
	
	@NotEmpty(message="Preenchimento obrigatório")
	private String email;
	
	@NotEmpty(message="Preenchimento obrigatório")
	private String cpf;
	
	@NotEmpty(message="Preenchimento obrigatório")
    private String dtnasc;
    
    public ClienteDTO () {
    }
    
    public ClienteDTO (Cliente obj) {
    	id = obj.getId();
    	nome = obj.getNome();
    	email = obj.getEmail();
    	cpf = obj.getCpf();
    	dtnasc = obj.getDtnasc();
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDtnasc() {
		return dtnasc;
	}

	public void setDtnasc(String dtnasc) {
		this.dtnasc = dtnasc;
	}

}
