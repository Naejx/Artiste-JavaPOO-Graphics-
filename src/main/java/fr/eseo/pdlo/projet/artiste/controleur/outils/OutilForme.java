package fr.eseo.pdlo.projet.artiste.controleur.outils;

import fr.eseo.pdlo.projet.artiste.modeles.Coordonnees;
import fr.eseo.pdlo.projet.artiste.vue.formes.VueForme;
import java.awt.event.MouseEvent;

public abstract class OutilForme extends Outil {

    protected abstract VueForme creerVueForme();

    @Override
    public void mousePressed(MouseEvent event) {
        this.setDebut(new Coordonnees(event.getX(), event.getY()));
    }

    @Override
    public void mouseReleased(MouseEvent event) {
        this.setFin(new Coordonnees(event.getX(), event.getY()));
        if (!this.getDebut().equals(this.getFin())) {
            VueForme vueForme = this.creerVueForme();
            this.getPanneauDessin().ajouterVueForme(vueForme);
            this.getPanneauDessin().repaint();
        }
    }

    @Override
    public void mouseClicked(MouseEvent event) {
        if (event.getClickCount() == 2) {
            this.setDebut(new Coordonnees(event.getX(), event.getY()));
            this.setFin(new Coordonnees(event.getX() + 50, event.getY() + 50)); // Default size
            VueForme vueForme = this.creerVueForme();
            this.getPanneauDessin().ajouterVueForme(vueForme);
            this.getPanneauDessin().repaint();
        }
    }
}
