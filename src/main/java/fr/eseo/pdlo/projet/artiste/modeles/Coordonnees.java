package fr.eseo.pdlo.projet.artiste.modeles;
import java.text.DecimalFormat;

public class Coordonnees {
    private double x;
    private double y;

    public Coordonnees() {
        this.x = 0;
        this.y = 0;
    }

    public Coordonnees(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void deplacerVers(double x, double y) {
        setX(x);
        setY(y);
    }

    public void deplacerDe(double deltaX, double deltaY) {
        setX(this.x + deltaX);
        setY(this.y + deltaY);
    }

    public double angleVers(Coordonnees c) {
        return Math.atan2(c.getY() - this.y, c.getX() - this.x);
    }

    public int distanceVers(Coordonnees c) {
        return (int) Math.round(Math.hypot(c.getX() - this.x, c.getY() - this.y));
    }

    public String toString() {
        return "(" + new DecimalFormat("0.0").format(x) + ", " + new DecimalFormat("0.0").format(y) + ")";
    }
}