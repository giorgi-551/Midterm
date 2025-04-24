package t3;

import java.util.ArrayList;
import java.util.List;

public class Shelter {

    private List<Animal> animals; // List of animals in the shelter

    // Constructor
    public Shelter() {
        this.animals = new ArrayList<>();
    }

    // Method to add an animal to the shelter
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    // Method to remove an animal from the shelter
    public boolean removeAnimal(Animal animal) {
        return animals.remove(animal);
    }

    // Method to print the list of all animals in the shelter
    public void printAnimals() {
        if (animals.isEmpty()) {
            System.out.println("No animals in the shelter.");
        } else {
            for (Animal animal : animals) {
                System.out.println(animal.getName() + " (" + animal.getSpecies() + ")");
            }
        }
    }

    /*
     * NEW FEATURE IMPLEMENTATION: Animal Adoption
     * This method allows the shelter to adopt out an animal. The animal is removed
     * from the shelter's list once it is adopted.
     *
     * Adoption success is based on whether the animal exists in the shelter.
     * The method returns true if adoption is successful and false if the animal
     * is not found.
     */
    public boolean adoptAnimal(Animal animal) {
        // Try to remove the animal from the shelter (adoption)
        boolean isAdopted = animals.remove(animal);

        // Return whether adoption was successful
        if (isAdopted) {
            System.out.println(animal.getName() + " has been successfully adopted!");
        } else {
            System.out.println("Animal not found in the shelter.");
        }
        return isAdopted;
    }
}
