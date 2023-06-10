import ardoise.*;

import java.util.ArrayList;

public class maison extends Forme {

    //formes maisons
    private quadrilatere rectangle;
    private quadrilatere porte;
    private chapeaux toit;
    //variable point aide forme
    private PointPlan pSuperieurGauche;
    private PointPlan pInferieurDroit;
    private PointPlan pSuperieurDroit;
    //variable aide porte + toit
    private int hauteurToit;
    private int hauteurPorte;
    private int largeurPorte;

    public maison(String unNom,PointPlan pSuperieurGauche,PointPlan pInferieurDroit,int uneHauteurToit,int uneHauteurPorte,int uneLargeurPorte){

        //parametres de bases
        super(unNom);
       this.pInferieurDroit=pInferieurDroit;
       this.pSuperieurGauche=pSuperieurGauche;
       this.pSuperieurDroit= new PointPlan(pInferieurDroit.getAbscisse(), pSuperieurGauche.getOrdonnee());
       this.hauteurToit = uneHauteurToit;
       this.hauteurPorte = uneHauteurPorte;
       this.largeurPorte=uneLargeurPorte;

        //setup toit
        int millieuLongueur =pSuperieurGauche.getAbscisse()+ ((pSuperieurDroit.getAbscisse()-pSuperieurGauche.getAbscisse())/2);

        PointPlan p2Chapeau = new PointPlan(millieuLongueur,pSuperieurGauche.getOrdonnee() - hauteurToit);


       //porte
        PointPlan pointPorte1 = new PointPlan(millieuLongueur-(largeurPorte/2),pInferieurDroit.getOrdonnee()-hauteurPorte);
        PointPlan pointPorte2 = new PointPlan(millieuLongueur+(largeurPorte/2),pInferieurDroit.getOrdonnee());



       //formes
        this.rectangle = new quadrilatere(unNom,pSuperieurGauche,pInferieurDroit);
        this.toit = new chapeaux(unNom,pSuperieurGauche,p2Chapeau,pSuperieurDroit);
        this.porte = new quadrilatere(unNom,pointPorte1,pointPorte2);
    }




    public ArrayList<Segment> dessiner() {
        ArrayList<Segment> points = new ArrayList<Segment>();
        for(int i = 0; i < this.rectangle.dessiner().size();i++){
            points.add(this.rectangle.dessiner().get(i));
        }
        for(int i = 0; i < this.toit.dessiner().size();i++){
            points.add(this.toit.dessiner().get(i));
        }
        for(int i = 0;i<this.porte.dessiner().size();i++){
            points.add(this.porte.dessiner().get(i));
        }


        return points;
    }

    public void deplacer(int x, int y) {


    }

    public String typeForme() {
        return "GF";
    }
}
