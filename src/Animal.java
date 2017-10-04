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
    
    //En inkapsling och deklarerat Private, så om superklassens data och metoder ska vara åtkomliga behövs publica getter/setter. 
    //hade man använt en modifierare, kommer man åt variablerna via variabelnamnet
    private String animal; 
    private String name; // ex. Lola 
    private double age;
    private String gender;
    private double weight; //ex. 3000g
    
    
    Animal(){}
    
    Animal(String animal, String name, double age, String gender, double weight){
        this.animal = animal;
        this.name = name; //sätter namn
        this.age = age;
        this.gender = gender;
        this.weight = weight; //sätter vikt

    }
    
    public String getAnimal(){ 
        return animal;
    
    }
    
    @Override
    public String getName(){ //hämtar namnet
        return name;
    
    }
    
    public double getAge(){
        return age;
    
    }
    
    public String getGender(){
        return gender;
    
    }
    
    public double getWeight(){ //hämtar vikt
        return weight;
    }
    
    @Override
    public void food(){}
        
}