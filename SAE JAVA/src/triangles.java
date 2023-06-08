import ardoise.*;
import java.text.Format;
import java.util.ArrayList;
import java.util.PrimitiveIterator;

public class triangles extends Forme {

    private  PointPlan TrianglePoint1;
    private  PointPlan TrianglePoint2;
    private  PointPlan TrianglePoint3;

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
    public void deplacer(int deplacementX, int deplacementY) {
        int nouvelleAbscisseP1 = p1.getAbscisse() + deplacementX;
        int nouvelleOrdonneePo1 = p1.getOrdonnee() + deplacementY;
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
        return "T";
    }
}
