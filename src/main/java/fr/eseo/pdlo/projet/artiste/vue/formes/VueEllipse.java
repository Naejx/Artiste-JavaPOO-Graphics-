package fr.eseo.pdlo.projet.artiste.vue.formes;

import fr.eseo.pdlo.projet.artiste.modeles.formes.Elipse;
import java.awt.Graphics2D;

public class VueEllipse extends VueForme {

    public VueEllipse(Elipse ellipse) {
        super(ellipse);
    }

    @Override
    public void affiche(Graphics2D g2d) {
        Elipse ellipse = (Elipse) this.getForme();
        g2d.drawOval((int) ellipse.getPosition().getX(), (int) ellipse.getPosition().getY(),
                     (int) ellipse.getLargeur(), (int) ellipse.getHauteur());
    }
}
