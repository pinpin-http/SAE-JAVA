import ardoise.Ardoise;
import ardoise.Forme.*;
import ardoise.Forme;
import ardoise.PointPlan;
import ardoise.*;
import java.lang.*;


import java.util.ArrayList;

public class TestArdoise {

         public static void main(String []args ) throws InterruptedException {

             Ardoise ardoise = new Ardoise();
             ardoise.dessinerGraphique();






            //tour

             PointPlan p1 = new PointPlan(9, 100);
             PointPlan p2 = new PointPlan(20, 198);
             quadrilatere q1 = new quadrilatere("tour",p1,p2);
             ardoise.ajouterForme(q1);

             //oiseaux
             PointPlan p3 = new PointPlan(118,13);
             PointPlan p4 = new PointPlan(123,20);
             PointPlan p5 = new PointPlan(128,13);
             chapeaux c1 = new chapeaux("oiseau 1",p3,p4,p5);
             ardoise.ajouterForme(c1);

             PointPlan p6 = new PointPlan(133,30);
             PointPlan p7 = new PointPlan(136,32);
             PointPlan p8 = new PointPlan(138,30);
             chapeaux c2 = new chapeaux("oiseau 2",p6,p7,p8);
             ardoise.ajouterForme(c2);

             PointPlan p9 = new PointPlan(142,14);
             PointPlan p10 = new PointPlan(144,17);
             PointPlan p11 = new PointPlan(146,14);
             chapeaux c3 = new chapeaux("oiseau 3",p9,p10,p11);
             ardoise.ajouterForme(c3);

             //maison
             PointPlan p12 = new PointPlan(80,140);
             PointPlan p13 = new PointPlan(180,198);
             maison maison1=new maison ("e",p12,p13,30,28,20);
             ardoise.ajouterForme(maison1);
             maison1.dessiner();

             //montagnes
             PointPlan p14 = new PointPlan(3,14);
             PointPlan p15 = new PointPlan(43,3);
             PointPlan p16 = new PointPlan(112,14);
             triangles t1 = new triangles("montagne 1",p14,p15,p16);
             ardoise.ajouterForme(t1);

             PointPlan p17 = new PointPlan(152,7);
             PointPlan p18 = new PointPlan(166,3);
             PointPlan p19 = new PointPlan(172,7);
             triangles t2 =  new triangles("montagne 2",p17,p18,p19);
             ardoise.ajouterForme(t2);

             //bouger oiseaux
             Thread.sleep(1000);
             System.out.println("sleep end");
             ardoise.deplacer("C",10,20);


         }
 }

