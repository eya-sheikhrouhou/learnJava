package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.entities.Carnivore;
import tn.esprit.gestionzoo.entities.Herbivore;

public interface Omnivore<T> extends Carnivore<T>, Herbivore<T> {
    void eatPlantAndMeat(T food);


}
