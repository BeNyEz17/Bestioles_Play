package fr.pgah.bestioles;

import java.awt.*;

public class Ours extends Bestiole {

    boolean polaire;
    boolean slash = true;

    public Ours(boolean polaire) {
        this.polaire = polaire;
    }

    public Action getAction(BestioleInfo info) {

        if (info.getEnFace() == Voisin.AUTRE) {
            return Action.INFECTER;

        } else if (info.getEnFace() == Voisin.RIEN) {
            return Action.SAUTER;

        } else {
            return Action.GAUCHE;
        }
    }

    public Color getCouleur() {
        if (this.polaire == false) {
            return Color.BLACK;
        } else {
            return Color.WHITE;
        }
    }

    public String toString() {
        if (slash == true) {
            slash = false;
            return "/";
        } else {
            slash = true;
            return "\\";
        }
    }

}
