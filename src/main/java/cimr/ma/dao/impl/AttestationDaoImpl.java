package cimr.ma.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cimr.ma.dao.AttestationDao;
import cimr.ma.entity.Attestation;

@Repository
@Transactional
public class AttestationDaoImpl implements AttestationDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void create(Attestation attestation) {
		sessionFactory.getCurrentSession().save(attestation);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Attestation> getAllAttestation() {
		return (List<Attestation>) sessionFactory.getCurrentSession().createQuery("select att from Attestation att")
				.list();
	}

	@Override
	public Attestation getByReferenceAttestation(String reference) {
		return sessionFactory.getCurrentSession().get(Attestation.class, reference);
	}

}
