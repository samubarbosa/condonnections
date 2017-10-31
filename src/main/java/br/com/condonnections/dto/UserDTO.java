package br.com.condonnections.dto;

import java.time.LocalDate;

import br.com.condonnections.entities.Apartamento;

public class UserDTO {
	
	private Long idUsuario;
	
	private String login;

	private String password;	
	
	private Apartamento apartamento;
	
	private String nmUser;
	
	private LocalDate  dtNascimento;
	
	private String email;
	
	private boolean flgInadiplente;

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Apartamento getApartamento() {
		return apartamento;
	}

	public void setApartamento(Apartamento apartamento) {
		this.apartamento = apartamento;
	}

	public String getNmUser() {
		return nmUser;
	}

	public void setNmUser(String nmUser) {
		this.nmUser = nmUser;
	}


	public LocalDate getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(LocalDate dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isFlgInadiplente() {
		return flgInadiplente;
	}

	public void setFlgInadiplente(boolean flgInadiplente) {
		this.flgInadiplente = flgInadiplente;
	}
	
	
}
