package br.com.solimar.sidosp.core.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Cidade implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;
	
	@ManyToOne
	private Estado estado;
	
	@OneToMany(mappedBy="cidade")
	private List<Agendamento> doacoes;
	
	@OneToMany(mappedBy="cidade")
	private List<Laboratorio> laboratorios;
	
	
	public Cidade() {
	}
	
	

	public Cidade(Long id) {
		this.id = id;
	}



	public Cidade(String nome, Estado estado) {
		this.nome = nome;
		this.estado = estado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Agendamento> getDoacoes() {
		return doacoes;
	}

	public void setDoacoes(List<Agendamento> doacoes) {
		this.doacoes = doacoes;
	}

}
