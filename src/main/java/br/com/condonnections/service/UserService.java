package br.com.condonnections.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.condonnections.converter.UsuarioConverter;
import br.com.condonnections.dto.UserDTO;
import br.com.condonnections.entities.Apartamento;
import br.com.condonnections.entities.Bloco;
import br.com.condonnections.entities.User;
import br.com.condonnections.repository.ApartamentoRepository;
import br.com.condonnections.repository.BlocoRepository;
import br.com.condonnections.repository.RoleRepository;
import br.com.condonnections.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BlocoRepository blocoRepository;
	
	@Autowired
	private ApartamentoRepository apartamentoDAO;
	
	@Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	private RoleRepository roleRepository;
	
	public UserDTO cadastrar(UserDTO userCadastro){
		
		Bloco bloco = new Bloco();
		bloco.setNmBloco("4");
		blocoRepository.save(bloco);
		
		Apartamento apartamento = new Apartamento();
		apartamento.setNmApartamento("44");
		apartamento.setBloco(bloco);
		apartamentoDAO.save(apartamento);
		
		User user = new User();
		BeanUtils.copyProperties(userCadastro,user);
		user.setFlgInadiplente(false);
		user.setApartamento(apartamento);
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(roleRepository.findAll());
		User userCriado = userRepository.save(user);
		
		return UsuarioConverter.paraDTO(userCriado);
	}
	
   
}
