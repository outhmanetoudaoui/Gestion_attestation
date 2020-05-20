package cimr.ma.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Utilisateur implements Serializable  {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_utilisateur;
	private String nom;
	private String prenom;
	private String agence_affectation;
	private String login;
	private String password;
	private String role;
	@OneToMany(mappedBy="utilisateur",cascade=CascadeType.ALL,orphanRemoval=true)
	List<Attestation> attestations;
	public Long getId_utilisateur() {
		return id_utilisateur;
	}
	public void setId_utilisateur(Long id_utilisateur) {
		this.id_utilisateur = id_utilisateur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAgence_affectation() {
		return agence_affectation;
	}
	public void setAgence_affectation(String agence_affectation) {
		this.agence_affectation = agence_affectation;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Utilisateur(String nom, String prenom, String agence_affectation, String login, String password,
			String role) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.agence_affectation = agence_affectation;
		this.login = login;
		this.password = password;
		this.role = role;
	}

	

}
