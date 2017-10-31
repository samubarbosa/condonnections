package br.com.condonnections.seguranca.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.condonnections.entities.User;
import br.com.condonnections.repository.UserRepository;

@Service("UserDetailsServiceCustomizado")
public class UserDetailsServiceCustomizado implements UserDetailsService{

	@Autowired
	private UserRepository 	userRepository;


	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		User user = userRepository.findByLogin(login);
		if(null == user){
			throw new UsernameNotFoundException("No user present with username: "+login);
		}else{
			return new User();
		}
	}



}
