
package polymorphisme;

/**
 *
 * @author Maxime
 */
public class Chat extends Animal {

    public Chat(String nom) {
        super(nom);
    }

    @Override
    public void crier() {
        System.out.print(this);
        System.out.println(" --> MIAOU");
    }
    
}
