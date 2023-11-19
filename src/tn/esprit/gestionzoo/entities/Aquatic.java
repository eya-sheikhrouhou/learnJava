package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal implements Carnivore<Food>{

    protected String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public Aquatic(String habitat) {
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Habitat: " + habitat;
    }
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    //prositt 6
    public boolean equals(Aquatic obj) {
        if (this== obj) {
            return true;
        }
        if (obj.name == this.name && obj.age== this.age && obj.habitat == this.habitat) {
            return true;

        }
        return false;
        

    }


    @Override
    public void eatMeat(Food food) {
        if (food == Food.MEAT || food == Food.BOTH) {
            System.out.println("Aquatic is eating meat");
        } else {
            System.out.println("Aquatic does not eat meat");
        }
    }
}

