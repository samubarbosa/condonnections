package br.com.condonnections.dto;



import br.com.condonnections.entities.Bloco;

public class ApartamentoDTO {
	
	private Integer idApartamento;
	
	private String nmApartamento;
	
	private Bloco bloco;

	public Integer getIdApartamento() {
		return idApartamento;
	}

	public void setIdApartamento(Integer idApartamento) {
		this.idApartamento = idApartamento;
	}

	public String getNmApartamento() {
		return nmApartamento;
	}

	public void setNmApartamento(String nmApartamento) {
		this.nmApartamento = nmApartamento;
	}

	public Bloco getBloco() {
		return bloco;
	}

	public void setBloco(Bloco bloco) {
		this.bloco = bloco;
	}
	
	
}
