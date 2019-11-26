package com.gft.livros.models;


import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import com.gft.livros.models.enums.Status;

public class Emprestimo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer Id;
	private LocalDate dataEmprestimo;
	private LocalDate dataDevolucao;
	private BigDecimal valorEmprestimo;
	private BigDecimal valorMulta;
	private Status status = Status.NOPRAZO;
	private Socio socio;

	public Emprestimo(Integer id, LocalDate dataEmprestimo, LocalDate dataDevolucao, BigDecimal valorEmprestimo, BigDecimal valorMulta, Socio socio, Status status) {
		Id = id;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
		this.valorEmprestimo = valorEmprestimo;
		this.valorMulta = valorMulta;
		this.socio = socio;
		this.status = status;
	}

	public Emprestimo () {
	}
	
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(LocalDate dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public BigDecimal getValorEmprestimo() {
		return valorEmprestimo;
	}

	public void setValorEmprestimo(BigDecimal valorEmprestimo) {
		this.valorEmprestimo = valorEmprestimo;
	}

	public BigDecimal getValorMulta() {
		return valorMulta;
	}

	public void setValorMulta(BigDecimal valorMulta) {
		this.valorMulta = valorMulta;
	}

	public Socio getSocio() {
		return socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emprestimo other = (Emprestimo) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}
	
	
	
}
