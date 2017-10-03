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
    
    protected double catFeed;
    
    Cat(){}
    
    Cat(String animal, String name, double age, String gender, double weight){
        super(animal, name, age, gender, weight);
        
    }

    @Override
    public String getFood() {
       catFeed = weight/150;
        String s = ""; 
        s += (int)catFeed + "g kattfoder";
        
        return s;
    }
}

   