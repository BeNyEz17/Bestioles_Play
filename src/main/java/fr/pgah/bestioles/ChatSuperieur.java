package fr.pgah.bestioles;

import java.awt.*;

public class ChatSuperieur extends Bestiole{

    java.util.Random alea = new java.util.Random(System.currentTimeMillis());
    boolean ChatSuperieur = false;

    public ChatSuperieur() {

    }

    public Action getAction(BestioleInfo info) {

        if (info.getEnFace() == Voisin.AUTRE) {
            ChatSuperieur = true;
            return Action.INFECTER;  
        } else if (info.getADroite() == Voisin.AUTRE) {
            return Action.DROITE;
        }else if (info.getADroite() == Voisin.AUTRE) {
            return Action.INFECTER;
        }else if (info.getAGauche() == Voisin.AUTRE) {
            return Action.GAUCHE;
        } else if (info.getAGauche() == Voisin.AUTRE) {
            return Action.INFECTER;
        } else if (info.getEnFace() == Voisin.MEME) {
            return Action.INFECTER;
        } else if (info.getDerriere() == Voisin.MEME) {
            return Action.INFECTER;
        }  else {
            return Action.SAUTER;
        }
    }

    public Color getCouleur() {
        Color couleur = new Color(Math.abs(alea.nextInt()) % 256, Math.abs(alea.nextInt()) % 256,
                Math.abs(alea.nextInt()) % 256);
        return couleur;
    }

    public String toString() {
        if (ChatSuperieur == true) {
            return "UwU";
        } else {
            return "U";
        }
    }

}
