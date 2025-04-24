# Virtual Animal Shelter Management System  
## Masterclass in Java  
### Giorgi Maisuradze  
Doctor of Informatics, Associate Professor at Ilia State University  
giorgi@gmail.com 

Create Virtual Animal Shelter Management System (VASMS) in Java. VASMS is widely used software. It can be any complexity. Our example is a basic one, which has the following features:
1. Storage for animals
2. Ability to add an animal to the shelter
3. Ability to remove an animal from the shelter
4. Ability to print the shelter animal information on the console

### VASMS Structure
We will need the following classes for the software:
1. **Animal** – the animal itself.
2. **VASMS** – the animal shelter management system.
3. **ShelterTester** – the tester class. This class will be used to test our management system.

---

### Class Animal

The `Animal` class should have several fields, including name and species. This class can be implemented in the following way:

```java
package shelter;

public class Animal {
    private String name, species;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return species + ": " + name;
    }
}
