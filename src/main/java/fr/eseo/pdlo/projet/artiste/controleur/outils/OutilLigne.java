package fr.eseo.pdlo.projet.artiste.controleur.outils;

import fr.eseo.pdlo.projet.artiste.modeles.Coordonnees;
import fr.eseo.pdlo.projet.artiste.modeles.formes.Ligne;
import fr.eseo.pdlo.projet.artiste.vue.formes.VueForme;
import fr.eseo.pdlo.projet.artiste.vue.formes.VueLigne;

public class OutilLigne extends OutilForme {

    @Override
    protected VueForme creerVueForme() {
        Ligne ligne = new Ligne(this.getDebut(), this.getFin().getX() - this.getDebut().getX(), this.getFin().getY() - this.getDebut().getY());
        return new VueLigne(ligne);
    }
}
