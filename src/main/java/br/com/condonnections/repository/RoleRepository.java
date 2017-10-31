package br.com.condonnections.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.condonnections.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long>{

}
