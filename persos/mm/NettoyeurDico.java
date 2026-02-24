import java.io.*;
import java.nio.file.*;
import java.text.Normalizer;
import java.util.*;
import java.util.regex.Pattern;

public class NettoyeurDico {
    public static void main(String[] args) {
        String fichierEntree = "brut.txt"; // Remplace par le vrai nom
        String fichierSortie = "mots_jeu.txt";

        // Regex pour ne garder que les lettres A-Z (pas de tirets, pas d'espaces)
        Pattern alphabetique = Pattern.compile("^[a-zA-Z]+$");

        try {
            List<String> lignes = Files.readAllLines(Paths.get(fichierEntree));
            Set<String> motsValides = new TreeSet<>(); // TreeSet pour trier et supprimer les doublons

            for (String mot : lignes) {
                // 1. Enlever les accents et mettre en majuscules
                String propre = normaliser(mot);

                // 2. Appliquer les filtres
                if (propre.length() >= 5 && propre.length() <= 8) { // Longueur entre 5 et 8
                    if (alphabetique.matcher(propre).matches()) {   // Pas de caractères spéciaux ou espaces
                        motsValides.add(propre);
                    }
                }
            }

            Files.write(Paths.get(fichierSortie), motsValides);
            System.out.println("Nettoyage terminé ! Mots conservés : " + motsValides.size());

        } catch (IOException e) {
            System.err.println("Erreur de lecture/écriture : " + e.getMessage());
        }
    }

    private static String normaliser(String s) {
        String n = Normalizer.normalize(s, Normalizer.Form.NFD);
        n = n.replaceAll("[^\\p{ASCII}]", ""); // Supprime les accents
        return n.toUpperCase().trim();
    }
}