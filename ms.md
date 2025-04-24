# Virtual Animal Shelter Management
### Masterclass in Java
**Giorgi Maisuradze**  
Doctor of Informatics, Associate Professor at Ilia State University  
giorgi@gmail.com,

Create Virtual Animal Shelter Management (VASM) in Java. VASM is widely used software in shelters and animal rescue centers. It can be of any complexity. Our example is a basic one, which has the following features:  
1. Storage for animals  
2. Ability to add animals to the shelter  
3. Ability to remove animals from the shelter  
4. Ability to print the shelter animal information on the console  

## VASM Structure
We will need the following classes for the software:  
1. Animal – represents the animal itself.  
2. Shelter – manages the animal shelter.  
3. ShelterTester – the tester class. This class will be used to test our management system.

### Class: Animal
- `String name`  
- `String type`  
- `int age`  

### Class: Shelter  
- `List<Animal> storage`  
- `void addAnimal(Animal animal)`  
- `boolean removeAnimal(Animal animal)`  
- `void printStorage()`  

---

## Class: Animal  
Package: shelter  

The class `Animal` should have several fields, including name, type (species), and age. This class can be implemented in the following way:

```java
public class Animal {
    private String name;
    private String type;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
