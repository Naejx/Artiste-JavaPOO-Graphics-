package fr.eseo.pdlo.projet.artiste.vue.ihm;

public class PanneauDessinTest {
    void testConstructeur() {
        PanneauDessin panneau1 = new PanneauDessin();
    }
    void testConstructeurParametres() {
        PanneauDessin panneau2 = new PanneauDessin(1024, 768, java.awt.Color.LIGHT_GRAY);
    }

    public static void main(String[] args) {
        PanneauDessinTest test = new PanneauDessinTest();
        test.testConstructeur();
        test.testConstructeurParametres();
    }
}
