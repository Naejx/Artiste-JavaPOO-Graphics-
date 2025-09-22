package fr.eseo.pdlo.projet.artiste.modeles.formes;
import fr.eseo.pdlo.projet.artiste.modeles.Coordonnees;

public class Elipse extends Forme {

    public Elipse() {
        super(new Coordonnees(0, 0));
    }

    public Elipse(Coordonnees points1) {
        super(points1);
    }

    public Elipse(Coordonnees points1, double L, double H) {
        super(points1, L, H);
    }

    public String toString() {
        return "Elipse[point=" + getPosition() + ", petit rayon =" + (getLargeur() / 2) + ", grand rayon=" + (getHauteur() / 2) + "]" + "aire=" + getSurface() + "cm²" + "perimetre=" + getPerimetre() + "cm";
    }

    public double getSurface() {
        return Math.PI * (getLargeur() / 2) * (getHauteur() / 2);
    }

    public double getPerimetre() {
        return Math.PI * Math.sqrt(2 * (Math.pow(getLargeur() / 2, 2) + Math.pow(getHauteur() / 2, 2)));
    }
}
