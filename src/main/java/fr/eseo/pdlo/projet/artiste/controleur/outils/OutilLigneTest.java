package fr.eseo.pdlo.projet.artiste.controleur.outils;

import fr.eseo.pdlo.projet.artiste.vue.ihm.PanneauDessin;

import javax.swing.JFrame;
import java.awt.Color;

public class OutilLigneTest {

    public OutilLigneTest() {
        testOutilLigne();
    }

    public void testOutilLigne() {
        // Create a window with a PanneauDessin
        PanneauDessin panneauDessin = new PanneauDessin(800, 600, Color.WHITE);

        // Create an instance of OutilLigne
        OutilLigne outilLigne = new OutilLigne();

        // Associate the OutilLigne with the PanneauDessin
        panneauDessin.associerOutil(outilLigne);

        // Display the window
        JFrame frame = new JFrame("Test OutilLigne");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panneauDessin);
        frame.pack();
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new OutilLigneTest();
    }
}
