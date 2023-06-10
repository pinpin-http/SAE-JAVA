import ardoise.*;
import java.text.Format;
import java.util.ArrayList;
import java.util.PrimitiveIterator;

public class triangles extends Forme {

    private  PointPlan TrianglePoint1;
    private  PointPlan TrianglePoint2;
    private  PointPlan TrianglePoint3;
    private String Nom;

    public triangles(String unNom,PointPlan p1,PointPlan p2,PointPlan p3){
        this.TrianglePoint1 = p1;
        this.TrianglePoint2 = p2;
        this.TrianglePoint3 = p3;
        this.Nom=unNom;
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
        System.out.println("segments triangle ajoutées");
        return points;

    }

    @Override
    public void deplacer(int deplacementX, int deplacementY) {
        int nouvelleAbscisseP1 = TrianglePoint1.getAbscisse() + deplacementX;
        int nouvelleOrdonneeP1 = TrianglePoint1.getOrdonnee() + deplacementY;
        TrianglePoint1.setAbscisse(nouvelleAbscisseP1);
        TrianglePoint1.setOrdonnee(nouvelleOrdonneeP1);

        int nouvelleAbscisseP2 = TrianglePoint2.getAbscisse() + deplacementX;
        int nouvelleOrdonneeP2 = TrianglePoint2.getOrdonnee() + deplacementY;
        TrianglePoint2.setAbscisse(nouvelleAbscisseP2);
        TrianglePoint2.setOrdonnee(nouvelleOrdonneeP2);

        int nouvelleAbscisseP3 = TrianglePoint3.getAbscisse() + deplacementX;
        int nouvelleOrdonneeP3 = TrianglePoint3.getOrdonnee() + deplacementY;
        TrianglePoint3.setAbscisse(nouvelleAbscisseP3);
        TrianglePoint3.setOrdonnee(nouvelleOrdonneeP3);
    }

    @Override
    public String typeForme() {
        return "T";
    }
}
