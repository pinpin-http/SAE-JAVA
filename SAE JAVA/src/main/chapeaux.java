package main;

import ardoise.Forme;
import ardoise.PointPlan;
import ardoise.Segment;

import java.util.ArrayList;

public class chapeaux extends Forme {

    private PointPlan ChapeauPoint1;
    private PointPlan ChapeauPoint2;
    private PointPlan ChapeauPoint3;
    private String Nom;

    public chapeaux(){
        super( "");
        this.ChapeauPoint1 = null;
        this.ChapeauPoint2 = null;
        this.ChapeauPoint3 = null;
    }
    public chapeaux(String unNom,PointPlan p1,PointPlan p2,PointPlan p3){
        this.Nom = unNom;
        this.ChapeauPoint1 = p1;
        this.ChapeauPoint2 = p2;
        this.ChapeauPoint3 = p3;

    }

    public chapeaux(chapeaux autreChapeau){
        this.Nom = autreChapeau.getNom();
        this.ChapeauPoint1 = new PointPlan(autreChapeau.getChapeauPoint1().getAbscisse() , autreChapeau.getChapeauPoint1().getOrdonnee());
        this.ChapeauPoint2 = new PointPlan(autreChapeau.getChapeauPoint2().getAbscisse() , autreChapeau.getChapeauPoint2().getOrdonnee());
        this.ChapeauPoint3 = new PointPlan(autreChapeau.getChapeauPoint3().getAbscisse() , autreChapeau.getChapeauPoint3().getOrdonnee());
    }

    //getters
    public PointPlan getChapeauPoint1(){

        return this.ChapeauPoint1;
    }
    public PointPlan getChapeauPoint2() {

        return this.ChapeauPoint2;
    }
    public PointPlan getChapeauPoint3() {

        return this.ChapeauPoint3;
    }
    public String getNom(){

        return this.Nom;
    }
    @Override
    public String getNomForme() {
        return super.getNomForme();
    }
    //seters


    @Override
    public void setNomForme(String nom) {
        super.setNomForme(nom);
    }
    

    public void setChapeauPoint1(PointPlan chapeauPoint1) {
        this.ChapeauPoint1 = chapeauPoint1;
    }

    public void setChapeauPoint2(PointPlan chapeauPoint2) {
        this.ChapeauPoint2 = chapeauPoint2;
    }

    public void setChapeauPoint3(PointPlan chapeauPoint3) {
        this.ChapeauPoint3 = chapeauPoint3;
    }

    public void setNom(String nom) {

        this.Nom = nom;
    }

    //methodes
    @Override
    public ArrayList<Segment> dessiner() {

        Segment s1 = new Segment(this.ChapeauPoint1, this.ChapeauPoint2);
        Segment s2 = new Segment(this.ChapeauPoint2, this.ChapeauPoint3);
        ArrayList<Segment> points = new ArrayList<Segment>();

        points.add(s1);
        points.add(s2);

        return points;
    }

    @Override
    public void deplacer(int deplacementX, int deplacementY) {
        int nouvelleAbscisseP1 = ChapeauPoint1.getAbscisse() + deplacementX;
        int nouvelleOrdonneeP1 = ChapeauPoint1.getOrdonnee() + deplacementY;
        ChapeauPoint1.setAbscisse(nouvelleAbscisseP1);
        ChapeauPoint1.setOrdonnee(nouvelleOrdonneeP1);

        int nouvelleAbscisseP2 = ChapeauPoint2.getAbscisse() + deplacementX;
        int nouvelleOrdonneeP2 = ChapeauPoint2.getOrdonnee() + deplacementY;
        ChapeauPoint2.setAbscisse(nouvelleAbscisseP2);
        ChapeauPoint2.setOrdonnee(nouvelleOrdonneeP2);

        int nouvelleAbscisseP3 = ChapeauPoint3.getAbscisse() + deplacementX;
        int nouvelleOrdonneeP3 = ChapeauPoint3.getOrdonnee() + deplacementY;
        ChapeauPoint3.setAbscisse(nouvelleAbscisseP3);
        ChapeauPoint3.setOrdonnee(nouvelleOrdonneeP3);


    }

    @Override
    public String typeForme() {
        return "C";
    }
}
