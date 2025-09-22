package fr.eseo.pdlo.projet.artiste.vue.formes;

import fr.eseo.pdlo.projet.artiste.modeles.formes.Cercle;
import fr.eseo.pdlo.projet.artiste.modeles.Coordonnees;
import fr.eseo.pdlo.projet.artiste.vue.ihm.PanneauDessin;
import javax.swing.JFrame;
import java.awt.Color;

public class VueCercleTest {

    public VueCercleTest() {
        testVueCercle();
    }

    public void testVueCercle() {
        PanneauDessin panneauDessin = new PanneauDessin(800, 600, Color.WHITE);

        Cercle cercle1 = new Cercle(new Coordonnees(100, 100), 50);
        Cercle cercle2 = new Cercle(new Coordonnees(300, 200), 75);
        Cercle cercle3 = new Cercle(new Coordonnees(500, 400), 100);

        VueCercle vueCercle1 = new VueCercle(cercle1);
        VueCercle vueCercle2 = new VueCercle(cercle2);
        VueCercle vueCercle3 = new VueCercle(cercle3);

        panneauDessin.ajouterVueForme(vueCercle1);
        panneauDessin.ajouterVueForme(vueCercle2);
        panneauDessin.ajouterVueForme(vueCercle3);

        JFrame frame = new JFrame("Test VueCercle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panneauDessin);
        frame.pack();
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new VueCercleTest();
    }
}

