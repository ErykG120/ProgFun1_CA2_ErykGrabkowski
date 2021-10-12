/**
 * vetApplication Method Class.
 *
 * @ErykGrabkwoski
 * @V1.0
 */

// Class Name VetApplication
public class vetApplication {
    public static void main(String[] args) {
        int option; // Integer
        System.out.print("Enter the maximum number of animals that can be registed in the system: ");

        int amount = EasyScanner.nextInt(); // Call Easy Scanner
        Vet vetApp = new Vet(amount); // Enable Methods

        // Do While Loop
        do {
            System.out.println();
            System.out.println("Vet System");
            System.out.println("1. Add an Animal");
            System.out.println("2. Remove an Animal");
            System.out.println("3. Check if Vet System is empty");
            System.out.println("4. Check if Vet System is full");
            System.out.println("5. Add Additional Animal Details");
            System.out.println("6. Animal Details");
            System.out.println("7. Update Animal Length of Time in System ");
            System.out.println("8. Exit System");
            System.out.println(); // Blank Space.
            System.out.print("Please enter option [1-8 only]: ");
            option = EasyScanner.nextInt(); // Option Easy Scanner
            System.out.println(); // Blank Space

            // Switch Statement
            switch (option) {
                case 1:
                    option1(vetApp);
                    break; // End Processing
                case 2:
                    option2(vetApp);
                    break; // End Processing
                case 3:
                    option3(vetApp);
                    break; // End Processing
                case 4:
                    option4(vetApp);
                    break; // End Processing
                case 5:
                    option5(vetApp);
                    break; // End Processing
                case 6:
                    option6(vetApp);
                    break; // End Processing
                case 7:
                    option7(vetApp);
                    break; // End Processing
                case 8:
                    System.out.println("Thank you for using the system!");
                    System.exit(0); // Quits Program.
                    break;
                default:
                    System.out.println("Invalid entry, please enter [1 - 8] only!");
                    break;
            }
        } while (option != 8); // I
        System.out.println("Thank you for using the Vet system");
    }

    // Option01
    // Add Animal
    private static void option1(Vet vetAppIn) {
        System.out.print("Enter Animal ID: ");
        String id = EasyScanner.nextString();
        System.out.print("Enter Animal Type: ");
        String type = EasyScanner.nextString();
        System.out.print("Enter Animal Name: ");
        String animalName = EasyScanner.nextString();
        System.out.print("Enter Owner Name: ");
        String ownerName = EasyScanner.nextString();
        System.out.print("Enter Animal Age: ");
        int age = EasyScanner.nextInt(); // Easy Scanner Int.
        // While Loop (Max Age 30) (2021 - 1992 = 30 years old)
        while (age < 0 || age > 30) {
            System.out.print("Please enter a valid age (0 - 30) :");
            age = EasyScanner.nextInt();
        }
        
        System.out.print("Enter year animal registered: ");
        int reg = EasyScanner.nextInt();
        
        while (reg > 2021 || reg < 1991) {
            System.out.print("Please enter a valid year! [2021 - 1991] :");
            reg = EasyScanner.nextInt();
        }
        
        Animal selectedAnimal = new Animal(id, type, animalName, ownerName, age, reg);
        boolean ok = vetAppIn.add(selectedAnimal);
        System.out.println(); // Blank Space
        
        // If Else statement
        if (!ok) {
            System.out.println("Can not add new animal. This system is full");
        } else {
            System.out.println("New Animal Added");
        }
    }

    // Option02
    // Remove An Animal
    private static void option2(Vet vetAppIn) {
        System.out.print("Enter Animal ID to remove: ");
        String number = EasyScanner.nextString();
        boolean ok = vetAppIn.delete(number);
        
        if (!ok) {
            System.out.println("Cannot delete animal from system - no such animal with id " + number + " exist in the system");
        } else {
            System.out.println("Animal with ID number " + number + " is removed from the system");
        }
    }

    // Option03
    // Check If System Is Empty
    private static void option3(Vet vetAppIn) {
        if (vetAppIn.isEmpty() == true) {
            System.out.println("The vet system contains no animals");
        } else {
            System.out.println("The vet system is not empty");
        }
    }

    // Option04
    // Check If System Is Full
    private static void option4(Vet vetAppIn) {
        if (vetAppIn.isFull() == true) {
            System.out.println("The vet system is FULL and can't accept any new animals!");
        } else {
            System.out.println("The vet system is not full - you can add new animals to the system!");
        }
    }

