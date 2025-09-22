package fr.eseo.pdlo.projet.artiste.modeles.formes;
import fr.eseo.pdlo.projet.artiste.modeles.Coordonnees;

public abstract class Forme {
    double L = 10;
    double H = 5;
    Coordonnees position;
    public Forme() {
        this.L = 10;
        this.H = 5;
    }

    public Forme(double L, double H) {
        this.L = L;
        this.H = H;
    }

    public Forme(Coordonnees coord) {
        this.position = coord;
    }

    public Forme(Coordonnees coord, double L, double H) {
        this.L = L;
        this.H = H;
        this.position = coord;
    }

    public Coordonnees getPosition() {
        return position;
    }

    public double getLargeur() {
        return L;
    }

    public double getHauteur() {
        return H;
    }

    public double getCadreMinX() {
        return position.getX();
    }

    public double getCadreMinY() {
        return position.getY();
    }

    public double getCadreMaxX() {
        return position.getX() + L;
    }

    public double getCadreMaxY() {
        return position.getY() + H;
    }

    public void setPosition(Coordonnees pos) {
        position = pos;
    }

    public void setLargeur(double largeur) {
        L = largeur;
    }

    public void setHauteur(double hauteur) {
        H = hauteur;
    }

    public void deplacerDe(double deltaX, double deltaY) {
        position.deplacerDe(deltaX, deltaY);
    }

    public void deplacervers(double newX, double newY) {
        position.setX(newX);
        position.setY(newY);
    }

    public double aire() {
        return 0.0;
    }

    public double perimetre() {
        return 0.0;
    } 
}
