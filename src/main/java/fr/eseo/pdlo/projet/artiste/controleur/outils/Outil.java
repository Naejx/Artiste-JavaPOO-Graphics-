package fr.eseo.pdlo.projet.artiste.controleur.outils;

import fr.eseo.pdlo.projet.artiste.modeles.Coordonnees;
import fr.eseo.pdlo.projet.artiste.vue.ihm.PanneauDessin;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public abstract class Outil implements MouseListener, MouseMotionListener {

    private Coordonnees debut;
    private Coordonnees fin;
    private PanneauDessin panneauDessin;

    public Coordonnees getDebut() {
        return debut;
    }

    public Coordonnees getFin() {
        return fin;
    }

    public PanneauDessin getPanneauDessin() {
        return panneauDessin;
    }

    public void setPanneauDessin(PanneauDessin panneau) {
        this.panneauDessin = panneau;
    }

    public void setDebut(Coordonnees debut) {
        this.debut = debut;
    }

    public void setFin(Coordonnees fin) {
        this.fin = fin;
    }

    public void mousePressed(MouseEvent event) {
        this.debut = new Coordonnees(event.getX(), event.getY());
    }

    public void mouseReleased(MouseEvent event) {
        this.fin = new Coordonnees(event.getX(), event.getY());
    }


    public void mouseClicked(MouseEvent event) {
        // Not used for now
    }


    public void mouseDragged(MouseEvent event) {
        // Not used for now
    }


    public void mouseEntered(MouseEvent event) {
        // Not used for now
    }

    public void mouseExited(MouseEvent event) {
        // Not used for now
    }


    public void mouseMoved(MouseEvent event) {
        // Not used for now
    }
}
