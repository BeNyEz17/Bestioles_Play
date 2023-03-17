// Bestioles - pgah
// BestiolesMain est la méthode principale de la simulation.
// Vous pouvez modifier le nombre de bestioles ou encore la longueur/largeur
// de la Frame (valeurs passées au constructeur de BestioleFrame)

package fr.pgah.bestioles;

public class BestiolesMain {

    public static int nb = 100; 
    public static void main(String[] args) {
        BestioleFrame frame = new BestioleFrame(400, 400);

        // décommentez chacune de ces lignes au fur et à mesure
        // que les classes sont complétées
        frame.add(nb, Ours.class);
        frame.add(nb, Tigre.class);
        frame.add(nb, TigreBlanc.class);
        frame.add(nb, Yeti.class);
        frame.add(nb, ChatNinja.class);
        frame.add(nb, ChatSuperieur.class);
        frame.add(nb, Crocodile.class);
        frame.add(nb, Plancton.class);

        frame.start();
    }
}