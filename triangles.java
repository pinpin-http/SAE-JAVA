import ardoise.*;
import java.text.Format;
import java.util.ArrayList;
import java.util.PrimitiveIterator;

public class triangles extends Forme {

    private  PointPlan TrianglePoint1;
    private  PointPlan TrianglePoint2;
    private  PointPlan TrianglePoint3;

    public triangles(PointPlan p1,PointPlan p2,PointPlan p3){
        super("T");
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
        int nouvelleAbscisseP1 = this.TrianglePoint1.getAbscisse() + deplacementX;
        int nouvelleOrdonneeP1 = this.TrianglePoint1.getOrdonnee() + deplacementY;
        this.TrianglePoint1.setAbscisse(nouvelleAbscisseP1);
        this.TrianglePoint1.setOrdonnee(nouvelleOrdonneeP1);

        int nouvelleAbscisseP2 = this.TrianglePoint2.getAbscisse() + deplacementX;
        int nouvelleOrdonneeP2 = this.TrianglePoint2.getOrdonnee() + deplacementY;
        this.TrianglePoint2.setAbscisse(nouvelleAbscisseP2);
        this.TrianglePoint2.setOrdonnee(nouvelleOrdonneeP2);

        int nouvelleAbscisseP3 = this.TrianglePoint3.getAbscisse() + deplacementX;
        int nouvelleOrdonneeP3 = this.TrianglePoint3.getOrdonnee() + deplacementY;
        this.TrianglePoint3.setAbscisse(nouvelleAbscisseP3);
        this.TrianglePoint3.setOrdonnee(nouvelleOrdonneeP3);
    }

    @Override
    public String typeForme() {
        return "T";
    }
}
