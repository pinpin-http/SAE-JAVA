package main;

import ardoise.*;
import main.*;
import java.util.ArrayList;

public class maison extends Forme {

    private String Nom;
    //formes maisons
    private quadrilatere rectangle;
    private quadrilatere porte;
    private chapeaux toit;
    //variable point aide forme
    private PointPlan pSuperieurGauche;
    private PointPlan pInferieurDroit;
    private PointPlan pSuperieurDroit;
    //variable aide porte + toit
    private int hauteurToit;
    private int hauteurPorte;
    private int largeurPorte;


    public maison() {
        // Paramètres de bases
        this.Nom = "";
        this.rectangle = new quadrilatere();
        this.porte = new quadrilatere();
        this.toit = new chapeaux();
        this.pSuperieurGauche = new PointPlan(0,0);
        this.pInferieurDroit = new PointPlan(0,0);
        this.pSuperieurDroit = new PointPlan(0,0);
        this.hauteurToit = 0;
        this.hauteurPorte = 0;
        this.largeurPorte = 0;
    }

    public maison(String unNom,PointPlan pSuperieurGauche, PointPlan pInferieurDroit,int uneHauteurToit,int uneHauteurPorte,int uneLargeurPorte){

        //parametres de bases//
        int millieuLongueur = 0;
        PointPlan p2Chapeau = null;


        this.Nom = unNom;
        this.pInferieurDroit=pInferieurDroit;
        this.pSuperieurGauche=pSuperieurGauche;

        if(pInferieurDroit!= null && pSuperieurGauche!=null){
            this.pSuperieurDroit= new PointPlan(pInferieurDroit.getAbscisse(), pSuperieurGauche.getOrdonnee());
        }
        else{
            this.pSuperieurDroit = null;
        }

        this.hauteurToit = uneHauteurToit;
        this.hauteurPorte = uneHauteurPorte;
        this.largeurPorte=uneLargeurPorte;

        //setup toit
        if(pInferieurDroit!= null && pSuperieurGauche!=null) {
            millieuLongueur = pSuperieurGauche.getAbscisse() + ((pSuperieurDroit.getAbscisse() - pSuperieurGauche.getAbscisse()) / 2);
        }
        if(millieuLongueur != 0 && pSuperieurGauche!=null) {
            p2Chapeau = new PointPlan(millieuLongueur, pSuperieurGauche.getOrdonnee() - hauteurToit);
        }

        //porte
        PointPlan pointPorte1 = new PointPlan(millieuLongueur-(largeurPorte/2),pInferieurDroit.getOrdonnee()-hauteurPorte);
        PointPlan pointPorte2 = new PointPlan(millieuLongueur+(largeurPorte/2),pInferieurDroit.getOrdonnee());



        //formes
        this.rectangle = new quadrilatere(unNom,pSuperieurGauche,pInferieurDroit);
        this.toit = new chapeaux(unNom,pSuperieurGauche,p2Chapeau,pSuperieurDroit);
        this.porte = new quadrilatere(unNom,pointPorte1,pointPorte2);
    }

    public maison(maison autreMaison) {
        try {
            this.Nom = autreMaison.getNom();
            this.rectangle = new quadrilatere(autreMaison.getRectangle());
            this.porte = new quadrilatere(autreMaison.getPorte());
            this.toit = new chapeaux(autreMaison.getToit());
            this.pSuperieurGauche = new PointPlan(autreMaison.pSuperieurGauche.getAbscisse(), autreMaison.getpSuperieurGauche().getOrdonnee());
            this.pInferieurDroit = new PointPlan(autreMaison.getpInferieurDroit().getAbscisse(), autreMaison.getpInferieurDroit().getOrdonnee());
            this.pSuperieurDroit = new PointPlan(autreMaison.getpSuperieurDroit().getAbscisse(), autreMaison.getpSuperieurDroit().getOrdonnee());
            this.hauteurToit = autreMaison.getHauteurToit();
            this.hauteurPorte = autreMaison.getHauteurPorte();
            this.largeurPorte = autreMaison.getLargeurPorte();
        } catch (Exception e) {
            // Gérer l'exception ici
            System.out.println("Une erreur s'est produite lors de la création de la maison : " + e.getMessage());
        }
    }




    //getters
    @Override
    public String getNomForme() {
        return super.getNomForme();
    }
    public String getNom(){
        return this.Nom;
    }

    public chapeaux getToit() {
        return this.toit;
    }

    public int getHauteurPorte() {
        return this.hauteurPorte;
    }

    public int getHauteurToit() {
        return this.hauteurToit;
    }

    public int getLargeurPorte() {
        return this.largeurPorte;
    }

    public PointPlan getpInferieurDroit() {
        return this.pInferieurDroit;
    }

    public quadrilatere getPorte() {
        return this.porte;
    }

    public quadrilatere getRectangle() {
        return this.rectangle;
    }

    public PointPlan getpSuperieurGauche() {
        return this.pSuperieurGauche;
    }

    public PointPlan getpSuperieurDroit() {
        return this.pSuperieurDroit;
    }




    //setters
    public void setHauteurToit(int hauteurToit) {

        this.hauteurToit = hauteurToit;
    }

    public void setHauteurPorte(int hauteurPorte) {

        this.hauteurPorte = hauteurPorte;
    }
    public void setLargeurPorte(int largeurPorte) {
        this.largeurPorte = largeurPorte;
    }
    public void setpInferieurDroit(PointPlan pInferieurDroit) {
        this.pInferieurDroit = pInferieurDroit;
    }
    public void setPorte(quadrilatere porte) {
        this.porte = porte;
    }
    public void setpSuperieurDroit(PointPlan pSuperieurDroit) {
        this.pSuperieurDroit = pSuperieurDroit;
    }
    public void setpSuperieurGauche(PointPlan pSuperieurGauche) {
        this.pSuperieurGauche = pSuperieurGauche;
    }
    public void setRectangle(quadrilatere rectangle) {
        this.rectangle = rectangle;
    }

    public void setToit(chapeaux toit) {
        this.toit = toit;
    }

    @Override
    public void setNomForme(String nom) {
        super.setNomForme(nom);
    }

    public ArrayList<Segment> dessiner() {
        ArrayList<Segment> points = new ArrayList<Segment>();

        try {
            for (int i = 0; i < this.rectangle.dessiner().size(); i++) {
                points.add(this.rectangle.dessiner().get(i));
            }
            for (int i = 0; i < this.toit.dessiner().size(); i++) {
                points.add(this.toit.dessiner().get(i));
            }
            for (int i = 0; i < this.porte.dessiner().size(); i++) {
                points.add(this.porte.dessiner().get(i));
            }
        } catch (Exception e) {
            System.out.println("Une erreur s'est produite lors du dessin de la maison : " + e.getMessage());
        }

        return points;
    }

    public void deplacer(int x, int y) {
        try {
            rectangle.deplacer(x, y);
            toit.deplacer(x, y);
            porte.deplacer(x, y);
        } catch (Exception e) {
            System.out.println("Une erreur s'est produite lors du déplacement de la maison : " + e.getMessage());
        }
    }

    public String typeForme() {
        try {
            return "GF";
        } catch (Exception e) {
            System.out.println("Erreur lors de la récupération du type de forme : " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}