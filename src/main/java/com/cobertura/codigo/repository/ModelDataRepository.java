package com.cobertura.codigo.repository;

import java.util.Collection;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.cobertura.codigo.domain.ModelData;

public interface ModelDataRepository extends MongoRepository<ModelData, UUID> {
	
	
	Collection<ModelData> findByModelName(String modelName);
	ModelData findByIdAndModelName(UUID id, String modelName);
	
}
