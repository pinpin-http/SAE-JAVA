import ardoise.Forme;
import ardoise.PointPlan;
import ardoise.Segment;

import java.awt.*;
import java.util.ArrayList;

public class chapeaux extends Forme {

    private PointPlan ChapeauPoint1;
    private PointPlan ChapeauPoint2;
    private PointPlan ChapeauPoint3;
    private String Nom;

    public chapeaux(String unNom,PointPlan p1,PointPlan p2,PointPlan p3){
        super(unNom);
        this.ChapeauPoint1 = p1;
        this.ChapeauPoint2 = p2;
        this.ChapeauPoint3 = p3;

    }

    //getter
    public PointPlan getChapeauPoint1(){
        return this.ChapeauPoint1;
    }
    public PointPlan getChapeauPoint2() {
        return ChapeauPoint2;
    }
    public PointPlan getChapeauPoint3() {
        return ChapeauPoint3;
    }
    public String getNom(){
        return this.Nom;
    }


    @Override
    public ArrayList<Segment> dessiner() {

        Segment s1 = new Segment(this.ChapeauPoint1, this.ChapeauPoint2);
        Segment s2 = new Segment(this.ChapeauPoint2, this.ChapeauPoint3);
        ArrayList<Segment> points = new ArrayList<Segment>();

        points.add(s1);
        points.add(s2);

        System.out.println("segments chapeau ajoutées");
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
