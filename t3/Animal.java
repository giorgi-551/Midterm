package t3;

public class Animal {

    private String name;  // The name of the animal
    private String species;  // The species of the animal

    // Constructor to initialize an Animal object
    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    // Getter for the name
    public String getName() {
        return name;
    }

    // Setter for the name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for the species
    public String getSpecies() {
        return species;
    }

    // Setter for the species
    public void setSpecies(String species) {
        this.species = species;
    }
}
