package sample;

import com.jfoenix.controls.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.swing.plaf.synth.SynthScrollBarUI;
import java.lang.System;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;
import static javafx.collections.FXCollections.observableArrayList;
import static javafx.fxml.FXMLLoader.load;

//import static sample.Etudiant.matIncrement;

public class appController {

    //les vars globales
    public static HashMap<String, Specialite> map_spec = new HashMap<String, Specialite>();
    public static ArrayList<String> list_clefs = new ArrayList();
    public static ArrayList<Enseignant> list_profs = new ArrayList();


    @FXML
    private JFXTextField nom;

    @FXML
    private JFXTextField pre;

    @FXML
    private JFXButton save;

    @FXML
    private JFXDatePicker dn;

    @FXML
    private JFXDatePicker dne;

    @FXML
    private JFXTextField pe;

    @FXML
    private JFXTextField ne;
    @FXML
    private JFXTextField mod;

    @FXML
    private JFXTextField gra;

    @FXML
    private Label LOGIN;

    @FXML
    private JFXPasswordField password;
    @FXML
    private JFXTextField user;

    @FXML
    private JFXTextField ns;

    @FXML
    private JFXTextField fil;

    @FXML
    private JFXTextField ae;

    @FXML
    private JFXTextField ab;

    @FXML
    public JFXComboBox<String> cmb = new JFXComboBox<>();

    @FXML
    public JFXComboBox<String> cmb2 = new JFXComboBox<>();

    @FXML
    private JFXTextField nr;

    @FXML
    private JFXTextField prer;

    @FXML
    private JFXDatePicker dnr;
    @FXML
    private JFXTextField matr;

    @FXML
    private TableView<Etudiant> tab1;

    @FXML
    private TableColumn<Etudiant, Integer> tab1mat = new TableColumn<>("Matricule");

    @FXML
    private TableColumn<Etudiant,String> tab1nom = new TableColumn<>("Nom");

    @FXML
    private TableColumn<Etudiant,String> tab1pre = new TableColumn<>("Prenom");

    @FXML
    private TableColumn<Etudiant,String> tab1dn = new TableColumn<>("Date de Naissance");

    @FXML
    private TableView<Etudiant> tab2;

    @FXML
    private TableColumn<Etudiant, Integer> tab2mat = new TableColumn<>("Matricule");

    @FXML
    private TableColumn<Etudiant,String> tab2nom = new TableColumn<>("Nom");

    @FXML
    private TableColumn<Etudiant,String> tab2pre = new TableColumn<>("Prenom");

    @FXML
    private TableColumn<Etudiant,String> tab2dn = new TableColumn<>("Date de Naissance");
    @FXML
    private JFXTextArea textarea;


    @FXML
    private JFXTextArea textarea2;

    @FXML
    private JFXTextField mats;

    @FXML
    private Label labeel;
    @FXML
    private JFXComboBox<String> combobox3;

    @FXML
    private JFXTextField prenomens;

    @FXML
    private JFXTextArea textarea3;

    @FXML
    private JFXTextArea textarea4;

    @FXML
    private JFXTextField nomens;

    @FXML
    private JFXComboBox<String> combobox4;




    public void Login(ActionEvent event) throws Exception {
        if (user.getText().equals("djihane") && password.getText().equals("harouni")) {
            //ajout des spécialités
            map_spec.put("ISIL", new Specialite("ingénierie sysytème d'information et logiciel", "MI", 2019));
            map_spec.put("GTR", new Specialite("genie télécommunication et réseaux", "MI", 2019));
            map_spec.put("ACAD", new Specialite("informatique académique", "MI", 2019));
            map_spec.put("MATH", new Specialite("mathématiques", "MI", 2019));
            map_spec.put("ALG", new Specialite("algèbre et cryptographie", "MI", 2019));
            map_spec.put("PROBA", new Specialite("probabilités et statistique", "MI", 2019));

            map_spec.put("physique", new Specialite("physique", "SM", 2019));
            map_spec.put("chimie", new Specialite("chimie", "MI", 2019));

            map_spec.put("automatique", new Specialite("automatique", "ST", 2019));
            map_spec.put("GM", new Specialite("génie mécanique", "ST", 2019));
            map_spec.put("GP", new Specialite("génie des procédures", "ST", 2019));
            map_spec.put("GC", new Specialite("génie civile", "ST", 2019));
            map_spec.put("électronique", new Specialite("électronique", "ST", 2019));

            //ajout des clefs pour parcours
             list_clefs.add("ISIL");
             list_clefs.add("GTR");
            list_clefs.add("ACAD");
            list_clefs.add("MATH");
            list_clefs.add("ALG");
            list_clefs.add("PROBA");
            list_clefs.add("physique");
            list_clefs.add("chimie");
            list_clefs.add("automatique");
            list_clefs.add("GP");
            list_clefs.add("GC");
            list_clefs.add("électronique");

            ArrayList a = new ArrayList();
            Etudiant e = new Etudiant("harouni", "djihane", 9, 9, 1999);
            Etudiant e1 = new Etudiant("guenfoud", "faycal", 2, 7, 1999);
            Etudiant e2 = new Etudiant("harouni", "mahi", 9, 9, 1999);
            Etudiant e3 = new Etudiant("harouni", "mahisdfg", 9, 9, 1999);
            a.add(e);
            a.add(e2);
            //map_spec.get("ISIL").setEnsembleEtudiants(a);
            map_spec.get("GTR").ajouterEtudiant(e1);
            map_spec.get("GTR").ajouterEtudiant(e3);

            map_spec.get("ISIL").ajouterEtudiant(e);
            map_spec.get("ISIL").ajouterEtudiant(e2);

            LOGIN.setText("Login Success");
            Stage primaryStage = new Stage();
            Parent root = load(getClass().getResource("/sample/Menu.fxml"));
            out.println(map_spec.get("ISIL").getFiliere());
            Scene scene = new Scene(root, 600, 500);
            scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.show();


        } else {
            LOGIN.setText("Login Failed");
        }
    }
//Methodes dajouts

