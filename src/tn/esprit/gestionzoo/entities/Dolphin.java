package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    private float swimmingSpeed;
    public Dolphin(String habitat,float swimmingSpeed) {
        super(habitat);
        this.swimmingSpeed=swimmingSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + ", Swimming Speed: " + swimmingSpeed;
    }

    public void swim() {
        System.out.println("This dolphin is swimming.");
    }




}
