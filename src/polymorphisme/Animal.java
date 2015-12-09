
package polymorphisme;

/**
 *
 * @author Maxime
 */
public abstract class Animal {

    /**
     * Nom de l'animal.
     */
    private String nom;

    /**
     * Construit un animal à partir de son nom.
     * 
     * @param nom String
     */
    public Animal(String nom) {
        this.nom = nom;
    }
    
    // Méthode abstraite
    public abstract void crier();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Animal{" + "nom=" + nom + '}';
    }
    
    
}
