package cimr.ma.service;

import java.util.List;

import cimr.ma.entity.Attestation;

public interface AttestationService {
	public void create(Attestation attestation);
	public List<Attestation> getAllAttestation();
	public Attestation getByReferenceAttestation(String reference);

}
