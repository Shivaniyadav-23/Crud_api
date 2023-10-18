package com.java.candidateapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.java.candidateapi.models.CandidateDetailsModels;

@Repository
public interface CandidateDetailsRepository extends CrudRepository<CandidateDetailsModels, Integer> {

	CandidateDetailsModels findById(int id);
	
	
}
