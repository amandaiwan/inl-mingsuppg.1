
import java.util.List;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amanda
 */
public class AnimalDemo { 
    
    public AnimalDemo() {
        
        BackendAnimal backend = new BackendAnimal(); //skapar en instans av objektet Backend

        List<IAnimalFeed> allAnimalFeed = backend.getAllAnimalFeed(); //hämtar in min lista

        while (true) { 
            
            String s = JOptionPane.showInputDialog("Vilket djur ska få mat?");
            if (s == null || s.equals("")) {
                System.exit(0);
            }
            
            boolean animalHere = false;
            for (IAnimalFeed a : allAnimalFeed) { // för varje objekt i listan, låter man det objektet med h. En lokal variabel
                if (a.getName().equalsIgnoreCase(s)) {
                    a.food(); // Polymorfismen - Samma anrop kan ge olika resultat beroende på objektets typ.
                    animalHere = true;
                }
            }
            if (!animalHere) { //
                JOptionPane.showMessageDialog(null, "Djuret finns inte på detta hotell, försök igen.");
            }
            
        }// avslutar while
        
    }
    
    public static void main(String[] args) {
        
        AnimalDemo a = new AnimalDemo(); ////skapar en instans av objektet 
        
    }
    
}
