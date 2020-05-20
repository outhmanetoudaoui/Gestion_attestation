package cimr.ma.metierImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cimr.ma.dao.AttestationDao;
import cimr.ma.entity.Attestation;
import cimr.ma.metier.AttestationMetier;
@Service
public class AttestationMetierImpl implements AttestationMetier {
	@Autowired
	private AttestationDao attestationRepo;
	@Override
	public void create(Attestation attestation) {
		attestationRepo.save(attestation);

	}

	@Override
	public List<Attestation> getAllAttestation() {
		return attestationRepo.findAll();
	}

	@Override
	public Attestation getByReferenceAttestation(String reference) {
		return attestationRepo.getByReferenceAttestation(reference);
	}

}
