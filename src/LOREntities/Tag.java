package LOREntities;
// Generated May 23, 2018 12:38:35 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Tag generated by hbm2java
 */
public class Tag  implements java.io.Serializable {


     private int idTag;
     private String labelTag;
     private Set decrires = new HashSet(0);

    public Tag() {
    }

	
    public Tag(int idTag, String labelTag) {
        this.idTag = idTag;
        this.labelTag = labelTag;
    }
    public Tag(int idTag, String labelTag, Set decrires) {
       this.idTag = idTag;
       this.labelTag = labelTag;
       this.decrires = decrires;
    }
   
    public int getIdTag() {
        return this.idTag;
    }
    
    public void setIdTag(int idTag) {
        this.idTag = idTag;
    }
    public String getLabelTag() {
        return this.labelTag;
    }
    
    public void setLabelTag(String labelTag) {
        this.labelTag = labelTag;
    }
    public Set getDecrires() {
        return this.decrires;
    }
    
    public void setDecrires(Set decrires) {
        this.decrires = decrires;
    }




}


