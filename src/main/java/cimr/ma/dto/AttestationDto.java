package cimr.ma.dto;

public class AttestationDto {
	private Long id_attestation;
	private String reference;
	private String type_attestation;
	private String Date_debut;
	private String Date_fin;
	private String lieu_edition;
	private String date_edition;
	private String signataire;
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
	public AttestationDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
