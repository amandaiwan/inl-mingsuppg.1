
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amanda
 */
public class BackendAnimal {

    //Polymorfism - I Java när ett objekt kan anta många former vid körtid

    // Här refererar jag till ett objekt via objektets superklasser
    //beroende på objektets typ, anropas olika instansmetoder 
   private final Animal sixten = new Dog("Hund", "Sixten", 4, "Hane", 5000); //superklassen antar formen av dennes subklass
   private final Animal dogge = new Dog("Hund", "Dogge", 15, "Hane", 10000); 
   private final Animal venus = new Cat("Katt", "Venus", 7, "Hona", 5000); 
   private final Animal ove = new Cat("Katt", "Ove", 7, "Hane", 3000); 
   private final Animal hypno = new Snake("Orm", "Hypno", 8, "Hane", 1000);
 
    
      public List<IAnimalFeed> getAllAnimalFeed() { 

        List<IAnimalFeed> allAnimalFeed = new ArrayList<>(); //Skapar en lista som ska innehålla:
        allAnimalFeed.add(sixten);
        allAnimalFeed.add(dogge);
        allAnimalFeed.add(venus);
        allAnimalFeed.add(ove);
        allAnimalFeed.add(hypno);

        return allAnimalFeed;
        
    }


    
}
