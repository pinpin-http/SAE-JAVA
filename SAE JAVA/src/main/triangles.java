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

    public triangles(String unNom, PointPlan p1, PointPlan p2, PointPlan p3) {
        this.TrianglePoint1 = p1;
        this.TrianglePoint2 = p2;
        this.TrianglePoint3 = p3;
        this.Nom = unNom;
    }

    public triangles(triangles autreTriangle) {
        try {
            this.Nom = autreTriangle.getNom();
            this.TrianglePoint1 = new PointPlan(autreTriangle.getTrianglePoint1().getAbscisse(), autreTriangle.getTrianglePoint1().getOrdonnee());
            this.TrianglePoint2 = new PointPlan(autreTriangle.getTrianglePoint2().getAbscisse(), autreTriangle.getTrianglePoint2().getOrdonnee());
            this.TrianglePoint3 = new PointPlan(autreTriangle.getTrianglePoint3().getAbscisse(), autreTriangle.getTrianglePoint3().getOrdonnee());
        } catch (NullPointerException e) {
            System.out.println("Une exception s'est produite lors de la création du triangle à partir d'un autre triangle.");
            e.printStackTrace();
        }
    }

    // Getter

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

    // Setter

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

    // Méthodes

    @Override
    public ArrayList<Segment> dessiner() {
        ArrayList<Segment> points = new ArrayList<Segment>();

        try {
            Segment s1 = new Segment(this.TrianglePoint1, this.TrianglePoint2);
            Segment s2 = new Segment(this.TrianglePoint1, this.TrianglePoint3);
            Segment s3 = new Segment(this.TrianglePoint2, this.TrianglePoint3);

            points.add(s1);
            points.add(s2);
            points.add(s3);
        } catch (NullPointerException e) {
            System.out.println("Une exception s'est produite lors du dessin du triangle.");
            e.printStackTrace();
        }

        return points;
    }

    @Override
    public void deplacer(int deplacementX, int deplacementY) {
        try {
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
        } catch (NullPointerException e) {
            System.out.println("Une exception s'est produite lors du déplacement du triangle.");
            e.printStackTrace();
        }
    }

    @Override
    public String typeForme() {
        try {
            return "T";
        } catch (Exception e) {
            System.out.println("Erreur lors de la récupération du type de forme : " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

}


