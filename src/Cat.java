
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
public class Cat extends Animal implements IAnimalFeed {
    
    //private
    private double catFeed; //instansvariabel
    
    Cat(){} // en tom konstruktor
    
    public Cat(String animal, String name, double age, String gender, double weight){ //en konstruktor med parametrar
        super(animal, name, age, gender, weight);
        
    }
   
    @Override //Dynamisk bindning + polymorfism
    public void food() {  
       catFeed = getWeight() /150;
        String s = ""; 
        s += (int)catFeed + " gram kattfoder";
        
        JOptionPane.showMessageDialog(null, getAnimal() + "en " + getName() + " ska ha " + s);
        
    }
}

   