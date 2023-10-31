package com.example.ma.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Marque {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMarque;
	private String nomMarque;
	private Double chiffreaffaire;
	private Date dateValidation;
	private String secteurActivite;
	private String slogan ;
	public Long getIdMarque() {
		return idMarque;
	}


	public void setIdMarque(Long idMarque) {
		this.idMarque = idMarque;
	}


	public Pays getPays() {
		return pays;
	}


	public void setPays(Pays pays) {
		this.pays = pays;
	}


	public Marque() {
		super();
		}
	
	
	public String getNomMarque() {
		return nomMarque;
	}
	public void setNomMarque(String nomMarque) {
		this.nomMarque = nomMarque;
	}
	public Double getChiffreaffaire() {
		return chiffreaffaire;
	}
	public void setChiffreaffaire(Double chiffreaffaire) {
		this.chiffreaffaire = chiffreaffaire;
	}
	public Date getDateValidation() {
		return dateValidation;
	}
	public void setDateValidation(Date dateValidation) {
		this.dateValidation = dateValidation;
	}
	public String getSlogan() {
		return slogan;
	}
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
	public String getSecteurActivite() {
		return secteurActivite;
	}
	public void setSecteurActivite(String secteurActivite) {
		this.secteurActivite = secteurActivite;
	}
	
	public Marque(String nomMarque, Double chiffreaffaire, Date dateValidation , String slogan,String secteurActivite) {
		
		this.nomMarque = nomMarque;
		this.chiffreaffaire = chiffreaffaire;
		this.dateValidation = dateValidation;
		this.slogan = slogan;
		this.secteurActivite = secteurActivite;
		}
	@Override
	public String toString() {
		return "Marque [idMarque=" + idMarque + ", nomMarque=" + nomMarque + ", chiffreaffaire=" + chiffreaffaire
				+ ", dateValidation=" + dateValidation + ", secteurActivite=" + secteurActivite + ", slogan=" + slogan
				+ "]";
	}
	@ManyToOne
	private Pays pays;
	
}
