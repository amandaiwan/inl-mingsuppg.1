/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amanda
 */
abstract class Animal {
    
    protected String animal; // ex. Hund
    protected String name; // ex. Lola
    protected double age;
    protected String gender;
    protected double weight;
    protected String food;
    
    
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
    
    public String getFood(){
        return food;
    }
    
    
    
    public void setAnimal(String animal){
        this.animal = animal;
    }
    
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
    
    public void setWeight(double weight){
        this.weight = weight;
    }

    public void setFood(String food){
        this.food = food;
    }
    
    
        
}