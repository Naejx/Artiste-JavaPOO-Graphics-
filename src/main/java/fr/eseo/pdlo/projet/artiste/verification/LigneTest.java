package fr.eseo.pdlo.projet.artiste.verification;
import fr.eseo.pdlo.projet.artiste.modeles.formes.Ligne;
import fr.eseo.pdlo.projet.artiste.modeles.Coordonnees;

public class LigneTest {
    public static void main(String[] args) {
        Ligne ligne1 = new Ligne();
        System.out.println(ligne1);
    

        Ligne ligne2 = new Ligne(new Coordonnees(5, 5));
        System.out.println(ligne2);

        Ligne ligne3 = new Ligne(new Coordonnees(2, 3), 15, 10);
        System.out.println(ligne3);

        System.out.println("Point1 de ligne3: " + ligne3.getPoint1());
        System.out.println("Point2 de ligne3: " + ligne3.getPoint2());

        ligne3.setPoint1(new Coordonnees(0, 0));
        ligne3.setPoint2(new Coordonnees(20, 20));
        System.out.println("Après modification, ligne3: " + ligne3);

        System.out.println("Surface de ligne3: " + ligne3.getSurface());
        System.out.println("Périmètre de ligne3: " + ligne3.getPerimetre());
    }
}