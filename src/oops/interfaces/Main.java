package oops.interfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Herbivore> herbivoreList = List.of(
                new Human(),
                new Dog()
        );

        for ( Herbivore herbivore : herbivoreList) {
            herbivore.eatPlant();
        }
    }
}
