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
        super("C");
        this.ChapeauPoint1 = p1;
        this.ChapeauPoint2 = p2;
        this.ChapeauPoint3 = p3;
    }

    @Override
    public ArrayList<Segment> dessiner() {

        Segment s1 = new Segment(this.ChapeauPoint1, this.ChapeauPoint2);
        Segment s2 = new Segment(this.ChapeauPoint2, this.ChapeauPoint3);
        ArrayList<Segment> points = new ArrayList<Segment>();

        points.add(s1);
        points.add(s2);

        System.out.println("segment added");
        return points;
    }

    @Override
    public void deplacer(int deplacementX, int deplacementY) {
        int nouvelleAbscisseP1 = this.ChapeauPoint1.getAbscisse() + deplacementX;
        int nouvelleOrdonneeP1 = this.ChapeauPoint1.getOrdonnee() + deplacementY;
        this.ChapeauPoint1.setAbscisse(nouvelleAbscisseP1);
        this.ChapeauPoint1.setOrdonnee(nouvelleOrdonneeP1);

        int nouvelleAbscissePoint2 = this.ChapeauPoint2.getAbscisse() + deplacementX;
        int nouvelleOrdonneePoint2 = this.ChapeauPoint2.getOrdonnee() + deplacementY;
        this.ChapeauPoint2.setAbscisse(nouvelleAbscissePoint2);
        this.ChapeauPoint2.setOrdonnee(nouvelleOrdonneePoint2);

        int nouvelleAbscisseP3 = this.ChapeauPoint3.getAbscisse() + deplacementX;
        int nouvelleOrdonneeP3 = this.ChapeauPoint3.getOrdonnee() + deplacementY;
        this.ChapeauPoint3.setAbscisse(nouvelleAbscisseP3);
        this.ChapeauPoint3.setOrdonnee(nouvelleOrdonneeP3);
    }

    @Override
    public String typeForme() {
        return "C";
    }
}
