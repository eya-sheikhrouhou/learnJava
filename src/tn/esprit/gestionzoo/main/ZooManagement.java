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

        Zoo myZoo = new Zoo("Wildlife Park","Ariana",25,new Animal[25]);
        /*myZoo.setName("Wildlife Park");
        myZoo.setCity("Ariana");
        myZoo.setNbrCages(25);
        myZoo.setAnimals(new Animal[25]);*/


        Animal dog = new Animal("Canine", "Snoopy", 2, true);

        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

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


        //prosit 6
        Aquatic bouri =new Aquatic("String family", "String name", 1, true, "String habitat");
        Aquatic nazali =new Aquatic("String family", "String name", 1, true, "String habitat");
        myZoo.addAquaticAnimal(bouri);
        myZoo.addAquaticAnimal(nazali);
        myZoo.afficherSwim();


    }

}
