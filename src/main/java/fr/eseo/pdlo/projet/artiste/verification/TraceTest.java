package fr.eseo.pdlo.projet.artiste.verification;

import fr.eseo.pdlo.projet.artiste.modeles.Coordonnees;
import fr.eseo.pdlo.projet.artiste.modeles.formes.Trace;

public class TraceTest {
    public static void main(String[] args) {
        Trace trace = new Trace();
        System.out.println("First point: " + trace.getFirstPoint());
        System.out.println("Points: " + trace.getPoints());

        trace.addPoint(new Coordonnees(0, 0));
        trace.addPoint(new Coordonnees(3, 4));
        trace.addPoint(new Coordonnees(6, 8));

        System.out.println("First point after adding points: " + trace.getFirstPoint());
        System.out.println("Points after adding points: " + trace.getPoints());

        System.out.println(trace.perimeter());


    }
}
