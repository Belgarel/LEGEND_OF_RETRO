package LOREntities;
// Generated Jun 9, 2018 12:02:55 AM by Hibernate Tools 4.3.1



/**
 * PromoConsole generated by hbm2java
 */
public class PromoConsole  implements java.io.Serializable {


     private Integer idPromoConsole;
     private VersionConsole versionConsole;
     private float coteConsole;
     private float prixPromoConsole;

    public PromoConsole() {
    }

    public PromoConsole(VersionConsole versionConsole, int coteConsole, int prixPromoConsole) {
       this.versionConsole = versionConsole;
       this.coteConsole = coteConsole;
       this.prixPromoConsole = prixPromoConsole;
    }
   
    public Integer getIdPromoConsole() {
        return this.idPromoConsole;
    }
    
    public void setIdPromoConsole(Integer idPromoConsole) {
        this.idPromoConsole = idPromoConsole;
    }
    public VersionConsole getVersionConsole() {
        return this.versionConsole;
    }
    
    public void setVersionConsole(VersionConsole versionConsole) {
        this.versionConsole = versionConsole;
    }
    public float getCoteConsole() {
        return this.coteConsole;
    }
    
    public void setCoteConsole(float coteConsole) {
        this.coteConsole = coteConsole;
    }
    public float getPrixPromoConsole() {
        return this.prixPromoConsole;
    }
    
    public void setPrixPromoConsole(float prixPromoConsole) {
        this.prixPromoConsole = prixPromoConsole;
    }




}