    // Option05
    // Add Additonal Details
    private static void option5(Vet vetAppIn) {
        System.out.print("Enter Animal ID: ");
        String animalID = EasyScanner.nextString();
        System.out.println();
        Animal pet = vetAppIn.getItem(animalID);
        if (pet == null) {
            System.out.print("Animal ID (" + animalID + ") that you have entered does NOT exist!");
        } else {
            System.out.print("Enter if vaccinations for your animal have been recieved [Y/N]: ");
            char vac = EasyScanner.nextChar();
            boolean isVaccinated = false;

            if (vac == 'y' || vac == 'Y') {
                isVaccinated = true;
            } else if (vac == 'n' || vac == 'N') {
                isVaccinated = false;
            }

            System.out.println(); // Blank Space
            boolean ok = vetAppIn.addDetails(animalID, isVaccinated);
            if (!ok) {
                System.out.println("Animal details could not be updated, sorry!");
            } else {
                System.out.println("Animal details updated.!");
            }
        }
    }

    // Option06
    // Animal Details
    private static void option6(Vet vetAppIn) {
        System.out.println();
        System.out.println("Vet System");
        System.out.println("1. Add an Animal");
        System.out.println("2. Remove an Animal");
        System.out.println("3. Check if Vet System is empty");
        System.out.println("4. Check if Vet System is full");
        System.out.println("5. Add Additional Animal Details");
        System.out.println("6. Animal Details");
        System.out.println("   6A. Display Details of an Animal ");
        System.out.println("   6B. Display All Animal Details");
        System.out.println("   6C. Display Oldest Animal ");
        System.out.println("   6D. Display Youngest Anmial  ");
        System.out.println("7. Update Animal Length of Time in System ");
        System.out.println("8. Exit System");
        System.out.println();
        System.out.print("Enter choice [A - D]: ");
        char option2 = EasyScanner.nextChar();
        
        System.out.println(); // Blank Space
        
        // Switch Statement
        switch (option2) {
            case 'A':
            case 'a':
                option6a(vetAppIn);
                return;
            case 'B':
            case 'b':
                option6b(vetAppIn);
                return;
            case 'C':
            case 'c':
                option6c(vetAppIn);
                return;
            case 'D':
            case 'd':
                option6d(vetAppIn);
                return;
        }
        System.out.println("Invalid entry, please enter [A - D] only!");
    }

    // Option06a
    // Display Details Of An Animal
    private static void option6a(Vet vetAppIn) {
        System.out.println("Enter Animal ID: ");
        String id = EasyScanner.nextString();
        Animal animalSelected = vetAppIn.getItem(id); // Animal animalselected = method name.getItem(ID)
        if (animalSelected == null) {
            System.out.println("Animal ID " + id + " does not exist in the system");
        } else {
            System.out.println();
            System.out.println("Animal ID: " + animalSelected.getAnimalID());
            System.out.println("Animal Type: " + animalSelected.getAnimalType());
            System.out.println("Animal Name: " + animalSelected.getAnimalName());
            System.out.println("Owners Name: " + animalSelected.getOwnerName());
            System.out.println("Animal Age: " + animalSelected.getAnimalAge());
            System.out.println("Year Registered: " + animalSelected.getYearRegistered());
            System.out.println("Length of Time With Client: " + animalSelected.getLenTimeClient());
            boolean vaccinations = animalSelected.getVaccinations();
            if (vaccinations == true) {
                System.out.println("Animal Vaccination Status: Yes");
            } else {
                System.out.println("Animal Vaccination Status: No");
            }
        }
    }

    // Option06b
    // Display All Animal Details
    private static void option6b(Vet vetAppIn) {
        String info = vetAppIn.list();
        if (info.equals(""))
        {
            System.out.println("There are no Animals registered in the Vets!");
        } else {
            System.out.println(info); // Print.
        }
    }

    // Option06c
    // Display Oldest Animal
    private static void option6c(Vet vetAppIn) {
        Animal animalSelected = vetAppIn.findOldestAnimal();
        if (animalSelected == null) {
            System.out.println("No Animals are added into the system");
        } else {
            System.out.println(animalSelected.getAnimalName() + " with Animal ID " + animalSelected.getAnimalID() + " is the oldest animal (" + animalSelected.getAnimalAge() + " years )");
        }
    }

    // Option06d (Vet) (Void)
    // Display Youngest Animal
    private static void option6d(Vet vetAppIn) {
        Animal animalSelected = vetAppIn.findYoungestAnimal();
        if (animalSelected == null) {
            System.out.println("No Animals are added into the system");
        } else {
            System.out.println(animalSelected.getAnimalName() + " with Animal ID " + animalSelected.getAnimalID() + " is the youngest animal (" + animalSelected.getAnimalAge() + " years )");
        }
    }

    // Option07 (Vet) (Void)
    private static void option7(Vet vetAppIn) { // No Return Type.
        System.out.println(vetAppIn.upDateLenOfTime()); // Prints and updates length of time.
    }
}