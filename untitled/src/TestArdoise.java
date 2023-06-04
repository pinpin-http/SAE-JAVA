import ardoise.Ardoise;
import ardoise.Forme.*;
import ardoise.Forme;
import ardoise.PointPlan;
import ardoise.*;

import java.util.ArrayList;

public class TestArdoise {

         public static void main(String []args ) {
             /*
             Ardoise ardoise = new Ardoise();
             ardoise.dessinerGraphique();
             PointPlan p1 = new PointPlan(50, 50);
             PointPlan p2 = new PointPlan(50, 150);
             PointPlan p3 = new PointPlan(150,50);
             Forme t1 = new triangles(p1,p2,p3);
             ardoise.ajouterForme(t1);
             t1.dessiner();

             PointPlan p4 = new PointPlan(60, 60);
             PointPlan p5 = new PointPlan(60, 160);
             PointPlan p6 = new PointPlan(160,60);

             Forme c1 = new chapeaux(p4,p5,p6);
             ardoise.ajouterForme(c1);
             c1.dessiner();

              */
             Ardoise ardoise = new Ardoise();
             ardoise.dessinerGraphique();
             PointPlan p1 = new PointPlan(50, 100);
             PointPlan p2 = new PointPlan(100, 50);
             Forme q1 = new quadrilatere(p1,p2);
             ardoise.ajouterForme(q1);
             q1.dessiner();
         }
 }

