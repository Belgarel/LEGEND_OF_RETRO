package LOREntities;
// Generated May 23, 2018 12:38:35 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Jeu generated by hbm2java
 */
public class Jeu  implements java.io.Serializable {


     private Integer idJeu;
     private Editeur editeur;
     private String nomJeu;
     private String descriptionJeu;
     private Set decrires = new HashSet(0);
     private Set versionJeus = new HashSet(0);

    public Jeu() {
    }

	
    public Jeu(Editeur editeur, String nomJeu, String descriptionJeu) {
        this.editeur = editeur;
        this.nomJeu = nomJeu;
        this.descriptionJeu = descriptionJeu;
    }
    public Jeu(Editeur editeur, String nomJeu, String descriptionJeu, Set decrires, Set versionJeus) {
       this.editeur = editeur;
       this.nomJeu = nomJeu;
       this.descriptionJeu = descriptionJeu;
       this.decrires = decrires;
       this.versionJeus = versionJeus;
    }
   
    public Integer getIdJeu() {
        return this.idJeu;
    }
    
    public void setIdJeu(Integer idJeu) {
        this.idJeu = idJeu;
    }
    public Editeur getEditeur() {
        return this.editeur;
    }
    
    public void setEditeur(Editeur editeur) {
        this.editeur = editeur;
    }
    public String getNomJeu() {
        return this.nomJeu;
    }
    
    public void setNomJeu(String nomJeu) {
        this.nomJeu = nomJeu;
    }
    public String getDescriptionJeu() {
        return this.descriptionJeu;
    }
    
    public void setDescriptionJeu(String descriptionJeu) {
        this.descriptionJeu = descriptionJeu;
    }
    public Set getDecrires() {
        return this.decrires;
    }
    
    public void setDecrires(Set decrires) {
        this.decrires = decrires;
    }
    public Set getVersionJeus() {
        return this.versionJeus;
    }
    
    public void setVersionJeus(Set versionJeus) {
        this.versionJeus = versionJeus;
    }




}


