package fr.pgah.bestioles;

import java.awt.*;

public class TigreBlanc extends Bestiole {

    boolean tgr = false;

    public TigreBlanc() {

    }

    public Action getAction(BestioleInfo info) {

        if (info.getEnFace() == Voisin.AUTRE) {
            tgr = true;
            return Action.INFECTER;
        } else if (info.getEnFace() == Voisin.MUR || info.getAGauche() == Voisin.MUR) {
            return Action.GAUCHE;
        } else if (info.getEnFace() == Voisin.MEME) {
            return Action.DROITE;
        } else {
            return Action.SAUTER;
        }
    }

    public Color getCouleur() {
        return (Color.WHITE);
    }

    public String toString() {
        if (tgr == true) {
            return "TGR";
        } else {
            return "tgr";
        }
    }

}
