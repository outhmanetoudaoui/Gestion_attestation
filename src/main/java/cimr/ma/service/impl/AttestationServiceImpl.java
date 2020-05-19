package cimr.ma.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cimr.ma.entity.Attestation;
import cimr.ma.service.AttestationService;

@Service
@Transactional
public class AttestationServiceImpl implements AttestationService {

	@Override
	public void create(Attestation attestation) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Attestation> getAllAttestation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Attestation getByReferenceAttestation(String reference) {
		// TODO Auto-generated method stub
		return null;
	}

}
