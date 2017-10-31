package br.com.condonnections.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.condonnections.entities.Bloco;

@Repository
public interface BlocoRepository extends JpaRepository<Bloco, Long> {

}
