public class Pig extends Animal {
    public Pig(String name, int age, String gender, double weight_in_kg) {
        super(name, age, gender, weight_in_kg);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says Oink!");
    }

    @Override
    public void feed() {
        System.out.println(getName() + " the Pig has been fed.");
    }
}
