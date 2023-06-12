package main;

import ardoise.*;

import java.util.ArrayList;

public class triangles extends Forme {

    private  PointPlan TrianglePoint1;
    private  PointPlan TrianglePoint2;
    private  PointPlan TrianglePoint3;
    private String Nom;
    public triangles() {

        super();
        this.TrianglePoint1 = null;
        this.TrianglePoint2 = null;
        this.TrianglePoint3 = null;
        this.Nom = null;
    }
    public triangles(String unNom,PointPlan p1,PointPlan p2,PointPlan p3){
        this.TrianglePoint1 = p1;
        this.TrianglePoint2 = p2;
        this.TrianglePoint3 = p3;
        this.Nom=unNom;
    }
    public triangles(triangles autreTriangle) {
        this.Nom = autreTriangle.getNom();
        this.TrianglePoint1 = new PointPlan(autreTriangle.getTrianglePoint1().getAbscisse(),autreTriangle.getTrianglePoint1().getOrdonnee());
        this.TrianglePoint2 = new PointPlan(autreTriangle.getTrianglePoint2().getAbscisse(),autreTriangle.getTrianglePoint2().getOrdonnee());
        this.TrianglePoint3 = new PointPlan(autreTriangle.getTrianglePoint3().getAbscisse(),autreTriangle.getTrianglePoint3().getOrdonnee());
    }


//getter

    @Override
    public String getNomForme() {
        return super.getNomForme();
    }

    public String getNom() {
        return Nom;
    }

    public PointPlan getTrianglePoint1() {
        return TrianglePoint1;
    }

    public PointPlan getTrianglePoint2() {
        return TrianglePoint2;
    }

    public PointPlan getTrianglePoint3() {
        return TrianglePoint3;
    }
//setter

    @Override
    public void setNomForme(String nom) {
        super.setNomForme(nom);
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public void setTrianglePoint1(PointPlan trianglePoint1) {
        TrianglePoint1 = trianglePoint1;
    }

    public void setTrianglePoint2(PointPlan trianglePoint2) {
        TrianglePoint2 = trianglePoint2;
    }

    public void setTrianglePoint3(PointPlan trianglePoint3) {
        TrianglePoint3 = trianglePoint3;
    }
    //methodes

    @Override
    public ArrayList<Segment> dessiner() {
        Segment s1 = new Segment(this.TrianglePoint1, this.TrianglePoint2);
        Segment s2 = new Segment(this.TrianglePoint1, this.TrianglePoint3);
        Segment s3 = new Segment(this.TrianglePoint2, this.TrianglePoint3);

        ArrayList<Segment> points = new ArrayList<Segment>();
        points.add(s1);
        points.add(s2);
        points.add(s3);
        return points;

    }

    @Override
    public void deplacer(int deplacementX, int deplacementY) {
        int nouvelleAbscisseP1 = TrianglePoint1.getAbscisse() + deplacementX;
        int nouvelleOrdonneeP1 = TrianglePoint1.getOrdonnee() + deplacementY;
        TrianglePoint1.setAbscisse(nouvelleAbscisseP1);
        TrianglePoint1.setOrdonnee(nouvelleOrdonneeP1);

        int nouvelleAbscisseP2 = TrianglePoint2.getAbscisse() + deplacementX;
        int nouvelleOrdonneeP2 = TrianglePoint2.getOrdonnee() + deplacementY;
        TrianglePoint2.setAbscisse(nouvelleAbscisseP2);
        TrianglePoint2.setOrdonnee(nouvelleOrdonneeP2);

        int nouvelleAbscisseP3 = TrianglePoint3.getAbscisse() + deplacementX;
        int nouvelleOrdonneeP3 = TrianglePoint3.getOrdonnee() + deplacementY;
        TrianglePoint3.setAbscisse(nouvelleAbscisseP3);
        TrianglePoint3.setOrdonnee(nouvelleOrdonneeP3);
    }

    @Override
    public String typeForme() {
        return "T";
    }
}