    void ajouterEtudiantMap(Etudiant e, Map<String, Specialite> map, String clef) {
        map.get(clef).ajouterEtudiant(e);
    }

    public void speccombo(ActionEvent event) {
        cmb.setItems(observableArrayList(list_clefs));

    }

    public void speccombo2(ActionEvent event) {
        cmb2.setItems(observableArrayList(list_clefs));

    }

    public void speccombo4(ActionEvent event) {
        combobox4.setItems(observableArrayList(list_clefs));

    }
    public void speccombo3(ActionEvent event) {
        combobox3.setItems(observableArrayList(list_clefs));
    }
    public void ajouterSpecialite(String nom, String fil, int aE, HashMap<String, Specialite> map, String abrev) {
        Specialite specialite = new Specialite(nom, fil, aE);
        map.put(abrev, specialite);
    }

    public void ajouetrEnseignant(Enseignant ens, ArrayList liste_profs) {
        liste_profs.add(ens);
    }

    public ArrayList chercher(HashMap<String,Specialite> map_spec,ArrayList list_clefs,String nom, String prenom, JFXDatePicker dn) {
        Etudiant e;
        Ndate n = convertirDatePicker(dn);
        ArrayList listeEtudiants = new ArrayList();

        for (int i = 0; i < list_clefs.size(); i++) {
            for (int j = 0; j < map_spec.get(list_clefs.get(i)).getEnsembleEtudiants().size(); j++) {
                e = map_spec.get(list_clefs.get(i)).accederEtudiant(j);
                if (e.dateDeNaissance.comparerDates(n))
                    {
                        listeEtudiants.add(e);
                        if(e.nom.equals(nom) || nom.length()==0)
                          {
                          }
                          else
                        {
                            listeEtudiants.remove(e);
                        }
                          if( e.prenom.equals(prenom) || prenom.length()==0)
                              {
                              }
                          else
                              {
                                  listeEtudiants.remove(e);
                              }

                    }
                }
            }
            return listeEtudiants;
        }
    public ArrayList chercherEtudiantSpecialite(Specialite spec,Ndate dateDeNaissanceDonnee,String nom,String prenom)
    {
            Etudiant e;
            ArrayList listeEtudiants = null;
        ArrayList list_Etudiants = spec.getEnsembleEtudiants();
        System.out.println(((Etudiant)list_Etudiants.get(0)).decrisEtudiant());
            for(int j=0;j<list_Etudiants.size();j++)
            {

                e = spec.accederEtudiant(j);
                listeEtudiants.add(e);
                if(e.dateDeNaissance.comparerDates(dateDeNaissanceDonnee)==true)
            {

             System.out.println(e.decrisEtudiant());
             listeEtudiants.add(e);
                System.out.println(listeEtudiants.get(0));

              /* */
            }
        }
        return listeEtudiants;
    }
    public ArrayList chercherEtudiantSpecialiteMat(Specialite spec,int mat) {
        Etudiant e;
        int list_etu;
        ArrayList listeEtudiants = new ArrayList();
            for (int i = 0; i < spec.getEnsembleEtudiants().size(); i++) {
                list_etu = spec.getEnsembleEtudiants().size();
                if (list_etu != 0) {
                    e = spec.accederEtudiant(i);
                    if (e.matricule == mat) {
                        listeEtudiants.add(e);
                        return listeEtudiants;
                    }
                }
            }
            return listeEtudiants;
        }

    //recherche les etudiants selons les deonn�es introduites (date de naissance obligatoire)

