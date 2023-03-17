package fr.pgah.bestioles;

import java.awt.*;

public class ChatNinja extends Bestiole {

    java.util.Random alea = new java.util.Random(System.currentTimeMillis());
    boolean CHAT = false;

    public ChatNinja() {

    }

    public Action getAction(BestioleInfo info) {

        if (info.getEnFace() == Voisin.AUTRE) {
            CHAT = true;
            return Action.INFECTER;
        } else if (info.getADroite() == Voisin.AUTRE) {
            return Action.DROITE;
        } else if (info.getAGauche() == Voisin.AUTRE) {
            return Action.GAUCHE;
        } else {
            return Action.SAUTER;
        }
    }

    public Color getCouleur() {
        Color couleur = new Color(Math.abs(alea.nextInt()) % 256, Math.abs(alea.nextInt()) % 256,
                Math.abs(alea.nextInt()) % 256);
        return couleur;
    }

    public String toString() {
        if (CHAT == true) {
            return "x";
        } else {
            return "y";
        }
    }

}
