package main;
import ardoise.Forme;
import ardoise.PointPlan;
import ardoise.Segment;
import main.chapeaux;

import java.util.ArrayList;

public class etoile extends Forme {
    private chapeaux chapeau1;
    private chapeaux chapeau2;
    private chapeaux chapeau3;
    private chapeaux chapeau4;
    private String nom;
    private PointPlan etoilePoint1;
    private PointPlan etoilePoint2;
    private PointPlan etoilePoint3;
    private PointPlan etoilePoint4;
    private PointPlan etoilePoint5;
    private PointPlan etoilePoint6;
    private PointPlan etoilePoint7;
    private PointPlan etoilePoint8;

    public etoile() {
        super("");
        this.chapeau1 = null;
        this.chapeau2 = null;
        this.chapeau3 = null;
        this.chapeau4 = null;
        this.nom = null;
        this.etoilePoint1 = null;
        this.etoilePoint2 = null;
        this.etoilePoint3 = null;
        this.etoilePoint4 = null;
        this.etoilePoint5 = null;
        this.etoilePoint6 = null;
        this.etoilePoint7 = null;
        this.etoilePoint8 = null;
    }

    public etoile(String unNom, PointPlan p1, PointPlan p2, PointPlan p3, PointPlan p4, PointPlan p5, PointPlan p6, PointPlan p7, PointPlan p8) {
        this.nom = unNom;
        this.etoilePoint1 = p1;
        this.etoilePoint2 = p2;
        this.etoilePoint3 = p3;
        this.etoilePoint4 = p4;
        this.etoilePoint5 = p5;
        this.etoilePoint6 = p6;
        this.etoilePoint7 = p7;
        this.etoilePoint8 = p8;

        try {
            this.chapeau1 = new chapeaux("branche1", this.etoilePoint1, this.etoilePoint2, this.etoilePoint3);
            this.chapeau2 = new chapeaux("branche2", this.etoilePoint3, this.etoilePoint4, this.etoilePoint5);
            this.chapeau3 = new chapeaux("branche3", this.etoilePoint5, this.etoilePoint6, this.etoilePoint7);
            this.chapeau4 = new chapeaux("branche4", this.etoilePoint7, this.etoilePoint8, this.etoilePoint1);
        } catch (NullPointerException e) {
            System.out.println("Erreur : Les points de l'étoile sont nuls.");
        }
    }

    public etoile(etoile autreEtoile) {
        this.nom = new String(autreEtoile.getNom());

        try {
            this.chapeau1 = new chapeaux(autreEtoile.getChapeau1());
            this.chapeau2 = new chapeaux(autreEtoile.getChapeau2());
            this.chapeau3 = new chapeaux(autreEtoile.getChapeau3());
            this.chapeau4 = new chapeaux(autreEtoile.getChapeau4());
        } catch (NullPointerException e) {
            System.out.println("Erreur : Le chapeau de l'étoile est nul.");
        }
    }

    public chapeaux getChapeau1() {
        return this.chapeau1;
    }

    public void setChapeau1(chapeaux chapeau1) {
        this.chapeau1 = chapeau1;
    }

    public chapeaux getChapeau2() {
        return this.chapeau2;
    }

    public void setChapeau2(chapeaux chapeau2) {
        this.chapeau2 = chapeau2;
    }

    public chapeaux getChapeau3() {
        return this.chapeau3;
    }

    public void setChapeau3(chapeaux chapeau3) {
        this.chapeau3 = chapeau3;
    }

    public chapeaux getChapeau4() {
        return this.chapeau4;
    }

    public void setChapeau4(chapeaux chapeau4) {
        this.chapeau4 = chapeau4;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public PointPlan getEtoilePoint1() {
        return this.etoilePoint1;
    }

    public void setEtoilePoint1(PointPlan etoilePoint1) {
        this.etoilePoint1 = etoilePoint1;
    }

    public PointPlan getEtoilePoint2() {
        return this.etoilePoint2;
    }

    public void setEtoilePoint2(PointPlan etoilePoint2) {
        this.etoilePoint2 = etoilePoint2;
    }

    public PointPlan getEtoilePoint3() {
        return this.etoilePoint3;
    }

    public void setEtoilePoint3(PointPlan etoilePoint3) {
        this.etoilePoint3 = etoilePoint3;
    }

    public PointPlan getEtoilePoint4() {
        return this.etoilePoint4;
    }

    public void setEtoilePoint4(PointPlan etoilePoint4) {
        this.etoilePoint4 = etoilePoint4;
    }

    public PointPlan getEtoilePoint5() {
        return this.etoilePoint5;
    }

    public void setEtoilePoint5(PointPlan etoilePoint5) {
        this.etoilePoint5 = etoilePoint5;
    }

    public PointPlan getEtoilePoint6() {
        return this.etoilePoint6;
    }

    public void setEtoilePoint6(PointPlan etoilePoint6) {
        this.etoilePoint6 = etoilePoint6;
    }

    public PointPlan getEtoilePoint7() {
        return this.etoilePoint7;
    }

    public void setEtoilePoint7(PointPlan etoilePoint7) {
        this.etoilePoint7 = etoilePoint7;
    }

    public PointPlan getEtoilePoint8() {
        return this.etoilePoint8;
    }

    public void setEtoilePoint8(PointPlan etoilePoint8) {
        this.etoilePoint8 = etoilePoint8;
    }

    public ArrayList<Segment> dessiner() {
        ArrayList<Segment> points = new ArrayList<Segment>();

        try {
            points.addAll(chapeau1.dessiner());
            points.addAll(chapeau2.dessiner());
            points.addAll(chapeau3.dessiner());
            points.addAll(chapeau4.dessiner());
        } catch (NullPointerException e) {
            System.out.println("Erreur : L'étoile ou ses chapeaux sont nuls.");
        }

        System.out.println("Segments étoile ajoutés");

        return points;
    }

    public void deplacer(int x, int y) {
        try {
            etoilePoint1.deplacer(x, y);
            etoilePoint2.deplacer(x, y);
            etoilePoint3.deplacer(x, y);
            etoilePoint4.deplacer(x, y);
            etoilePoint5.deplacer(x, y);
            etoilePoint6.deplacer(x, y);
            etoilePoint7.deplacer(x, y);
            etoilePoint8.deplacer(x, y);
        } catch (NullPointerException e) {
            System.out.println("Erreur : Les points de l'étoile sont nuls.");
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
