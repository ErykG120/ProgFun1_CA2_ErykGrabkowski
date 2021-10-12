/**
 * Vet Method Blueprint Class.
 *
 * @ErykGrabkwoski
 * @V1.0
 */

// Public Class Vet
public class Vet {
    // Attributes
    private Animal[] animalList; // Array of animals called animalList.
    private int total; // Integer Total

    // Constuctor that will set size of the array and total to 0
    public Vet(int size) {
        animalList = new Animal[size]; // Set Size Of Array
        total = 0; // Set Total To 0
    }

    // GetTotal Method (Int)
    public int getTotal() // Return Type Int
    {
        return total; // Return Total Numbers Of Animals In System
    }

    // add (Boolean)
    public boolean add(Animal animals) // Return Type Boolean
    {
        // Check isFull Method
        if (!isFull()) {
            animalList[total] = animals; // AnimalList Array + Total (Amount In Array)
            total++; // Increment.
            return true; // Return True.
        }
        return false; // Return False.
    }
    
    // The delete method is extremely buggy, I have zero clue why. Cannot figure it out.
    
    // delete Method (Boolean)
    public boolean delete(String animalIDIn) // Return Type Boolean
    {
        // If Else Statment (Search)
        if (search(animalIDIn) == -999) {
            return false; // Return False. (Nothing Found).
        } else {
            // Simple For Loop (Search)
            for (int i = search(animalIDIn); i <= total - 1; i++) 
            {
                animalList[i] = animalList[i + 1]; // Increment One.
                total--; // Decrement.
            }
        }
        return true; // Return True. 
    }

    // isEmpty Method
    public boolean isEmpty() { // Return Type Boolean
        if (total == 0) { // Simple if statement to make check if it's empty (0)
            return true; // Return True
        } else {
            return false; // Return False
        }
    }

    // isFull Method
    public boolean isFull() { // Return Type Boolean
        if (total == animalList.length) { // Simple if statement to check if it's full (length of array)
            return true; // Return True
        } else {
            return false; // Return False.
        }
    }

    // findOldestAnimal Method
    public Animal findOldestAnimal() { // Return Type Animal Blueprint.
        Animal animals = null; // equal to nothing
        if (!isEmpty()) {
            animals = animalList[0]; // equal to array
            // Simple For Loop. 
            for (int i = 1; i < total; i++) {
                if (animalList[i].getAnimalAge() > animals.getAnimalAge()) {
                    animals = animalList[i];
                }
            }
        }
        return animals;
    }

    // findYoungestAnimal Method
    public Animal findYoungestAnimal() // Return Type Animal Blueprint.
    {
        Animal animals = null; //
        if (!isEmpty()) {
            animals = animalList[0]; //pets is now equal to the array
            //searching through total menu one by one
            for (int i = 1; i < total; i++) {
                //the array has to be younger than pets
                if (animalList[i].getAnimalAge() < animals.getAnimalAge()) {
                    animals = animalList[i]; //connects the two methods together 
                }
            }
        }
        return animals; // Return animals
    }

    // Search Method 
    public int search(String animalIDIn) { // return type int
        // for loop
        for (int i = 0; i < total; i++) {
            // if statement to check if id matches
            if (animalList[i].getAnimalID().equals(animalIDIn)) {
                return i; // return value of array (search method)
            }
        }
        return -999; // Standard Programming Practise.
    }

    // List Method
    public String list() { // Return Type String
        String list = ""; // Empty
        if (!isEmpty()) {
            // for loop
            for (int i = 0; i < total; i++) {
                list = list + "Animal ID: " + animalList[i].getAnimalID() + "\nAnimal Name: " + animalList[i].getAnimalName() + "\nAnimal Type: " + animalList[i].getAnimalType() + "\nAnimal Age : " + animalList[i].getAnimalAge() + "\nOwner Name: " + animalList[i].getOwnerName() + "\nLenght of time client: " + animalList[i].getLenTimeClient() + "\nYear Registered: " + animalList[i].getYearRegistered() + "\nVaccinated?: " + animalList[i].getVaccinations() + "\n\n\n";
            }
        }
        return list; // Output Value.
    }

    public Animal getItem(String animalIdIn) // return type animal
    {
        int data = search(animalIdIn); // Search Method
        // if else statement, -999 (minus)
        if (data == -999) {
            return null; // Return Blank Index.
        }
        return animalList[data]; // Return Array with data information.
    }

    // upDateLenOfTime Method
    public String upDateLenOfTime() { // Return Type String
        Animal.setLenTimeClient(1); // Add +1
        return "All Animal Years In System Are Updated"; // Return 
    }

    // AddDetails Method
    public boolean addDetails(String animalIdIn, boolean isVaccinatedIn) // return type boolean with two values.
    {
        int info = search(animalIdIn); // search method
        // Info == -999 Nothing. Standard Programming Practise. 
        if (info == -999) {
            return false; // Return False
        }
        animalList[info].setVaccinations(isVaccinatedIn); // Array with Info
        return true; // Return True.
    }
}