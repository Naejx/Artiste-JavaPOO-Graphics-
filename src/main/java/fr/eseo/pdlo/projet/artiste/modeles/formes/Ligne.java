package fr.eseo.pdlo.projet.artiste.modeles.formes;
import fr.eseo.pdlo.projet.artiste.modeles.Coordonnees;

public class Ligne extends Forme {

    private Coordonnees point1;
    private Coordonnees point2;

    public Ligne() {
        this.point1 = new Coordonnees(0, 0);
        this.point2 = new Coordonnees(10, 0);
    }

    public Ligne(Coordonnees point1) {
        this.point1 = point1;
        this.point2 = new Coordonnees(point1.getX() + 10, point1.getY());
    }
    
    public Ligne(Coordonnees point1, double L, double H) {
        super(point1, L, H); // Initialise la position dans la classe parente
        this.point1 = point1;
        this.point2 = new Coordonnees(point1.getX() + L, point1.getY() + H);
    }

    public Coordonnees getPoint1() {
        return point1;
    }

    public Coordonnees getPoint2() {
        return point2;
    }

    public void setPoint1(Coordonnees point1) {
        this.point1 = point1;
    }

    public void setPoint2(Coordonnees point2) {
        this.point2 = point2;
    }

    public String toString() {
        return "Ligne[point1=" + point1 + ", point2=" + point2 + "]" + "longueur=" + getPerimetre() + "cm";
    }

    public double getSurface() {
        return 0;
    }

    public double getPerimetre() {
        return point1.distanceVers(point2);
    }

}