
package polymorphisme;

/**
 *
 * @author Maxime
 */
public class Chien extends Animal {
    
    public Chien(String nom) {
        super(nom);
    }

    /**
     * Ceci est une redéfinition, et non une surcharge.
     */
    @Override
    public void crier() {
        System.out.print(this);
        System.out.println(" --> WOUF");
    }
    
}
