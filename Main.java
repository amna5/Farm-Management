import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Farm farm = new Farm();

        // 5 Goats
        farm.addAnimal(new Goat("Billy", 2, "Male", 60.0));
        farm.addAnimal(new Goat("Nanny", 3, "Female", 58.0));
        farm.addAnimal(new Goat("Grumpy", 4, "Male", 62.5));
        farm.addAnimal(new Goat("Fluffy", 1, "Female", 55.0));
        farm.addAnimal(new Goat("Tiny", 2, "Male", 59.0));

        // 2 Sheep
        farm.addAnimal(new Sheep("Woolly", 3, "Female", 80.0));
        farm.addAnimal(new Sheep("Cloud", 2, "Male", 77.0));

        // 4 Chickens
        farm.addAnimal(new Chicken("Clucky", 1, "Female", 2.5));
        farm.addAnimal(new Chicken("Henrietta", 2, "Female", 2.0));
        farm.addAnimal(new Chicken("Pecky", 1, "Male", 2.1));
        farm.addAnimal(new Chicken("Feathers", 3, "Female", 2.6));

        // 2 Pigs
        farm.addAnimal(new Pig("Porky", 2, "Male", 120.0));
        farm.addAnimal(new Pig("Bacon", 3, "Female", 115.0));

        // 1 Cow
        farm.addAnimal(new Cow("Bessie", 4, "Female", 450.0));

        int choice;

        do {
            System.out.println("\n=== Farm Management System ===");
            System.out.println("1. View details of all animals");
            System.out.println("2. Hear animal sounds");
            System.out.println("3. Feed all animals");
            System.out.println("4. Count animals by type");
            System.out.println("5. Exit");
            System.out.print("Enter a number: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear input buffer

            switch (choice) {
                case 1:
                    farm.showAllAnimals();
                    break;
                case 2:
                    farm.playAllSounds();
                    break;
                case 3:
                    farm.feedAllAnimals();
                    break;
                case 4:
                    farm.countAnimalsByType();
                    break;
                case 5:
                    System.out.println("Thank you for using the Farm Management System!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
