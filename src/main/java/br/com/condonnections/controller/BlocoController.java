package br.com.condonnections.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.condonnections.entities.Bloco;
import br.com.condonnections.repository.BlocoRepository;


@RestController
public class BlocoController {
	
	@Autowired
	private BlocoRepository blocoReposity;
	
	@RequestMapping(name="/bloco", method=RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE )
	public String getOne(){
		Bloco bloco = new Bloco();
		bloco.setNmBloco("Bloco 1");
		bloco = blocoReposity.save(bloco);
		
		return blocoReposity.findOne(bloco.getIdBloco()).getNmBloco(); 
	}

}
