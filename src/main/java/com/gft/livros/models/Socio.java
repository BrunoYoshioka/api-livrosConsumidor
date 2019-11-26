package com.gft.livros.models;

import java.io.Serializable;
import java.util.Objects;


public class Socio implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private String matricula;
	private String rg;
	private String cpf;
	private String email;
	private Emprestimo emprestimo; 
	
	public Socio() {
	}
	
	public Socio(Integer id, String nome, String matricula, String rg, String cpf, Emprestimo emprestimo, String email) {
		this.id = id;
		this.nome = nome;
		this.matricula = matricula;
		this.rg = rg;
		this.cpf = cpf;
		this.emprestimo = emprestimo;
		this.email = email;
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
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Emprestimo getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(Emprestimo emprestimo) {
		this.emprestimo = emprestimo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Socio socio = (Socio) o;
		return Objects.equals(id, socio.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
