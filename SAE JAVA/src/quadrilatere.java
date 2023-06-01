import ardoise.Ardoise;
import ardoise.Forme;
import ardoise.PointPlan;
import ardoise.Segment;

import java.util.ArrayList;

public class quadrilatere extends Forme {
    private PointPlan QuadrilaterePoint1;
    private PointPlan QuadrilaterePoint2;

    public quadrilatere(PointPlan p1,PointPlan p2){
        this.QuadrilaterePoint1 = p1;
        this.QuadrilaterePoint2 = p2;
    }



    @Override
    public ArrayList<Segment> dessiner() {

        int test =QuadrilaterePoint1.getAbscisse()-QuadrilaterePoint2.getAbscisse();

        Segment s1 = new Segment();
        Segment s2;
        Segment s3;
        Segment s4;
        ArrayList<Segment> unQuadrilatere = new ArrayList<Segment>();




        return unQuadrilatere;
    }

    @Override
    public void deplacer(int i, int i1) {

    }

    @Override
    public String typeForme() {
        return "Q";
    }
}
