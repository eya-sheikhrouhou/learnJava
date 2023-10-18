package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{
     private float swimmingDepth;
    public Penguin(String habitat,float swimmingDepth) {
        super(habitat);
        this.swimmingDepth=swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString() + ", Swimming Depth: " + swimmingDepth;
    }


    public void swim() {
        System.out.println("This penguin is swimming.");
    }

}
