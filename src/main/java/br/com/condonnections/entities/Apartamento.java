package br.com.condonnections.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="TB_APARTAMENTO")
public class Apartamento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_APARTAMENTO")
	private Integer idApartamento;
	
	@Column(name="NM_APARTAMENTO")
	private String nmApartamento;
	
	public String getNmApartamento() {
		return nmApartamento;
	}

	public void setNmApartamento(String nmApartamento) {
		this.nmApartamento = nmApartamento;
	}

	//@NotBlank
	@ManyToOne
	private Bloco bloco;

	public Integer getIdApartamento() {
		return idApartamento;
	}

	public void setIdApartamento(Integer idApartamento) {
		this.idApartamento = idApartamento;
	}

	public Bloco getBloco() {
		return bloco;
	}

	public void setBloco(Bloco bloco) {
		this.bloco = bloco;
	}

	
}
