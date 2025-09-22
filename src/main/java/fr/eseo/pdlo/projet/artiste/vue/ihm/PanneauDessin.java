package fr.eseo.pdlo.projet.artiste.vue.ihm;
import fr.eseo.pdlo.projet.artiste.vue.formes.VueForme;
import java.util.ArrayList;
import java.util.List;
public class PanneauDessin extends javax.swing.JPanel {
    int LARGEUR_PAR_DEFAUT = 800;
    int HAUTEUR_PAR_DEFAUT = 600;
    java.awt.Color COULEUR_FOND_PAR_DEFAUT = java.awt.Color.WHITE;
    VueForme forme;
    private final List<VueForme> vueFormes;

    public PanneauDessin() {
        javax.swing.JFrame frame = new javax.swing.JFrame("Panneau de Dessin");
        frame.setSize(LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT);
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        this.vueFormes = new ArrayList<>();
    }

    public PanneauDessin(int largeur, int hauteur, java.awt.Color couleurFond) {
        this.LARGEUR_PAR_DEFAUT = largeur;
        this.HAUTEUR_PAR_DEFAUT = hauteur;
        this.COULEUR_FOND_PAR_DEFAUT = couleurFond;
        javax.swing.JFrame frame = new javax.swing.JFrame("Panneau de Dessin");
        frame.setSize(LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT);
        frame.getContentPane().setBackground(COULEUR_FOND_PAR_DEFAUT);
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        this.vueFormes = new ArrayList<>();
    }

    void getVueForme() {
        this.forme = forme;
    }

    public List<VueForme> getVueFormes() {
        return this.vueFormes;
    }

    public VueForme ajouterVueForme(VueForme vueForme) {
        this.vueFormes.add(vueForme);
        return vueForme;
    }

    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        java.awt.Graphics2D g2D = (java.awt.Graphics2D) g.create();

        for (VueForme vueForme : this.vueFormes) {
            vueForme.affiche(g2D);
        }

        g2D.dispose();
    }
}
