/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import bean.Form;
import bean.PromoForm;
import controleur.Controleur;
import controleur.DonneeInvalideException;
import controleur.DonneesInsuffisantesException;
import controleur.EnregistrementInexistantException;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bornbygoogle
 */
public class critPromo extends javax.swing.JPanel
{
    private Form selectedForm;
    private Controleur controleur;
    private Chercheur parent;
    
    private int idPromo;
    private int idVersionJeu;
    private int idVersionConsole;

    /**
     * Creates new form Resultat
     */
    public critPromo(Controleur controleur, Chercheur parent)
    {
        this.controleur = controleur;
        this.parent = parent;
        this.selectedForm = null;
        initComponents();
        // Initialisation la modele pour listeEdition
        Vector<String> editions;        
        editions = controleur.listeEdition("Console");
        editions.add(0, "");
        listeEdition.setModel(new javax.swing.DefaultComboBoxModel<>(editions));

       // Initialisation la modele pour listeZone        
        Vector<String> zones = controleur.listeZones();
        zones.add(0, "");
        listeZone.setModel(new javax.swing.DefaultComboBoxModel<>(zones));

       // Initialisation la modele pour listeConsoles
        Vector<String> plateformes = controleur.listeConsoles();
        plateformes.add(0, "");
        listePlateforme.setModel(new javax.swing.DefaultComboBoxModel<>(plateformes));
        
       // Initialisation la modele pour listeFabricant
        Vector<String> fabricants = controleur.listeFabricant();
        fabricants.add(0, "");
        listeFabricant.setModel(new javax.swing.DefaultComboBoxModel<>(fabricants));
        
       // Initialisation la modele pour listeTags
        Vector<String> tags = controleur.listeTags();
        tags.add(0, "");
        listeTags.setModel(new javax.swing.DefaultComboBoxModel<>(tags)); 
        
        this.idPromo = 0;
        this.idVersionJeu = 0;
        this.idVersionConsole = 0;

    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelZone = new javax.swing.JLabel();
        fieldDevFab = new javax.swing.JLabel();
        labelPlateforme = new javax.swing.JLabel();
        labelPlateforme.setVisible(false);
        labelEdition = new javax.swing.JLabel();
        labelCategorie = new javax.swing.JLabel();
        listeCategorie = new javax.swing.JComboBox<>();
        labelTag = new javax.swing.JLabel();
        labelTag.setVisible(false);
        listePlateforme = new javax.swing.JComboBox<>();
        listePlateforme.setVisible(false);
        labelPrix = new javax.swing.JLabel();
        labelStock = new javax.swing.JLabel();
        labelCurrency = new javax.swing.JLabel();
        labelCote = new javax.swing.JLabel();
        fieldCote = new javax.swing.JLabel();
        listeZone = new javax.swing.JComboBox<>();
        buttonModifier = new javax.swing.JButton();
        fieldPrix = new javax.swing.JFormattedTextField();
        listeFabricant = new javax.swing.JComboBox<>();
        listeEdition = new javax.swing.JComboBox<>();
        listeTags = new javax.swing.JComboBox<>();
        listeTags.setVisible(false);
        fieldStock = new javax.swing.JLabel();
        buttonChercher = new javax.swing.JButton();
        labelCodeBarre = new javax.swing.JLabel();
        labelNom = new javax.swing.JLabel();
        fieldCodeBarre = new javax.swing.JLabel();
        fieldNom = new javax.swing.JLabel();
        titre = new javax.swing.JLabel();
        labelPrixBase = new javax.swing.JLabel();
        fieldPrixBase = new javax.swing.JLabel();
        labelCurrency1 = new javax.swing.JLabel();

        setName("critResultat"); // NOI18N

        labelZone.setText("Zone : ");

        fieldDevFab.setText("Fabricant : ");

        labelPlateforme.setText("Plateforme : ");

        labelEdition.setText("Edition : ");

        labelCategorie.setForeground(new java.awt.Color(248, 7, 7));
        labelCategorie.setText("Categorie * :");

        listeCategorie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Console", "Jeu" }));
        listeCategorie.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listeCategorieItemStateChanged(evt);
            }
        });

        labelTag.setText("Tags : ");

        listePlateforme.setModel(listePlateforme.getModel());

        labelPrix.setText("Prix :");

        labelStock.setText("Stock :");

        labelCurrency.setText("€");

        labelCote.setForeground(new java.awt.Color(255, 0, 0));
        labelCote.setText("Cote :");

        fieldCote.setForeground(new java.awt.Color(255, 0, 0));
        fieldCote.setText("0");

        listeZone.setModel(listeZone.getModel());

        buttonModifier.setText("Modifier");
        buttonModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModifierActionPerformed(evt);
            }
        });

        listeFabricant.setModel(listeFabricant.getModel());

        listeEdition.setModel(listeEdition.getModel());

        listeTags.setModel(listeTags.getModel());

        fieldStock.setText("0");

        buttonChercher.setText("Chercher");
        buttonChercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonChercherActionPerformed(evt);
            }
        });

        labelCodeBarre.setText("Code Barre : ");

        labelNom.setText("Nom : ");
        labelNom.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        fieldCodeBarre.setText(" ");

        fieldNom.setText(" ");

        titre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titre.setText("PROMOTION");

        labelPrixBase.setText("Prix de base :");

        fieldPrixBase.setText("0.00");

        labelCurrency1.setText("€");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(labelCategorie)
                                            .addComponent(labelTag, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addComponent(labelPlateforme, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(fieldDevFab, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(labelEdition, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(labelZone, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(listeCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(listeEdition, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(listeZone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(listeFabricant, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(listePlateforme, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(listeTags, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(buttonChercher, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(117, 117, 117)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(labelCodeBarre)
                                            .addComponent(labelNom)
                                            .addComponent(labelCote, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelPrix, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addComponent(labelPrixBase, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldCodeBarre, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(fieldPrixBase, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                                .addComponent(fieldPrix))
                                            .addComponent(fieldCote, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelCurrency1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelStock)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(fieldStock, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(buttonModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(titre, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titre, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(listeCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(listeZone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelZone))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(listeEdition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelEdition)
                                    .addComponent(labelStock)
                                    .addComponent(fieldStock)
                                    .addComponent(fieldCote)
                                    .addComponent(labelCote))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(listeFabricant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldDevFab)
                                    .addComponent(labelPrixBase)
                                    .addComponent(fieldPrixBase)
                                    .addComponent(labelCurrency1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(listePlateforme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelPlateforme)
                                    .addComponent(labelPrix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fieldPrix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelCurrency))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(listeTags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelTag)))
                            .addComponent(labelCategorie, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonChercher)
                            .addComponent(buttonModifier))
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCodeBarre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldCodeBarre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNom, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getAccessibleContext().setAccessibleName("critResultat");
    }// </editor-fold>//GEN-END:initComponents

    private void listeCategorieItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listeCategorieItemStateChanged
        // TODO add your handling code here
        if ("Jeu".equals((String)listeCategorie.getSelectedItem())) 
        { 
            fieldDevFab.setText("Développeur :"); 
            labelPlateforme.setVisible(true);
            listePlateforme.setVisible(true);
            labelTag.setVisible(true);
            listeTags.setVisible(true);
            
            // Initialisation la modele pour listeEdition
            Vector<String> editions;        
            listeEdition.removeAllItems();
            editions = controleur.listeEdition("Jeu");
            editions.add(0, "");
            listeEdition.setModel(new javax.swing.DefaultComboBoxModel<>(editions));   
            
            // Initialisation la modele pour listeConsoles
            Vector<String> plateformes;
            listePlateforme.removeAllItems();
            plateformes = controleur.listeConsoles();
            plateformes.add(0, "");
            listePlateforme.setModel(new javax.swing.DefaultComboBoxModel<>(plateformes));
        
            // Initialisation la modele pour listeFabricant
            Vector<String> fabricants;
            listeFabricant.removeAllItems();
            fabricants = controleur.listeFabricant();
            fabricants.add(0, "");
            listeFabricant.setModel(new javax.swing.DefaultComboBoxModel<>(fabricants));
        
            // Initialisation la modele pour listeTags
            Vector<String> tags;
            listeTags.removeAllItems();
            tags = controleur.listeTags();
            tags.add(0, "");
            listeTags.setModel(new javax.swing.DefaultComboBoxModel<>(tags));             
        }
        else 
        { 
            fieldDevFab.setText("Fabricant : ");
            labelPlateforme.setVisible(false);
            listePlateforme.setVisible(false);
            labelTag.setVisible(false);
            listeTags.setVisible(false);
            // Initialisation la modele pour listeEdition
            Vector<String> editions;        
            listeEdition.removeAllItems();
            editions = controleur.listeEdition("Console");
            editions.add(0, "");
            listeEdition.setModel(new javax.swing.DefaultComboBoxModel<>(editions));  
        
            // Initialisation la modele pour listeFabricant
            Vector<String> fabricants = controleur.listeFabricant();
            fabricants.add(0, "");
            listeFabricant.setModel(new javax.swing.DefaultComboBoxModel<>(fabricants));
        
        }
        clean();
    }//GEN-LAST:event_listeCategorieItemStateChanged

    private void clean()
    {
        this.listeEdition.setSelectedIndex(0);
        this.fieldPrix.setValue(String.format("%.2f", 0.0f));
        this.fieldPrixBase.setText(String.format("%.2f", 0.0f));
        this.fieldStock.setText("0");
        this.fieldCote.setText(String.format("%.2f", 0.0f));
        this.listeTags.setSelectedIndex(0);
        this.listePlateforme.setSelectedIndex(0);
        this.listeZone.setSelectedIndex(0);
        this.selectedForm = null;
        this.idPromo = 0;
        this.idVersionConsole = 0;
        this.idVersionJeu = 0;
        //parent.lancerRecherche(null);
    }    
    private void buttonModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModifierActionPerformed
        try {
            Form f = toForm();
            if (!(f instanceof PromoForm))
                throw new DonneesInsuffisantesException(
                        "Erreur : on ne peut pas effacer toutes ces données sur le produit");
            this.parent.afficherLog(
                    this.controleur.modifierPromo((PromoForm) f).toString());
            
            this.selectedForm = (PromoForm) f;
            setForm((PromoForm) this.selectedForm); //update affichage dans critProduit (normalement inutile)
            clean();
        }
        catch (DonneesInsuffisantesException ex) {this.parent.afficherErreur(ex);}
        catch (DonneeInvalideException ex) {this.parent.afficherErreur(ex);} 
        catch (EnregistrementInexistantException ex) {
            Logger.getLogger(critPromo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(critPromo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonModifierActionPerformed

    private void buttonChercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonChercherActionPerformed
        // TODO add your handling code here:
     try {
            this.parent.lancerRecherche(toForm());}
        catch (DonneeInvalideException ex) {
            this.parent.afficherErreur(ex);
        }
    }//GEN-LAST:event_buttonChercherActionPerformed

    public void setForm(PromoForm f) throws IOException
    {
        this.selectedForm = f;
        String errors = "";
        
        if ("Jeu".equals(f.getType()))
        {
            this.listeCategorie.setSelectedIndex(1); //type Jeu
            this.listeTags.setSelectedItem(f.getTags());
            //this.jTextAreaDescription.setText(f.getDescription());
            //plateforme
            int i=0;
            boolean found = false;
            String dansListe = null;
            String plateforme = f.getPlateforme();
            while (!found && i < listePlateforme.getModel().getSize())
            {
                dansListe = listePlateforme.getModel().getElementAt(i);
                found = plateforme.equals(dansListe);
                i++;
            }
            if (found)
                listePlateforme.getModel().setSelectedItem(dansListe);
            else
                errors = errors.concat("Erreur lors de la sélection de la plateforme " + plateforme
                        + " : plateforme non trouvée dans la liste déroulante. \n");
            
            //Affichage photo dans le cadre          
            //if (f.getPhoto()!="") { controleur.setPhotoProduct(f.getPhoto()); }
        }
        else if ("Console".equals(f.getType()))
            this.listeCategorie.setSelectedIndex(0); //type Console
        
        this.fieldCodeBarre.setText(f.getCodeBarre());
        this.fieldNom.setText(f.getNom());
        this.listeFabricant.setSelectedItem(f.getEditeur());
        this.listeEdition.setSelectedItem(f.getEdition());
        this.fieldPrix.setText(String.valueOf(String.format("%.2f", f.getPrix())));
        this.fieldPrixBase.setText(String.valueOf(String.format("%.2f", f.getPrixBase())));
        this.fieldStock.setText(String.valueOf(f.getStock()));
        this.fieldCote.setText(String.valueOf(String.format("%.2f", f.getCote())));
    
        //zone
        int i = 0;
        boolean found = false;
        String dansListe = null;
        String zone = f.getZone();
        while (!found && i < listeZone.getModel().getSize())
        {
            dansListe = listeZone.getModel().getElementAt(i);
            found = zone.equals(dansListe);
            i++;
        }
        if (found)
            listeZone.getModel().setSelectedItem(dansListe);
        else
            errors = errors.concat("Erreur lors de la sélection de la zone " + zone
                    + " : zone non trouvée dans la liste déroulante. \n");
                
        
        this.idPromo = f.getIdPromo();
        this.idVersionJeu = f.getIdVersionJeu();
        this.idVersionConsole = f.getIdVersionConsole();

        if (!"".equals(errors))
            this.parent.afficherErreur(new Exception(errors));

    }
    private Form toForm() throws DonneeInvalideException
    {
        float prixbase,prix,cote;
        int stock;

        try {
            prix = Float.valueOf(fieldPrix.getText());
            prixbase = Float.valueOf(fieldPrixBase.getText());
            stock = Integer.valueOf(fieldStock.getText());
            cote = Float.valueOf(fieldCote.getText());
        }
        catch (NumberFormatException nfe) {
            prixbase = 0f;
            prix = 0f;
            stock = 0;
            cote = 0f;
        }

        return new PromoForm(this.idPromo,this.idVersionConsole, this.idVersionJeu,
                    (String) listeCategorie.getSelectedItem(), ""/*CodeBarre*/,
                    ""/*Nom*/, (String) listeEdition.getSelectedItem(),
                    (String) listeZone.getSelectedItem(),
                    (String) listeFabricant.getSelectedItem(),""/*Photo*/, ""/*Description*/,
                    (String) listeTags.getSelectedItem(), (String) listePlateforme.getSelectedItem(),
                    prixbase, prix, stock, cote);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton buttonChercher;
    public static javax.swing.JButton buttonModifier;
    public static javax.swing.JLabel fieldCodeBarre;
    public static javax.swing.JLabel fieldCote;
    public static javax.swing.JLabel fieldDevFab;
    public static javax.swing.JLabel fieldNom;
    public static javax.swing.JFormattedTextField fieldPrix;
    public static javax.swing.JLabel fieldPrixBase;
    public static javax.swing.JLabel fieldStock;
    public static javax.swing.JLabel labelCategorie;
    public static javax.swing.JLabel labelCodeBarre;
    public static javax.swing.JLabel labelCote;
    public static javax.swing.JLabel labelCurrency;
    public static javax.swing.JLabel labelCurrency1;
    public static javax.swing.JLabel labelEdition;
    public static javax.swing.JLabel labelNom;
    public static javax.swing.JLabel labelPlateforme;
    public static javax.swing.JLabel labelPrix;
    public static javax.swing.JLabel labelPrixBase;
    public static javax.swing.JLabel labelStock;
    public static javax.swing.JLabel labelTag;
    public static javax.swing.JLabel labelZone;
    public static javax.swing.JComboBox<String> listeCategorie;
    public static javax.swing.JComboBox<String> listeEdition;
    public static javax.swing.JComboBox<String> listeFabricant;
    public static javax.swing.JComboBox<String> listePlateforme;
    public static javax.swing.JComboBox<String> listeTags;
    public static javax.swing.JComboBox<String> listeZone;
    public static javax.swing.JLabel titre;
    // End of variables declaration//GEN-END:variables

}
