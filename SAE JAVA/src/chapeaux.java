import ardoise.Forme;
import ardoise.PointPlan;
import ardoise.Segment;

import java.awt.*;
import java.util.ArrayList;

public class chapeaux extends Forme {

    PointPlan ChapeauPoint1;
    PointPlan ChapeauPoint2;
    PointPlan ChapeauPoint3;

    public chapeaux(PointPlan p1,PointPlan p2,PointPlan p3){
        this.ChapeauPoint1 = p1;
        this.ChapeauPoint2 = p2;
        this.ChapeauPoint3 = p3;
    }

    @Override
    public ArrayList<Segment> dessiner() {
        return null;
    }

    @Override
    public void deplacer(int i, int i1) {

    }

    @Override
    public String typeForme() {
        return "C";
    }
}
