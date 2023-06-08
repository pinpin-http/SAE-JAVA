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
             /*


             PointPlan p1 = new PointPlan(80, 140);
             PointPlan p2 = new PointPlan(130, 100);
             PointPlan p3 = new PointPlan(180,140);
             Forme t1 = new triangles(p1,p2,p3);
             ardoise.ajouterForme(t1);
             t1.dessiner();


             PointPlan p11 = new PointPlan(152, 7);
             PointPlan p12 = new PointPlan(166, 3);
             PointPlan p13 = new PointPlan(172,7);
             Forme t2 = new triangles(p11,p12,p13);
             ardoise.ajouterForme(t2);
             t2.dessiner();


*/
             ardoise.dessinerGraphique();
             PointPlan p1 = new PointPlan(80, 140);
             PointPlan p2 = new PointPlan(140, 80);
             Forme q1 = new quadrilatere(p1,p2);
             ardoise.ajouterForme(q1);
             q1.dessiner();
/*
             PointPlan p5 = new PointPlan(80,140);
             PointPlan p6 = new PointPlan(180, 140);
             PointPlan p4 = new PointPlan(130,100);

             Forme c1 = new chapeaux(p4,p5,p6);
             ardoise.ajouterForme(c1);
             c1.dessiner();

*/
         }
 }

