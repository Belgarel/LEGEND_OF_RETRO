package LOREntities;
// Generated May 6, 2018 10:51:49 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Editeur generated by hbm2java
 */
public class Editeur  implements java.io.Serializable {


     private Integer idEditeur;
     private String nomEditeur;
     private Set jeus = new HashSet(0);

    public Editeur() {
    }

	
    public Editeur(String nomEditeur) {
        this.nomEditeur = nomEditeur;
    }
    public Editeur(String nomEditeur, Set jeus) {
       this.nomEditeur = nomEditeur;
       this.jeus = jeus;
    }
   
    public Integer getIdEditeur() {
        return this.idEditeur;
    }
    
    public void setIdEditeur(Integer idEditeur) {
        this.idEditeur = idEditeur;
    }
    public String getNomEditeur() {
        return this.nomEditeur;
    }
    
    public void setNomEditeur(String nomEditeur) {
        this.nomEditeur = nomEditeur;
    }
    public Set getJeus() {
        return this.jeus;
    }
    
    public void setJeus(Set jeus) {
        this.jeus = jeus;
    }




}


