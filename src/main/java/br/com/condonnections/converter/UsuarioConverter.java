package br.com.condonnections.converter;


import br.com.condonnections.dto.UserDTO;
import br.com.condonnections.entities.User;

public class UsuarioConverter {
	
	public static UserDTO paraDTO(User entidade){
		UserDTO userDTO = new UserDTO();
		userDTO.setIdUsuario(entidade.getIdUsuario());	
		userDTO.setLogin(entidade.getLogin());
		userDTO.setPassword(entidade.getPassword());	
		userDTO.setApartamento(entidade.getApartamento());
		userDTO.setNmUser(entidade.getNmUser());
		userDTO.setDtNascimento(entidade.getDtNascimento());
		userDTO.setEmail(entidade.getEmail());
		userDTO.setFlgInadiplente(entidade.getFlgInadiplente());
		
		return userDTO;
	}
}
