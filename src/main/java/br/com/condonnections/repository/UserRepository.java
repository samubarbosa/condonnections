package br.com.condonnections.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.condonnections.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	public User findByNmUser(String nmUser);
	public User findByLogin(String login);
}
