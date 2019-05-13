package br.com.gmmti.taskmanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gmmti.taskmanager.domain.Resource;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Integer> {

}
