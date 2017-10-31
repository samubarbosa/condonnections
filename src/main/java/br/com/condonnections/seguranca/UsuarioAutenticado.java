package br.com.condonnections.seguranca;

import org.springframework.security.core.context.SecurityContextHolder;

import br.com.condonnections.entities.Apartamento;
import br.com.condonnections.entities.Bloco;
import br.com.condonnections.entities.User;


public class UsuarioAutenticado {

	public static Long getIdUsuario() {
		return getUsuarioAutenticado().getIdUsuario();
	}

	public static String getLogin() {
		return getUsuarioAutenticado().getUsername();
	}

	public static String getSenha() {
		return getUsuarioAutenticado().getPassword();
	}

	public static Apartamento getApartamento() {
		return getUsuarioAutenticado().getApartamento();
	}

	public static Bloco getBloco() {
		return getUsuarioAutenticado().getApartamento().getBloco();
	}
	

	private static User getUsuarioAutenticado() {

		User usuarioDetails = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		return usuarioDetails;
	}
}
