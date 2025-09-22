package fr.eseo.pdlo.projet.artiste.vue.formes;

import fr.eseo.pdlo.projet.artiste.modeles.Coordonnees;
import fr.eseo.pdlo.projet.artiste.modeles.formes.Ligne;
import fr.eseo.pdlo.projet.artiste.vue.ihm.PanneauDessin;
import java.awt.Color;


public class VueLigneTest {

    public VueLigneTest() {
        testVueLigne();
    }

    public void testVueLigne() {
        // Création d'une fenêtre avec un PanneauDessin
        PanneauDessin panneauDessin = new PanneauDessin(800, 600, Color.WHITE);

        // Création de plusieurs lignes et ajout de leurs vues au panneau
        Ligne ligne1 = new Ligne(new Coordonnees(50, 50), 100, 50);
        Ligne ligne2 = new Ligne(new Coordonnees(200, 100), 150, 75);
        Ligne ligne3 = new Ligne(new Coordonnees(400, 200), 200, 100);
        VueLigne vueLigne1 = new VueLigne(ligne1);
        VueLigne vueLigne2 = new VueLigne(ligne2);
        VueLigne vueLigne3 = new VueLigne(ligne3);
        panneauDessin.ajouterVueForme(vueLigne1);
        panneauDessin.ajouterVueForme(vueLigne2);
        panneauDessin.ajouterVueForme(vueLigne3);
        // Test ajout en une seule ligne
        panneauDessin.ajouterVueForme(panneauDessin.ajouterVueForme(vueLigne1));


        // Affichage de la fenêtre
        javax.swing.JFrame frame = new javax.swing.JFrame("Test VueLigne");
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.add(panneauDessin);
        frame.pack();
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new VueLigneTest();
    }
}
