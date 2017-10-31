package br.com.condonnections.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;



@Entity
@Table(name="TB_USER")
public class User implements UserDetails{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idUsuario;
	
	@NotNull
	@Length(min=4,max=12)
	private String login;
	
	@NotNull
	@Length(min=4,max=200)
	private String password;	
	
	//@NotBlank
	@ManyToOne
	@JoinColumn(name="ID_APARTAMENTO")
	private Apartamento apartamento;
	
	@NotNull
	@Column(name="NM_USER")
	private String nmUser;
	
	@Column(name="DT_NASCIMENTO")
	private LocalDate  dtNascimento;
	
	@NotNull
	private String email;
	
	@Column(name="FLG_INADIPLENTE")
	private boolean flgInadiplente;

	@Column(name="NUM_TEL_CONTATO",length=16,nullable=false)
	//@NotBlank
	private String numTelContato;
	
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	@ManyToMany(fetch= FetchType.EAGER)
	private List<Role> roles = new ArrayList<>();

	public String getNumTelContato() {
		return numTelContato;
	}
	public void setNumTelContato(String numTelContato) {
		this.numTelContato = numTelContato;
	}
	public Apartamento getApartamento() {
		return apartamento;
	}
	public void setApartamento(Apartamento apartamento) {
		this.apartamento = apartamento;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNmUser() {
		return nmUser;
	}
	public void setNmUser(String nmUser) {
		this.nmUser = nmUser;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean getFlgInadiplente() {
		return flgInadiplente;
	}
	public void setFlgInadiplente(boolean flgInadiplente) {
		this.flgInadiplente = flgInadiplente;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	public LocalDate getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(LocalDate dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return roles;
	}
	@Override
	public String getUsername() {
		return login;
	}
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	

}
