package fr.eseo.pdlo.projet.artiste.verification;
import fr.eseo.pdlo.projet.artiste.modeles.Coordonnees;
import fr.eseo.pdlo.projet.artiste.modeles.formes.Cercle;

public class CercleTest {
    public static void main(String[] args) {
        Cercle cercle1 = new Cercle();
        Cercle cercle2 = new Cercle(new Coordonnees(10, 0), 20);
        System.out.println(cercle1);
        System.out.println(cercle2);
    }
}
