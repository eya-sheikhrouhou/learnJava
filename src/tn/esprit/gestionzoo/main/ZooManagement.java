package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        //PROSIT 2
        Animal lion = new Animal("cats","simba",8,true);

       /* lion.setName("Simba"); ;
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);*/

        Zoo myZoo = new Zoo("Wildlife Park","Ariana",1,new Animal[1]);
        /*myZoo.setName("Wildlife Park");
        myZoo.setCity("Ariana");
        myZoo.setNbrCages(25);
        myZoo.setAnimals(new Animal[25]);*/


        Animal dog = new Animal("Canine", "Snoopy", 2, true);

        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        //prosit 7 exception

       // System.out.println(myZoo.addAnimal(lion));
        //System.out.println(myZoo.addAnimal(dog));

        try {
            myZoo.addAnimal(lion);
            System.out.println("Nombre d'animaux : " + myZoo.getNbrAnimals());

            myZoo.addAnimal(dog);
            System.out.println("Nombre d'animaux : " +  myZoo.getNbrAnimals());


        } catch (ZooFullException e) {
            System.err.println("Erreur : " + e.getMessage());
        }catch (InvalidAgeException e) {
            System.err.println("Erreur d'âge : " + e.getMessage());
        }

       // myZoo.displayAnimals();

       // System.out.println(myZoo.searchAnimal(dog));
       // Animal dog2 = new Animal("Canine", "Snoopy", 2, true);
        //System.out.println(myZoo.searchAnimal(dog2));

       // System.out.println(myZoo.removeAnimal(dog));
       // myZoo.displayAnimals();


        //prosit 5
        Aquatic aquaticAnimal = new Aquatic("Fish", "Salmon", 2, false, "Water habitat");

        Dolphin dolphin = new Dolphin("Ocean", 25.5f);
        Penguin penguin = new Penguin("Antarctic", 10.0f);

        System.out.println(aquaticAnimal);
        System.out.println(dolphin);
        System.out.println(penguin);


      /*  //prosit 6
        Aquatic bouri =new Aquatic("String family", "String name", 1, true, "String habitat");
        Aquatic nazali =new Aquatic("String family", "String name", 1, true, "String habitat");
        myZoo.addAquaticAnimal(bouri);
        myZoo.addAquaticAnimal(nazali);
        myZoo.afficherSwim();*/

        ///prosit 8
        // Création d'un objet Aquatic
        Aquatic bouri =new Aquatic("String family", "String name", 1, true, "String habitat");
        System.out.println("Testing Aquatic:");
      bouri.eatMeat(Food.MEAT);  // Teste la méthode eatMeat de Aquatic


      System.out.println("\nTesting Penguin:");
        penguin.eatMeat(Food.PLANT);  // Teste la méthode eatFish de Penguin

        Terrestrial terrestrial = new Terrestrial();
        System.out.println("\nTesting Terrestrial:");
        terrestrial.eatMeat(Food.BOTH);  // Teste la méthode eatMeat de Terrestrial
        terrestrial.eatPlant(Food.PLANT);  // Teste la méthode eatPlant de Terrestrial
        terrestrial.eatPlantAndMeat(Food.BOTH);  // Teste la méthode eat
    }

}
