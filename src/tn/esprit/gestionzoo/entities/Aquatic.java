package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal{

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

}
