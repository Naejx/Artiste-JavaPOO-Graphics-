package fr.eseo.pdlo.projet.artiste.modeles.formes;

import fr.eseo.pdlo.projet.artiste.modeles.Coordonnees;
import java.util.ArrayList;
import java.util.List;

public class Trace {
    double length;
    Coordonnees Coordonnees; // First point of the trace
    private List<Coordonnees> points; // All points in the trace

    public Trace() {
        this.length = 0;
        this.points = new ArrayList<>();
    }

    public Trace(Coordonnees Coordonnees) {
        this.Coordonnees = Coordonnees;
        this.length = 0;
        this.points = new ArrayList<>();
        if (Coordonnees != null) {
            this.points.add(Coordonnees);
        }
    }

    public Trace(Coordonnees Coordonnees, double length) {
        this.Coordonnees = Coordonnees;
        this.length = length;
        this.points = new ArrayList<>();
        if (Coordonnees != null) {
            this.points.add(Coordonnees);
        }
    }

    // Add a point to the trace
    public void addPoint(Coordonnees point) {
        if (point != null) {
            points.add(point);
            // If this is the first point, set it as Coordonnees
            if (Coordonnees == null && !points.isEmpty()) {
                Coordonnees = points.get(0);
            }
            // Recalculate length
            calculateLength();
        }
    }

    // Get the first point of the trace
    public Coordonnees getFirstPoint() {
        return Coordonnees;
    }

    // Get all points in the trace
    public List<Coordonnees> getPoints() {
        return new ArrayList<>(points);
    }

    // Calculate the total length of all line segments
    private void calculateLength() {
        if (points.size() < 2) {
            length = 0;
            return;
        }

        double totalLength = 0;
        for (int i = 1; i < points.size(); i++) {
            totalLength += points.get(i - 1).distanceVers(points.get(i));
        }
        length = totalLength;
    }

    public double aire() {
        return 0;
    }

    public double perimeter() {
        return length;
    }
}
