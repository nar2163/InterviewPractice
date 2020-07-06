import java.util.*;

public class AnimalShelter{

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        String name;
        ShelterStacks allAnimals = new ShelterStacks();
        ShelterOccupants animal = new ShelterOccupants();
        int input = 0;

        while(input != -1) {
            System.out.println("Welcome to the Adoption Center");
            System.out.println("Do you want to adopt or drop off an animal");
            System.out.println("0 for drop off, 1 for adopt, -1 to exit:");
            input = Integer.parseInt(s.nextLine());
            if (input == 0) {
                System.out.println("Enter dog or cat, 0 for cat, 1 for dog");
                input = Integer.parseInt(s.nextLine());
                System.out.println("Enter animals name: ");
                name = s.nextLine();
                animal = new ShelterOccupants(input, name);
                allAnimals.dropOff(animal);
            } else if (input == 1){
                if(allAnimals.isEmpty()){
                    System.out.println("Sorry there are no animals in the shelter!");
                } else {
                    System.out.println("Would you like to adopt a dog or a cat?");
                    System.out.println("0 for dog, 1 for cat");
                    input = s.nextInt();
                    animal = allAnimals.adopt(input);
                    break;
                }
            }
        }

        s.close();

        if(input == 1 || input == 0) {
            System.out.println("Meet the new love of your life!");
            System.out.printf("It's a %s and their name is %s\n", animal.getTypeString(), animal.getName());
        }

    }


}