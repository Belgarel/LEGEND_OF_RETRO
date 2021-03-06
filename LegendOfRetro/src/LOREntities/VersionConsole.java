package LOREntities;
// Generated Jun 15, 2018 7:40:31 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * VersionConsole generated by hbm2java
 */
public class VersionConsole  implements java.io.Serializable {


     private Integer idVersionConsole;
     private Console console;
     private Zone zone;
     private String codeBarre;
     private String edition;
     private float prix;
     private int stock;
     private Set promoConsoles = new HashSet(0);
     private Set ligneFactureConsoles = new HashSet(0);

    public VersionConsole() {
    }

	
    public VersionConsole(Console console, Zone zone, String codeBarre, String edition, float prix, int stock) {
        this.console = console;
        this.zone = zone;
        this.codeBarre = codeBarre;
        this.edition = edition;
        this.prix = prix;
        this.stock = stock;
    }
    public VersionConsole(Console console, Zone zone, String codeBarre, String edition, float prix, int stock, Set promoConsoles, Set ligneFactureConsoles) {
       this.console = console;
       this.zone = zone;
       this.codeBarre = codeBarre;
       this.edition = edition;
       this.prix = prix;
       this.stock = stock;
       this.promoConsoles = promoConsoles;
       this.ligneFactureConsoles = ligneFactureConsoles;
    }
   
    public Integer getIdVersionConsole() {
        return this.idVersionConsole;
    }
    
    public void setIdVersionConsole(Integer idVersionConsole) {
        this.idVersionConsole = idVersionConsole;
    }
    public Console getConsole() {
        return this.console;
    }
    
    public void setConsole(Console console) {
        this.console = console;
    }
    public Zone getZone() {
        return this.zone;
    }
    
    public void setZone(Zone zone) {
        this.zone = zone;
    }
    public String getCodeBarre() {
        return this.codeBarre;
    }
    
    public void setCodeBarre(String codeBarre) {
        this.codeBarre = codeBarre;
    }
    public String getEdition() {
        return this.edition;
    }
    
    public void setEdition(String edition) {
        this.edition = edition;
    }
    public float getPrix() {
        return this.prix;
    }
    
    public void setPrix(float prix) {
        this.prix = prix;
    }
    public int getStock() {
        return this.stock;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
    public Set getPromoConsoles() {
        return this.promoConsoles;
    }
    
    public void setPromoConsoles(Set promoConsoles) {
        this.promoConsoles = promoConsoles;
    }
    public Set getLigneFactureConsoles() {
        return this.ligneFactureConsoles;
    }
    
    public void setLigneFactureConsoles(Set ligneFactureConsoles) {
        this.ligneFactureConsoles = ligneFactureConsoles;
    }




}