    public ArrayList chercherEtudiantToutSpecialite(HashMap<String,Specialite> map_spec,ArrayList list_spec,String nom,String prenom,Ndate dn)
    {
        int i;
        String clef;
        Specialite spec;
        Etudiant e;
        ArrayList listeEtudiants = new ArrayList();
        for(i=0;i <list_spec.size();i++)
        {
            clef = (String)list_spec.get(i);
            spec = map_spec.get(clef);
            ArrayList list_Etudiants = spec.getEnsembleEtudiants();
            System.out.println(((Etudiant)list_Etudiants.get(0)).decrisEtudiant());
             listeEtudiants= chercherEtudiantSpecialite(spec, dn, nom, prenom);
            }
        return listeEtudiants;
    }
    //rechercher les etudiant d'un enseignant donn�
    public ArrayList chercherEtudiantEnseignantMat(Enseignant ens,int mat)
    {
        Etudiant e;
        return chercherEtudiantSpecialiteMat(ens.getSpecialite(), mat);
    }

    public ArrayList chercherEtudiantEnseignant(Enseignant ens,Ndate dateDeNaissanceDonnee,String nom,String prenom)
    {
        ArrayList listeEtudiants = new ArrayList();
        listeEtudiants = chercherEtudiantSpecialite(ens.getSpecialite(),dateDeNaissanceDonnee,nom,prenom);
        return listeEtudiants;
    }

    //rechercher un etudiant donn�
    public ArrayList chercherEtudiantMat(HashMap<String,Specialite> map_spec,ArrayList list_spec,int mat)
    {
        int i;
        String clef;
        Specialite specialite;
        ArrayList listeEtudiants = new ArrayList();
        for(i=0;i<list_spec.size();i++)
        {
            clef = (String)list_spec.get(i);
            specialite = map_spec.get(clef);
            listeEtudiants = chercherEtudiantSpecialiteMat(specialite, mat);
            if(listeEtudiants.size() != 0)
            {
                return listeEtudiants;
            }
        }
        return listeEtudiants;
    }




    public int supprimerEtudiantSpecialiteMat(String clef,int mat)
    {
        ArrayList liste =chercherEtudiantSpecialiteMat(map_spec.get(clef), mat);
        if(liste.size()!=0)
        {
            map_spec.get(clef).getEnsembleEtudiants().remove(liste.get(0));
            return 1;
        }
        else
        {
            return 0;
        }
    }
      public int supprimerEtudiantMat(int mat)
    {
        int i;
        String clef;
        int trouve=0;
        for(i=0;i<list_clefs.size();i++)
        {
            clef= (String)list_clefs.get(i);
            if(trouve == 0)
            {
                trouve = supprimerEtudiantSpecialiteMat(clef,mat);
            }
            else
            {
                supprimerEtudiantSpecialiteMat(clef,mat);
            }
        }
        return trouve;
    }


