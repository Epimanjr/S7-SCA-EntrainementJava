
package polymorphisme;

import java.util.ArrayList;

/**
 *
 * @author Maxime
 */
public class Main {
    
    public static void main(String[] args) {
        // Création d'une liste Animal
        ArrayList<Animal> listeAnimaux = new ArrayList<>();
        listeAnimaux.add(new Chien("Albert"));
        listeAnimaux.add(new Chat("Biloute"));
        listeAnimaux.add(new Chien("Marine"));
        listeAnimaux.add(new Chien("Maxime"));
        // Exemple de polyporphisme
        for(Animal a : listeAnimaux) {
            // On fait crier l'animal
            a.crier();
        }
    }
}
