package com.java.candidateapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.candidateapi.models.CandidateDetailsModels;
import com.java.candidateapi.repository.CandidateDetailsRepository;

@Service

public class CandidateDetailsService {
	
	@Autowired
	CandidateDetailsRepository candidateDetailsRepository;

	public CandidateDetailsModels saveCandidateDetails(CandidateDetailsModels candidateDetailsModels) {
		
		return candidateDetailsRepository.save(candidateDetailsModels);
	}

	public List<CandidateDetailsModels> getAllCandidateDetails() {
		return (List<CandidateDetailsModels>)candidateDetailsRepository.findAll();
	}

	public CandidateDetailsModels getCandidateDetailsById(int id) {
		return candidateDetailsRepository.findById(id);
	}

	public CandidateDetailsModels updateCandidateDetails(CandidateDetailsModels candidateDetailsModels) {
		return candidateDetailsRepository.save(candidateDetailsModels);
		
	}

	public void deleteCandidateDetailsById(int id) {

		candidateDetailsRepository.deleteById(id);
	}

	



}
