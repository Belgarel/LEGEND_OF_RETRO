package LOREntities;
// Generated May 6, 2018 10:51:49 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Fabricant generated by hbm2java
 */
public class Fabricant  implements java.io.Serializable {


     private int idFabricant;
     private String nomFabricant;
     private Set consoles = new HashSet(0);

    public Fabricant() {
    }

	
    public Fabricant(int idFabricant, String nomFabricant) {
        this.idFabricant = idFabricant;
        this.nomFabricant = nomFabricant;
    }
    public Fabricant(int idFabricant, String nomFabricant, Set consoles) {
       this.idFabricant = idFabricant;
       this.nomFabricant = nomFabricant;
       this.consoles = consoles;
    }
   
    public int getIdFabricant() {
        return this.idFabricant;
    }
    
    public void setIdFabricant(int idFabricant) {
        this.idFabricant = idFabricant;
    }
    public String getNomFabricant() {
        return this.nomFabricant;
    }
    
    public void setNomFabricant(String nomFabricant) {
        this.nomFabricant = nomFabricant;
    }
    public Set getConsoles() {
        return this.consoles;
    }
    
    public void setConsoles(Set consoles) {
        this.consoles = consoles;
    }




}


