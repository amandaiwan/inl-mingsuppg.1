
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
public class Dog extends Animal implements IAnimalFeed {

    //private
    private double dogFeed; //en instansvariabel

    Dog() {
    }

    public Dog(String animal, String name, double age, String gender, double weight) {
        super(animal, name, age, gender, weight);

    }

    //polymorfism -  Om en metodanrop sker ges olika resultat beroende på objektets typ.
    @Override //Dynamisk bindning
    public void food() { 
        dogFeed = getWeight() / 100;
        String s = "";
        s += (int) dogFeed + "gram hundfoder";

        JOptionPane.showMessageDialog(null, getAnimal() + "en " + getName() + " ska ha " + s);

    }

}
