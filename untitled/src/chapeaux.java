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
    public void deplacer(int i, int i1) {

    }

    @Override
    public String typeForme() {
        return "C";
    }
}
