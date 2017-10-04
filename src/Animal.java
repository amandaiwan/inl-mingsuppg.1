/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amanda
 */
abstract class Animal implements IAnimalFeed{
    
    //En inkapsling och deklarerat Private, så om superklassens data och metoder ska vara åtkomliga behövs getter.
    private String animal; // ex. Hund 
    private String name; 
    private double age;
    private String gender;
    private double weight; //ex. 3000g
    
    
    Animal(){}
    
    Animal(String animal, String name, double age, String gender, double weight){
        this.animal = animal;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;

    }
    
    public String getAnimal(){
        return animal;
    
    }
    
    @Override
    public String getName(){
        return name;
    
    }
    
    public double getAge(){
        return age;
    
    }
    
    public String getGender(){
        return gender;
    
    }
    
    public double getWeight(){
        return weight;
    }
    
    @Override
    public void food(){}
        
}