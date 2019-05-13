package br.com.gmmti.taskmanager.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gmmti.taskmanager.domain.Resource;
import br.com.gmmti.taskmanager.repositories.ResourceRepository;
import br.com.gmmti.taskmanager.services.exceptions.ObjectNotFoundException;

@Service
public class ResourceService {
	
	@Autowired
	private ResourceRepository repo;
	
	/**
	 * Search resource by 'id'
	 * @param id
	 * @return
	 */
	public Resource find(Integer id) {
		Optional<Resource> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo " + Resource.class.getName()));
	}

}
