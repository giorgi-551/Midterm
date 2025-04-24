# Virtual Animal Shelter Management
### Masterclass in Java
**Giorgi Maisuradze**  
Student at Ilia State University  
giorgi@gmail.com,

## Introduction
The **Virtual Animal Shelter Management (VASM)** system is designed to help animal shelters manage the animals under their care. This system will provide functionalities for storing animal data, tracking animal adoptions, and maintaining shelter inventories. Animal shelters are essential in our society, and an automated system will help streamline the daily operations.

The **VASM** system has been implemented in Java and is scalable to accommodate shelters of all sizes, from small rescue centers to large animal sanctuaries. The system supports the following key features:

1. **Animal Storage** - Storing details of animals currently in the shelter.
2. **Adding Animals** - The ability to add new animals to the shelter.
3. **Removing Animals** - The ability to remove animals, including those who have been adopted.
4. **Printing Shelter Data** - Displaying all animals currently in the shelter.

## Project Structure
The **VASM** system consists of the following key components:

1. **Animal Class** - Represents individual animals in the shelter.
2. **Shelter Class** - Manages the entire shelter’s operations, including animal storage and adoption.
3. **ShelterTester Class** - A testing class to validate our shelter management system.
4. **Adopter Class** - Manages adopter information and interactions with animals in the shelter.
5. **ShelterUtil Class** - Utility functions for managing shelter-related operations (optional, can be extended).

Each of these components works together to form a complete system for managing the shelter’s animals. The core functionality revolves around storing, adding, and removing animals, but can be expanded to include a variety of additional features, such as adoption history, volunteer management, and more.

---

## Class: Animal
The **Animal** class is used to store information about each animal in the shelter. This includes the animal's **name**, **type** (species), **age**, **adopted status**, and a brief **description**.

### Fields:
- **String name** - The name of the animal.
- **String type** - The type or species of the animal (e.g., Dog, Cat, Rabbit).
- **int age** - The age of the animal in years.
- **boolean adopted** - Tracks whether the animal has been adopted or not.
- **String description** - A brief description or history of the animal (optional).

### Methods:
- `getName()`: Returns the name of the animal.
- `setName(String name)`: Sets the name of the animal.
- `getType()`: Returns the type of the animal.
- `setType(String type)`: Sets the type of the animal.
- `getAge()`: Returns the age of the animal.
- `setAge(int age)`: Sets the age of the animal.
- `isAdopted()`: Returns true if the animal has been adopted, false otherwise.
- `adopt()`: Marks the animal as adopted.
- `toString()`: Returns a string representation of the animal.

### Code Example:  
```java
public class Animal {
    private String name;
    private String type;
    private int age;
    private boolean adopted;
    private String description;

    public Animal(String name, String type, int age, String description) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.adopted = false;
        this.description = description;
    }

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

    public boolean isAdopted() {
        return adopted;
    }

    public void adopt() {
        this.adopted = true;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Type: " + type + ", Age: " + age + " years, Description: " + description + (adopted ? " (Adopted)" : " (Available)");
    }
}
