import java.util.*;

public class Farm {
    private final List<Animal> animals;

    public Farm() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal a) {
        animals.add(a);
    }

    public void showAllAnimals() {
        System.out.println("\n+----------------------------------------------------+");
        System.out.println("| Type    | Name       | Age | Gender | Weight (kg)  |");
        System.out.println("+----------------------------------------------------+");

        for (Animal a : animals) {
            System.out.printf("| %-7s | %-10s | %-3d | %-6s | %-12.1f |\n",
                    a.getClass().getSimpleName(),
                    a.getName(),
                    a.getAge(),
                    a.getGender(),
                    a.getWeight());
        }

        System.out.println("+----------------------------------------------------+");
    }

    public void playAllSounds() {
        System.out.println("\nAnimal sounds:");
        for (Animal a : animals) {
            a.makeSound();
        }
    }

    public void feedAllAnimals() {
        System.out.println("\nFeeding all animals...");
        for (Animal a : animals) {
            a.feed();
        }
    }

    public void countAnimalsByType() {
        System.out.println("\nAnimal counts by type:");
        Map<String, Integer> countMap = new HashMap<>();
        for (Animal a : animals) {
            String type = a.getClass().getSimpleName();
            countMap.put(type, countMap.getOrDefault(type, 0) + 1);
        }

        for (String type : countMap.keySet()) {
            System.out.println(type + ": " + countMap.get(type));
        }
    }
}