    public int supprimerEtudiantSpecialite(Ndate date,String nom, String prenom,String clef)
    {
        int i;
        ArrayList liste = chercherEtudiantSpecialite(map_spec.get(clef), date, nom, prenom);
        if(liste.size() != 0)
        {
            for(i=0;i<liste.size();i++)
            {
                map_spec.get(clef).getEnsembleEtudiants().remove(liste.get(i));
            }
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public int supprimerEtudiant(Ndate date,String nom,String prenom)
    {
        int i,j;
        String clef;
        int trouve = 0;
        for(i=0;i<list_clefs.size();i++)
        {
            clef = (String)list_clefs.get(i);
            if(trouve == 0)
            {
                trouve = supprimerEtudiantSpecialite(date, nom, prenom, clef);
            }
            else
            {
                supprimerEtudiantSpecialite(date, nom, prenom, clef);
            }
        }
        return trouve;
    }

    public int supprimerEnseingant(Enseignant ens)
    {
        if(list_profs.contains(ens))
        {
            list_profs.remove(ens);
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public Ndate convertirDatePicker(JFXDatePicker dn){

        String dd =dn.getValue().toString();
       String[] tab = dd.split("-");
        int annee= Integer.valueOf(tab[0]);
        int mois= Integer.valueOf(tab[1]);
        int jour= Integer.valueOf(tab[2]);


       Ndate nda = new Ndate(jour,mois,annee);

        return nda;

        }

    @FXML
    public void enregistrerEtudiant(ActionEvent event) {

        String n=nom.getText();
        String p=pre.getText();
        Ndate d=convertirDatePicker(dn);
        Etudiant e=new Etudiant(n,p,d.jour,d.mois,d.annee);
        ajouterEtudiantMap(e,map_spec,cmb.getValue());
       // System.out.println(map_spec.get("ISIL").accederEtudiant(0).getMatricule());

    }
    @FXML
    public void enregistrerEnseignant(ActionEvent event)
    {
        Ndate d=convertirDatePicker(dne);
        Enseignant e= new Enseignant(ne.getText(),pe.getText(),d.jour,d.mois,d.annee,mod.getText(),gra.getText(),map_spec.get(String.valueOf(cmb2.getPromptText())));
        ajouetrEnseignant(e,list_profs);

    }
    @FXML
    public void enregistrerSpecialite(ActionEvent event)
    {
        ajouterSpecialite(ns.getText(),fil.getText(),Integer.parseInt(ae.getText()),map_spec,ab.getText());

    }

    @FXML
    public void rechercheEtudiantMat(ActionEvent event)
    {
     int mat=Integer.parseInt(matr.getText());
      ArrayList listE = chercherEtudiantMat(map_spec, list_clefs,mat);

      for(int i=0;i<listE.size();i++)
      {
          textarea.appendText(((Etudiant)listE.get(i)).decrisEtudiant());

      }
    }
  public void rechercherEtudiantNPD(ActionEvent event) {
        textarea2.clear();
      String n=nr.getText();
      String p=prer.getText();

      System.out.println(n);
      System.out.println(p);
      ArrayList listE = chercher(map_spec, list_clefs, n, p, dnr);
        for (int j = 0; j < listE.size(); j++) {

          textarea2.appendText(((Etudiant) listE.get(j)).decrisEtudiant());
      }
  }
    @FXML
    void rechercherEtudiantDunEns(ActionEvent event) {
        for (int i = 0; i < map_spec.get(combobox3.getValue()).getEnsembleEtudiants().size(); i++) {

            textarea3.appendText(map_spec.get(combobox3.getValue()).accederEtudiant(i).decrisEtudiant());
        }


    }
    @FXML
    void rechercherEtudiantDunSpecialite(ActionEvent event) {
            for (int i = 0; i < map_spec.get(combobox4.getValue()).getEnsembleEtudiants().size(); i++) {

                    textarea4.appendText(map_spec.get(combobox4.getValue()).accederEtudiant(i).decrisEtudiant());
                }
        }
    public void ajouterEtudiantInterface(ActionEvent event) throws Exception
    {

        Stage primaryStage = new Stage();
        Parent root = load(getClass().getResource("/sample/ajouter etudiant.fxml"));
        Scene scene = new Scene(root,700,500);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();


    }
    public void RechercherEtudiantDuneSpecialiteInterface(ActionEvent event) throws Exception
    {

        Stage primaryStage = new Stage();
        Parent root = load(getClass().getResource("/sample/ChercherEtudiantSpecialite.fxml"));
        Scene scene = new Scene(root,700,500);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();


    }
    public void chercherEtudianDunEnsInterface(ActionEvent event) throws Exception
    {

        Stage primaryStage = new Stage();
        Parent root = load(getClass().getResource("/sample/chercherEtudiantsDunens.fxml"));
        Scene scene = new Scene(root,700,600);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();


    }
    public void ajouterEnseignantInterface(ActionEvent event) throws Exception
    {


        Stage primaryStage = new Stage();
        Parent root = load(getClass().getResource("/sample/ajouter enseignant.fxml"));
        Scene scene = new Scene(root,600,500);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public void ajouterSpecialiteInterface(ActionEvent event) throws Exception
    {


        Stage primaryStage = new Stage();
        Parent root = load(getClass().getResource("/sample/ajouter specialite.fxml"));
        Scene scene = new Scene(root,600,500);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public void rechercherEtudiantInterface(ActionEvent event) throws Exception
    {
        Stage primaryStage = new Stage();
        Parent root = load(getClass().getResource("/sample/rechercher etudiant.fxml"));
        Scene scene = new Scene(root,600,500);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public void supprimerEtudiantInterface(ActionEvent event) throws Exception
    {
        Stage primaryStage = new Stage();
        Parent root = load(getClass().getResource("/sample/Supprimer etudiant.fxml"));
        Scene scene = new Scene(root,600,500);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 public void supprimerEtudiant(ActionEvent event)
 {

  if (supprimerEtudiantMat(Integer.parseInt(mats.getText()))==1)
  {
       labeel.setText("Supprission Satisfaite");
  }
  else
  {
      labeel.setText("Supprission Non Satisfaite");
  }

 }

 public void reinitialiserTout(ActionEvent event)
 {

     for(int k=0;k<list_profs.size();k++)
     {
         supprimerEnseingant(list_profs.get(k));
     }

     for(int i=0;i <list_clefs.size();i++) {
         int  list_etu = map_spec.get(list_clefs.get(i)).getEnsembleEtudiants().size();
         if (list_etu != 0) {
             for (int j = 0; j < map_spec.get(list_clefs.get(i)).getEnsembleEtudiants().size(); j++) {
                 supprimerEtudiantMat(map_spec.get(list_clefs.get(i)).accederEtudiant(j).matricule);

             }
         }
     }
     }
 }

