package br.com.gmmti.taskmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.gmmti.taskmanager.domain.Resource;
import br.com.gmmti.taskmanager.services.ResourceService;

@RestController
@RequestMapping(value = "/recursos")
public class ResourceController {

	@Autowired
	private ResourceService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Resource> find(@PathVariable Integer id) {
		Resource obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}

}
