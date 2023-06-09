import ardoise.Ardoise;
import ardoise.Forme.*;
import ardoise.Forme;
import ardoise.PointPlan;
import ardoise.*;



import java.util.ArrayList;

public class TestArdoise {

         public static void main(String []args ) {


             Ardoise ardoise = new Ardoise();
             ardoise.dessinerGraphique();

             PointPlan p1 = new PointPlan(80, 140);
             PointPlan p2 = new PointPlan(140, 180);
             PointPlan p3 = new PointPlan(180,80);
             Forme t1 = new triangles(p1,p2,p3);
             ardoise.ajouterForme(t1);
             t1.dessiner();
             t1.deplacer(10,20);



             PointPlan p4 = new PointPlan(120, 170);
             PointPlan p5 = new PointPlan(140, 198);
             Forme q1 = new quadrilatere(p4,p5);
             ardoise.ajouterForme(q1);
             q1.dessiner();
             t1.deplacer(10,20);


             PointPlan p6 = new PointPlan(118,13);
             PointPlan p7 = new PointPlan(123, 20);
             PointPlan p8 = new PointPlan(128,13);
             Forme c1 = new chapeaux(p6,p7,p8);
             ardoise.ajouterForme(c1);
             c1.dessiner();
             c1.deplacer(10,20);

         }
 }

