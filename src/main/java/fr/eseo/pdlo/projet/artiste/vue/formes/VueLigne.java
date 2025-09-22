package fr.eseo.pdlo.projet.artiste.vue.formes;
import fr.eseo.pdlo.projet.artiste.modeles.formes.Ligne;
public class VueLigne extends VueForme{
    private final Ligne ligne;
    public VueLigne(Ligne ligne) {
        super(ligne);
        this.ligne = ligne;
    }

    public Ligne getLigne() {
        return this.ligne;
    }
    public void affiche(java.awt.Graphics2D g2d) {
        g2d.drawLine((int) ligne.getPosition().getX(), (int) ligne.getPosition().getY(),
                (int) (ligne.getPosition().getX() + ligne.getLargeur()),
                (int) (ligne.getPosition().getY() + ligne.getHauteur()));
    }
}
