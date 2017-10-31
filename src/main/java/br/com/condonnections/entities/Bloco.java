package br.com.condonnections.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="TB_BLOCO")
public class Bloco {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idBloco;
	
	//@NotBlank
	//@Max(25)
	private String nmBloco;

	public Long getIdBloco() {
		return idBloco;
	}

	public void setIdBloco(Long idBloco) {
		this.idBloco = idBloco;
	}

	public String getNmBloco() {
		return nmBloco;
	}

	public void setNmBloco(String nmBloco) {
		this.nmBloco = nmBloco;
	}
	
	
}
