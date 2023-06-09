import ardoise.Ardoise;
import ardoise.Forme;
import ardoise.PointPlan;
import ardoise.Segment;

import java.util.ArrayList;

public class quadrilatere extends Forme {
    private PointPlan pointSuperieurGauche;
    private PointPlan pointInferieurDroit;

    public quadrilatere(PointPlan pointSuperieurGauche, PointPlan pointInferieurDroit) {
        super("Q");
        this.pointSuperieurGauche = pointSuperieurGauche;
        this.pointInferieurDroit = pointInferieurDroit;
    }



    @Override
    public ArrayList<Segment> dessiner() {



        ArrayList<Segment> segments = new ArrayList<Segment>();

        PointPlan pointSuperieurDroit = new PointPlan(pointInferieurDroit.getAbscisse(), pointSuperieurGauche.getOrdonnee());
        PointPlan pointInferieurGauche = new PointPlan(pointSuperieurGauche.getAbscisse(), pointInferieurDroit.getOrdonnee());

        Segment s1 = new Segment(pointSuperieurGauche, pointSuperieurDroit);
        Segment s2 = new Segment(pointSuperieurDroit, pointInferieurDroit);
        Segment s3 = new Segment(pointInferieurDroit, pointInferieurGauche);
        Segment s4 = new Segment(pointInferieurGauche, pointSuperieurGauche);

        segments.add(s1);
        segments.add(s2);
        segments.add(s3);
        segments.add(s4);

        return segments;

    }

    @Override
    public void deplacer(int deplacementX, int deplacementY) {

        int nouvelleAbscissePointSuperieurGauche = pointSuperieurGauche.getAbscisse() + deplacementX;
        int nouvelleOrdonneePointSuperieurGauche = pointSuperieurGauche.getOrdonnee() + deplacementY;
        pointSuperieurGauche.setAbscisse(nouvelleAbscissePointSuperieurGauche);
        pointSuperieurGauche.setOrdonnee(nouvelleOrdonneePointSuperieurGauche);

        int nouvelleAbscissePointInferieurDroit = pointInferieurDroit.getAbscisse() + deplacementX;
        int nouvelleOrdonneePointInferieurDroit = pointInferieurDroit.getOrdonnee() + deplacementY;
        pointInferieurDroit.setAbscisse(nouvelleAbscissePointInferieurDroit);
        pointInferieurDroit.setOrdonnee(nouvelleOrdonneePointInferieurDroit);
        }




    @Override
    public String typeForme() {
        return "Q";
    }
}
