package t3;

public class ShelterTester {
    public static void main(String[] args) {

        // Creating some animals
        Animal animal1 = new Animal("Bella", "Dog");
        Animal animal2 = new Animal("Charlie", "Cat");

        // Creating a shelter
        Shelter shelter = new Shelter();

        // Adding animals to the shelter
        shelter.addAnimal(animal1);
        shelter.addAnimal(animal2);

        // Print the animals in the shelter before adoption
        System.out.println("Animals in shelter before adoption:");
        shelter.printAnimals();

        // Adopting an animal
        shelter.adoptAnimal(animal1);  // Should remove Bella (Dog)

        // Print the animals in the shelter after adoption
        System.out.println("\nAnimals in shelter after adoption:");
        shelter.printAnimals();
    }
}
