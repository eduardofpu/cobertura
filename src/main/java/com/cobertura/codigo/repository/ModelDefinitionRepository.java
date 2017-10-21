package com.cobertura.codigo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cobertura.codigo.domain.ModelDefinition;

public interface ModelDefinitionRepository extends MongoRepository<ModelDefinition, String> {

}
