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

    protected double dogFeed;

    Dog() {
    }

    Dog(String animal, String name, double age, String gender, double weight) {
        super(animal, name, age, gender, weight);

    }

    @Override
    public String getFood() {
        dogFeed = weight / 100;
        String s = "";
        s += (int) dogFeed + "g hundfoder";

        return s;

    }

}
