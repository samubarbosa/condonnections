package br.com.condonnections.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.condonnections.dto.UserDTO;
import br.com.condonnections.exception.BadRequestResponseException;
import br.com.condonnections.service.UserService;
import br.com.condonnections.utils.Mensagem;

@RestController
public class CadastroController {
	
	@Autowired
	private UserService UserService;

	
	@RequestMapping(name="/cadastro",method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<UserDTO>  form(){
		
		return new ResponseEntity<UserDTO>(new UserDTO(),HttpStatus.OK);

	}
	
	@RequestMapping(name="/cadastro",method=RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<UserDTO> cadastrar(@Valid  @RequestBody UserDTO userCadastro,BindingResult bindingResult){
		
		if(bindingResult.hasErrors()){
				throw new BadRequestResponseException(Mensagem.get(bindingResult));
		}
		
		UserDTO  usuarioCriado =  UserService.cadastrar(userCadastro);

		return new ResponseEntity<>(usuarioCriado,HttpStatus.CREATED);
	}
	
}
