package fr.eseo.pdlo.projet.artiste.verification;
import fr.eseo.pdlo.projet.artiste.modeles.Coordonnees;

public class CoordonneesTest {

    public static void main(String[] args) {
        Coordonnees coord1 = new Coordonnees();
        System.out.println("Coord1 (default): " + coord1);

        Coordonnees coord2 = new Coordonnees(3, 4);
        System.out.println("Coord2 (3,4): " + coord2);

        coord1.deplacerVers(1, 2);
        System.out.println("Coord1 après deplacerVers(1,2): " + coord1);

        coord2.deplacerDe(2, -1);
        System.out.println("Coord2 après deplacerDe(2,-1): " + coord2);

        double angle = coord1.angleVers(coord2);
        System.out.println("Angle de Coord1 à Coord2: " + angle);

        int distance = coord1.distanceVers(coord2);
        System.out.println("Distance de Coord1 à Coord2: " + distance);

        String coord1Str = coord1.toString();
        System.out.println("Coord1 en String: " + coord1Str);
    }
}