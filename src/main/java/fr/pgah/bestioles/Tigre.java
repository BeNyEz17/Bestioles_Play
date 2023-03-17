package fr.pgah.bestioles;

import java.awt.*;
import java.util.Random;

public class Tigre extends Bestiole {

    int couleur;
    Random random = new Random();
    int compteur = 0;

    public Tigre() {

        couleur = random.nextInt(3);
        getCouleur();
    }

    public Action getAction(BestioleInfo info) {

        if (info.getEnFace() == Voisin.AUTRE) {
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
        compteur += 1;
        if (compteur == 3) {
            couleur = random.nextInt(3);
            compteur = 0;
        }
        if (couleur == 1) {
            return (Color.RED);
        } else if (couleur == 2) {
            return (Color.BLUE);
        } else {
            return (Color.GREEN);
        }

    }

    public String toString() {
        return "TGR";
    }

}
