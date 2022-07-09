package interfaces;

public class Human extends Mammal implements Omnivore{
    @Override
    public void eatAnimal() {
        System.out.println("Human eats animal");
    }

    @Override
    public void eatPlant() {
        System.out.println("Human eats plant");
    }
}
