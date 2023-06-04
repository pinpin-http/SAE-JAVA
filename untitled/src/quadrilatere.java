import ardoise.Ardoise;
import ardoise.Forme;
import ardoise.PointPlan;
import ardoise.Segment;

import java.util.ArrayList;

public class quadrilatere extends Forme {
    private final PointPlan QuadrilaterePoint1;
    private final PointPlan QuadrilaterePoint2;

    public quadrilatere(PointPlan p1,PointPlan p2){
        this.QuadrilaterePoint1 = p1;
        this.QuadrilaterePoint2 = p2;
    }



    @Override
    public ArrayList<Segment> dessiner() {

        int test1 =this.QuadrilaterePoint2.getAbscisse()-this.QuadrilaterePoint1.getAbscisse();
        int test2 = this.QuadrilaterePoint1.getAbscisse()+this.QuadrilaterePoint2.getOrdonnee();
        PointPlan p3 = new PointPlan(test1,test1);
        PointPlan p4 = new PointPlan(test2,test2);

        Segment s1 = new Segment(this.QuadrilaterePoint1, p4);
        Segment s2 = new Segment(p4, this.QuadrilaterePoint2);
        Segment s3 = new Segment(this.QuadrilaterePoint2, p3);;
        Segment s4 = new Segment(p3, this.QuadrilaterePoint1);;
        ArrayList<Segment> points = new ArrayList<Segment>();

        points.add(s1);
        points.add(s2);
        points.add(s3);
        points.add(s4);
        System.out.println("segment added");
        return points;

    }

    @Override
    public void deplacer(int i, int i1) {

    }

    @Override
    public String typeForme() {
        return "Q";
    }
}
