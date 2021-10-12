/**
 * Animal Blueprint.
 *
 * @ErykGrabkwoski
 * @V1.0
 */

// Public Class Animal
public class Animal {

    // Attributes.
    private String animalID; // Animal ID
    private String animalType; // Animal Type
    private String ownerName; // Owner Name
    private String animalName; // Animal Name
    private int animalAge; // Animal Age (INT)
    private boolean vaccinations = false; // Vaccinations (BOOLEAN)
    private int yearRegistered; // Year Registered (INT)
    private static int lenTimeClient; // Length Of Time With Client (INT)

    // Private Static because it can be changed all the time.

    // The Methods (Set & Get Methods)

    // String, String, String, String, Int, Int
    public Animal(String animalIDIn, String animalTypeIn, String animalNameIn, String ownerNameIn, int animalAgeIn, int yearRegisteredIn) {
        animalID = animalIDIn;
        animalType = animalTypeIn;
        animalName = animalNameIn;
        ownerName = ownerNameIn;
        animalAge = animalAgeIn;
        vaccinations = false; // Assume They Are False Until Changed.
        yearRegistered = yearRegisteredIn;
        lenTimeClient = 0;
    }

    // *SetMethods* (Mutator)

    // setAnimalID
    public void setAnimalID(String animalIDIn) {
        animalID = animalIDIn;
    }

    // setAnimalType
    public void setAnimalType(String animalTypeIn) {
        animalType = animalTypeIn;
    }

    // setOwnerName
    public void setOwnerName(String ownerNameIn) {
        ownerName = ownerNameIn;
    }

    // setAnimalName
    public void setAnimalName(String animalNameIn) {
        animalName = animalNameIn;
    }

    // setAnimalAge
    public void setAnimalAge(int animalAgeIn) {
        animalAge = animalAgeIn;
    }

    // setVaccinations
    public void setVaccinations(boolean vaccinationsIn) {
        vaccinations = vaccinationsIn;
    }

    // setYearRegistered
    public void setYearRegistered(int yearRegisteredIn) {
        yearRegistered = yearRegisteredIn;
    }

    // setLenTimeClient
    public static void setLenTimeClient(int lenTimeClientIn) {
        lenTimeClient += lenTimeClientIn; // Static and can be changed.
    }

    // *GetMethods* (Accessor)

    // getAnimalID
    public String getAnimalID() {
        return animalID;
    }

    // getAnimalType
    public String getAnimalType() {
        return animalType;
    }

    // getOwnerName
    public String getOwnerName() {
        return ownerName;
    }

    // getAnimalName
    public String getAnimalName() {
        return animalName;
    }

    // getAnimalAge
    public int getAnimalAge() {
        return animalAge;
    }

    // getVaccinations
    public boolean getVaccinations() {
        return vaccinations;
    }

    // getYearRegistered
    public int getYearRegistered() {
        return yearRegistered;
    }

    // GetLenTimeClient
    public int getLenTimeClient() {
        return lenTimeClient;
    }
}