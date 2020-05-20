package cimr.ma.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cimr.ma.dao.AttestationDao;
import cimr.ma.entity.Attestation;
import cimr.ma.service.AttestationService;

@Service
public class AttestationServiceImpl implements AttestationService {
	@Autowired
	AttestationDao attestationDao;
	

	@Override
	public void create(Attestation attestation) {
		
	}

	@Override
	public List<Attestation> getAllAttestation() {
		
		return null;
	}

	@Override
	public Attestation getByReferenceAttestation(String reference) {
		
		return null;
	}

}
