package cimr.ma.metier;

import java.util.List;

import cimr.ma.entity.Attestation;

public interface AttestationMetier {
	public void create(Attestation attestation);
	public List<Attestation> getAllAttestation();
	public Attestation getByReferenceAttestation(String reference);
}
