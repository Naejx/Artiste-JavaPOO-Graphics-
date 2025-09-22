package fr.eseo.pdlo.projet.artiste.vue.formes;

import fr.eseo.pdlo.projet.artiste.modeles.Coordonnees;
import fr.eseo.pdlo.projet.artiste.modeles.formes.Elipse;
import fr.eseo.pdlo.projet.artiste.vue.formes.VueEllipse;
import fr.eseo.pdlo.projet.artiste.vue.ihm.PanneauDessin;

import javax.swing.*;
import java.awt.*;

public class VueEllipseTest {

    public VueEllipseTest() {
        testVueEllipse();
    }

    public void testVueEllipse() {
        PanneauDessin panneauDessin = new PanneauDessin(800, 600, Color.WHITE);

        Elipse ellipse1 = new Elipse(new Coordonnees(50, 50), 100, 50);
        Elipse ellipse2 = new Elipse(new Coordonnees(200, 150), 150, 75);
        Elipse ellipse3 = new Elipse(new Coordonnees(400, 300), 200, 100);

        VueEllipse vueEllipse1 = new VueEllipse(ellipse1);
        VueEllipse vueEllipse2 = new VueEllipse(ellipse2);
        VueEllipse vueEllipse3 = new VueEllipse(ellipse3);

        panneauDessin.ajouterVueForme(vueEllipse1);
        panneauDessin.ajouterVueForme(vueEllipse2);
        panneauDessin.ajouterVueForme(vueEllipse3);

        JFrame frame = new JFrame("Test VueEllipse");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panneauDessin);
        frame.pack();
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new VueEllipseTest();
    }
}