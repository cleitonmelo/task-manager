package br.com.gmmti.taskmanager.services;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gmmti.taskmanager.domain.Resource;
import br.com.gmmti.taskmanager.repositories.ResourceRepository;

@Service
public class DBService {
	
	@Autowired
	private ResourceRepository resourceRepository;
	
	public void instatiateTestDatabase() throws ParseException {
		
		Resource rec1 = new Resource(null, "Cleiton Melo da Silva", "cleiton.silva@gmmti.com.br" );
		
		resourceRepository.saveAll(Arrays.asList(rec1));
	}

}
