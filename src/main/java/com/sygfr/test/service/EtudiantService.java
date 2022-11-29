package com.sygfr.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sygfr.test.model.Etudiant;
import com.sygfr.test.repository.EtudiantRepository;

@Service
public class EtudiantService {

	@Autowired
	private EtudiantRepository etudiantRepository;
	
	public Etudiant create(Etudiant etudiant) {
		Etudiant etudiantSaved = etudiantRepository.save(etudiant);
		return etudiantSaved;
	}
	
	public List<Etudiant> read() {
		return etudiantRepository.findAll();
	}
	
	public Etudiant update(Etudiant etudiant) {
		Etudiant etudiantUpdated = etudiantRepository.save(etudiant);
		return etudiantUpdated;
	}
	
	public void delete(Long id) {
		etudiantRepository.deleteById(id);
	}
	
	public Etudiant findById(Long id) {
		return etudiantRepository.findById(id).get();
	}
	
}
