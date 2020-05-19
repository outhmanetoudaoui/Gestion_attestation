package cimr.ma.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Attestation {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_attestation;
	private String reference;
	private String type_attestation;
	private String Date_debut;
	private String Date_fin;
	private String lieu_edition;
	private String date_edition;
	private String signataire;
	@ManyToOne
    @JoinColumn(name="id_utilisateur")
	private Utilisateur utilisateur;
	public Long getId_attestation() {
		return id_attestation;
	}
	public void setId_attestation(Long id_attestation) {
		this.id_attestation = id_attestation;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getType_attestation() {
		return type_attestation;
	}
	public void setType_attestation(String type_attestation) {
		this.type_attestation = type_attestation;
	}
	public String getDate_debut() {
		return Date_debut;
	}
	public void setDate_debut(String date_debut) {
		Date_debut = date_debut;
	}
	public String getDate_fin() {
		return Date_fin;
	}
	public void setDate_fin(String date_fin) {
		Date_fin = date_fin;
	}
	public String getLieu_edition() {
		return lieu_edition;
	}
	public void setLieu_edition(String lieu_edition) {
		this.lieu_edition = lieu_edition;
	}
	public String getDate_edition() {
		return date_edition;
	}
	public void setDate_edition(String date_edition) {
		this.date_edition = date_edition;
	}
	public String getSignataire() {
		return signataire;
	}
	public void setSignataire(String signataire) {
		this.signataire = signataire;
	}
	
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Attestation(String reference, String type_attestation, String date_debut,
			String date_fin, String lieu_edition, String date_edition, String signataire) {
		super();
		this.reference = reference;
		this.type_attestation = type_attestation;
		Date_debut = date_debut;
		Date_fin = date_fin;
		this.lieu_edition = lieu_edition;
		this.date_edition = date_edition;
		this.signataire = signataire;
	}
	public Attestation() {
		super();
	}
	
}
