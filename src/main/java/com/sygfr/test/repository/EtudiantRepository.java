package com.sygfr.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sygfr.test.model.Etudiant;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

}
