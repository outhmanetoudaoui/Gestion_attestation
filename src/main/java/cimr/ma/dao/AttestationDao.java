package cimr.ma.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import cimr.ma.entity.Attestation;

public interface AttestationDao  extends JpaRepository<Attestation, Long>{
	@Query("select att from Attestation att where att.reference=:x")
	public Attestation getByReferenceAttestation(@Param("x")String reference);
}
