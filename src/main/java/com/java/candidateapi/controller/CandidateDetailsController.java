package com.java.candidateapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.candidateapi.models.CandidateDetailsModels;
import com.java.candidateapi.services.CandidateDetailsService;

@RestController
@RequestMapping("/api")
public class CandidateDetailsController {
	
	@Autowired
	CandidateDetailsService candidateDetailsService;
	
	
	@PostMapping("/save/_candidateDetails")
	public CandidateDetailsModels saveCandidateDetails(@RequestBody CandidateDetailsModels candidateDetailsModels) {
		CandidateDetailsModels candDetails = candidateDetailsService.saveCandidateDetails(candidateDetailsModels);
		return candDetails;
		
	}
	
	
	@GetMapping("/_getAllCandidateDetails")
	public List<CandidateDetailsModels> getAllCandidateDetails(){
		List<CandidateDetailsModels> candDetails = candidateDetailsService.getAllCandidateDetails();
		return candDetails;
	}
	
	@GetMapping("/_getCandidateDetailsById/{id}")
	public CandidateDetailsModels getCandidateDetailsById(@PathVariable int id) {
		CandidateDetailsModels candDetails = candidateDetailsService.getCandidateDetailsById(id);
		return candDetails;
	}
	
	@PutMapping("/_updateCandidateDetails")
	public CandidateDetailsModels updateCandidateDetails(@RequestBody CandidateDetailsModels candidateDetailsModels) {
		CandidateDetailsModels candDetails = candidateDetailsService.updateCandidateDetails(candidateDetailsModels);
		return candDetails;
	}
	
	@DeleteMapping("/_deleteCandidateDetailsById/{id}")
	public void deleteCandidateDetailsById(@PathVariable int id) {
		candidateDetailsService.deleteCandidateDetailsById(id);
	}
	
	
}
