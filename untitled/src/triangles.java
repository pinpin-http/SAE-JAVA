import ardoise.*;
import java.text.Format;
import java.util.ArrayList;
import java.util.PrimitiveIterator;

public class triangles extends Forme {

    private final PointPlan TrianglePoint1;
    private final PointPlan TrianglePoint2;
    private final PointPlan TrianglePoint3;

    public triangles(PointPlan p1,PointPlan p2,PointPlan p3){
        this.TrianglePoint1 = p1;
        this.TrianglePoint2 = p2;
        this.TrianglePoint3 = p3;

        System.out.println("triangle fait"+TrianglePoint1);
    }


    @Override
    public ArrayList<Segment> dessiner() {
        Segment s1 = new Segment(this.TrianglePoint1, this.TrianglePoint2);
        Segment s2 = new Segment(this.TrianglePoint1, this.TrianglePoint3);
        Segment s3 = new Segment(this.TrianglePoint2, this.TrianglePoint3);

        ArrayList<Segment> points = new ArrayList<Segment>();
        points.add(s1);
        points.add(s2);
        points.add(s3);
        System.out.println("segment added");
        return points;

    }

    @Override
    public void deplacer(int i, int i1) {

    }

    @Override
    public String typeForme() {
        return "T";
    }
}
