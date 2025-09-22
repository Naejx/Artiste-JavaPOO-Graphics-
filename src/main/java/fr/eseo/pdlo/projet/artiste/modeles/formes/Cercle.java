package fr.eseo.pdlo.projet.artiste.modeles.formes;
import fr.eseo.pdlo.projet.artiste.modeles.Coordonnees;


public class Cercle extends Elipse {
    private Coordonnees point1;

    public Cercle() {
        point1 = new Coordonnees(0, 0);
    }

    public Cercle(double taille) {
        point1 = new Coordonnees(0, 0);
        setLargeur(taille);
        setHauteur(taille);
    }

    public Cercle(Coordonnees point1) {
        this.point1 = point1;
        setPosition(point1);
        setLargeur(10);
        setHauteur(10);
    }

    public Cercle(Coordonnees point1, double taille) {
        this.point1 = point1;
        setPosition(point1);
        setLargeur(taille);
        setHauteur(taille);
    }

    public void setLargeur(double largeur) {
        super.setLargeur(largeur);
        super.setHauteur(largeur);
    }

    public void setHauteur(double hauteur) {
        super.setHauteur(hauteur);
        super.setLargeur(hauteur);
    }

    public String toString() {
        return "Cercle[centre=" + getPosition() + ", rayon=" + (getLargeur() / 2) + "]" + "aire=" + getSurface() + "cm²" + "perimetre=" + getPerimetre() + "cm";
    }
    
    public double getSurface() {
        return Math.PI * Math.pow((getLargeur() / 2), 2);
    }

    public double getPerimetre() {
        return 2 * Math.PI * (getLargeur() / 2);
    }
}
