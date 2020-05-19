package cimr.ma.dao;

import java.util.List;

import cimr.ma.entity.Attestation;

public interface AttestationDao {
	public void create(Attestation attestation);
	public List<Attestation> getAllAttestation();
	public Attestation getByReferenceAttestation(String reference);
}
