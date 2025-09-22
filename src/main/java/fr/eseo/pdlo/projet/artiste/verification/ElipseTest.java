package fr.eseo.pdlo.projet.artiste.verification;
import fr.eseo.pdlo.projet.artiste.modeles.Coordonnees;
import fr.eseo.pdlo.projet.artiste.modeles.formes.Elipse;

public class ElipseTest {
    public static void main(String[] args) {
        Elipse elipse1 = new Elipse();
        Elipse elipse2 = new Elipse(new Coordonnees(0, 0), 20, 10);
        System.out.println(elipse1);
        System.out.println(elipse2);
    }

}
