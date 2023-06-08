import ardoise.Forme;
import ardoise.PointPlan;
import ardoise.Segment;

import java.awt.*;
import java.util.ArrayList;

public class chapeaux extends Forme {

    private PointPlan ChapeauPoint1;
    private PointPlan ChapeauPoint2;
    private PointPlan ChapeauPoint3;

    public chapeaux(PointPlan p1,PointPlan p2,PointPlan p3){
        this.ChapeauPoint1 = p1;
        this.ChapeauPoint2 = p2;
        this.ChapeauPoint3 = p3;
    }

    @Override
    public ArrayList<Segment> dessiner() {

        Segment s1 = new Segment(this.ChapeauPoint1, this.ChapeauPoint2);
        Segment s2 = new Segment(this.ChapeauPoint1, this.ChapeauPoint3);
        ArrayList<Segment> points = new ArrayList<Segment>();

        points.add(s1);
        points.add(s2);

        System.out.println("segment added");
        return points;
    }

    @Override
    public void deplacer(int deplacementX, int deplacementY) {
        int nouvelleAbscisseP1 = p1.getAbscisse() + deplacementX;
        int nouvelleOrdonneeP1 = p1.getOrdonnee() + deplacementY;
        p1.setAbscisse(nouvelleAbscisseP1);
        p1.setOrdonnee(nouvelleOrdonneeP1);

        int nouvelleAbscisseP2 = p2.getAbscisse() + deplacementX;
        int nouvelleOrdonneeP2 = p2.getOrdonnee() + deplacementY;
        p2.setAbscisse(nouvelleAbscisseP2);
        p2.setOrdonnee(nouvelleOrdonneeP2);

        int nouvelleAbscisseP3 = p3.getAbscisse() + deplacementX;
        int nouvelleOrdonneeP3 = p3.getOrdonnee() + deplacementY;
        p3.setAbscisse(nouvelleAbscisseP3);
        p3.setOrdonnee(nouvelleOrdonneeP3);


    }

    @Override
    public String typeForme() {
        return "C";
    }
}
