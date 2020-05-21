package cimr.ma.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class AttestaionReglementMensuelAvecIR implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAttestation;
	private String numDp;
	private String nom;
	private String reference;
	private String typeAttestation;
	private String dateDebut;
	private String dateFin;
	private String echeance;
	private String pensionBrute;
	private String montantIR;
	private String pensionNette;
	private String dateReglement;
	private String totalPensionBrute;
	private String totalMontantIR;
	private String totalPensionNet;
	private String lieuEdition;
	private String dateEdition;
	private String signataire;
	@ManyToOne
	@JoinColumn(name = "id_utilisateur")
	private Utilisateur utilisateur;

	public Long getIdAttestation() {
		return idAttestation;
	}

	public void setIdAttestation(Long idAttestation) {
		this.idAttestation = idAttestation;
	}

	public String getNumDp() {
		return numDp;
	}

	public void setNumDp(String numDp) {
		this.numDp = numDp;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getTypeAttestation() {
		return typeAttestation;
	}

	public void setTypeAttestation(String typeAttestation) {
		this.typeAttestation = typeAttestation;
	}

	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	public String getEcheance() {
		return echeance;
	}

	public void setEcheance(String echeance) {
		this.echeance = echeance;
	}

	public String getPensionBrute() {
		return pensionBrute;
	}

	public void setPensionBrute(String pensionBrute) {
		this.pensionBrute = pensionBrute;
	}

	public String getMontantIR() {
		return montantIR;
	}

	public void setMontantIR(String montantIR) {
		this.montantIR = montantIR;
	}

	public String getPensionNette() {
		return pensionNette;
	}

	public void setPensionNette(String pensionNette) {
		this.pensionNette = pensionNette;
	}

	public String getDateReglement() {
		return dateReglement;
	}

	public void setDateReglement(String dateReglement) {
		this.dateReglement = dateReglement;
	}

	public String getTotalPensionBrute() {
		return totalPensionBrute;
	}

	public void setTotalPensionBrute(String totalPensionBrute) {
		this.totalPensionBrute = totalPensionBrute;
	}

	public String getTotalMontantIR() {
		return totalMontantIR;
	}

	public void setTotalMontantIR(String totalMontantIR) {
		this.totalMontantIR = totalMontantIR;
	}

	public String getTotalPensionNet() {
		return totalPensionNet;
	}

	public void setTotalPensionNet(String totalPensionNet) {
		this.totalPensionNet = totalPensionNet;
	}

	public String getLieuEdition() {
		return lieuEdition;
	}

	public void setLieuEdition(String lieuEdition) {
		this.lieuEdition = lieuEdition;
	}

	public String getDateEdition() {
		return dateEdition;
	}

	public void setDateEdition(String dateEdition) {
		this.dateEdition = dateEdition;
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

	public AttestaionReglementMensuelAvecIR() {
		super();
		// TODO Auto-generated constructor stub
	}

}
