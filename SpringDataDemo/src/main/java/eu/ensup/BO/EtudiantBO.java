/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ensup.BO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author lorris
 */
@Entity
public class EtudiantBO {
    
    @Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
    public String nom;
    public String prenom;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
            

    public EtudiantBO() {
    }

    public EtudiantBO(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
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
    
    
    
    
    
}
