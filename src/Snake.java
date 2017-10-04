
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
public class Snake extends Animal implements IAnimalFeed {

    //private
    private static final int SNAKE_PELLETS = 20; //instansvariabel

    Snake() {
    }

    public Snake(String animal, String name, double age, String gender, double weight) {
        super(animal, name, age, gender, weight);
    }

    //polymorfism -  I Java när ett objekt kan anta många former vid körtid
    @Override //Dynamisk bindning
    public void food() { 
        String s = "";
        s += SNAKE_PELLETS + "gram ormpellets";

        JOptionPane.showMessageDialog(null, getAnimal() + "en " + getName() + " ska ha " + s);
    }

}
