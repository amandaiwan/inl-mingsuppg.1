
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

    Animal d1 = new Dog("Hund", "Sixten", 4, "Hane", 5000);  // Här refererar jag till ett objekt via objektets superklasser
    Animal d2 = new Dog("Hund", "Dogge", 15, "Hane", 10000); //Samma anrop kan ge olika resultat beroende på objektets typ.
    Animal c1 = new Cat("Katt", "Venus", 7, "Hona", 5000); 
    Animal c2 = new Cat("Katt", "Ove", 7, "Hane", 3000); //tilldelning
    Animal s1 = new Snake("Orm", "Hypno", 8, "Hane", 1000);
    
    
    
    
      public List<IAnimalFeed> getAllAnimalFeed() { //lägget till metoden getAllAnimalFeed()

        List<IAnimalFeed> allAnimalFeed = new ArrayList<>(); //Skapar en lista som ska innehålla:
        allAnimalFeed.add((IAnimalFeed) d1);
        allAnimalFeed.add((IAnimalFeed) d2);
        allAnimalFeed.add((IAnimalFeed) c1);
        allAnimalFeed.add((IAnimalFeed) c2);
        allAnimalFeed.add((IAnimalFeed) s1);
 

        return allAnimalFeed;
        
    }


    
}
