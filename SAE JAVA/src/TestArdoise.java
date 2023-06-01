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
             PointPlan p1 = new PointPlan(50, 50);
             PointPlan p2 = new PointPlan(50, 150);
             PointPlan p3 = new PointPlan(150,50);
             Forme t1 = new triangles(p1,p2,p3);
             ardoise.ajouterForme(t1);
             t1.dessiner();
         }
 }

