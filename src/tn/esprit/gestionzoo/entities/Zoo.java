package tn.esprit.gestionzoo.entities;

public  class Zoo {
private  Aquatic[] tabaquatic=new Aquatic[10];
     private Animal[] animals;
     private String name, city;
     private static int nbrCages;

    private int nbrAnimals;



    public Zoo(String name, String city, int nbrCages, Animal[] animals) {
        this.animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        Zoo.nbrCages = nbrCages;
    }

      public int getNbrAnimals() {
          return nbrAnimals;
      }

      public Animal[] getAnimals() {
         return animals;
     }
     /*public String getname() {
         if (name != null && !name.isEmpty()) {
             return null;
         }
     }*/
     public String getcity()
     {
         return city;
     }
     public int getNbrCages()
     {
         return nbrCages;
     }

      public void setAnimals(Animal[] animals) {
          this.animals = animals;
      }

      public void setCity(String city) {
          this.city = city;
      }

      public void setName(String name) {
          this.name = name;
      }

      public void setNbrAnimals(int nbrAnimals) {
          this.nbrAnimals = nbrAnimals;
      }

      public void setNbrCages(int nbrCages) {
          Zoo.nbrCages = nbrCages;
      }

      void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages/Animals: " + nbrCages);
    }

    public boolean addAnimal(Animal animal) {
        if  (this.isZooFull()){
            return false;}
        if (nbrAnimals == nbrCages)
            return false;
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
            animals[nbrAnimals] = null;
            this.nbrAnimals--;
        }
        return true;
    }

    void displayAnimals() {
        System.out.println("Liste des animaux de " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.name == animals[i].name)
                return i;
        }
        return index;
    }


    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages/Animals: " + nbrCages;
    }



    public  boolean isZooFull()
    {
        return nbrAnimals == nbrCages || nbrAnimals >= nbrCages;//zoo est full
    }

    Zoo comparerZoo(Zoo z1, Zoo z2)
    {
        if (!z1.isZooFull() && !z2.isZooFull()) {
            if (z1.animals.length > z2.animals.length)
                return z1;


        }
        return z2;
    }
//prosit 6
  public void addAquaticAnimal(Aquatic aquatic) {
      for (int i = 0; i < 10; i++)
      {
          if (tabaquatic[i] == null)
              tabaquatic[i] = aquatic;
          break;

      }
  }
  public void afficherSwim() {
      for (int i = 0; i < 10; i++) {
          tabaquatic[i].swim();
      }
  }

  public float maxPenguinSwimmingDepth()
  {


      float maxDepth = 0;
      for (int i = 0; i < 10; i++) {
          if(tabaquatic[i] instanceof Penguin) {
              if (((Penguin)tabaquatic[i]).getSwimmingDepth() > maxDepth) {
                  maxDepth = ((Penguin)tabaquatic[i]).getSwimmingDepth();
              }
          }
      }

      return maxDepth;
  }

  public void displayNumberOfAquaticsByType()
  {   int nbPenguin=0;

      int nbDolphin=0;
      for (int i = 0; i < 10; i++) {
          if(tabaquatic[i] instanceof Penguin)
          { nbPenguin=nbPenguin+1;


              } else if (tabaquatic[i] instanceof Dolphin) {
              nbDolphin=nbDolphin+1;


          }

      }

      System.out.println("le nobre de dolphin est "+nbDolphin+  "  et le nombre de Penguin est "+nbPenguin);
      }



  }



