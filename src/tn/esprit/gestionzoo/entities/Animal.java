package tn.esprit.gestionzoo.entities;

public class Animal {

    private String family, name;
    private int age;
     private boolean isMammal;

    public Animal() {

    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
public String getFamily(){return family;}
     public String getName(){return name;}
     public boolean getismaamal(){return isMammal;}*

     public int getAge() {
         return age;
     }

     public void setFamily(String family){this.family=family;}
     public void setName(String name){this.name=name;}

     public void setMammal(boolean mammal) {
         isMammal = mammal;
     }

     public void setAge(int age) {
         if (age >= 0)
         this.age = age;
     }

     @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
