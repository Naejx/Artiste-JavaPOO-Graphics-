package fr.eseo.pdlo.projet.artiste.vue.formes;

import fr.eseo.pdlo.projet.artiste.modeles.formes.Cercle;
import java.awt.Graphics2D;

public class VueCercle extends VueForme {

    public VueCercle(Cercle cercle) {
        super(cercle);
    }

    @Override
    public void affiche(Graphics2D g2d) {
        Cercle cercle = (Cercle) this.getForme();
        g2d.drawOval((int) cercle.getPosition().getX(), (int) cercle.getPosition().getY(),
                     (int) cercle.getLargeur(), (int) cercle.getHauteur());
    }
}
