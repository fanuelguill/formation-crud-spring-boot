package com.sygfr.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sygfr.test.model.Etudiant;
import com.sygfr.test.service.EtudiantService;

@RestController
@RequestMapping("/api")
public class EtudiantController {

	@Autowired
	private EtudiantService etudiantService;
	
	@PostMapping("/etudiant/create")
	public ResponseEntity<Etudiant> create(@RequestBody Etudiant etudiant) {
		Etudiant etudiantSaved = etudiantService.create(etudiant);
		
		return ResponseEntity.ok().body(etudiantSaved);
	}
	
	@GetMapping("/etudiant/get-all")
	public ResponseEntity<List<Etudiant>> findAll() {
		List<Etudiant> etudiants = etudiantService.read();
		return ResponseEntity.ok(etudiants);
	}
	
	@PutMapping("/etudiant/update")
	public ResponseEntity<Etudiant> update(@RequestBody Etudiant etudiant) {
		Etudiant etudiantUpdated = etudiantService.update(etudiant);
		return ResponseEntity.ok().body(etudiantUpdated);
	}
	
	@DeleteMapping("/etudiant/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id) {
		etudiantService.delete(id);
		return ResponseEntity.ok().body("Etudiant supprimé avec succès");
	}
	
}
