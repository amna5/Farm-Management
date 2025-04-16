public class Goat extends Animal {

    public Goat(String name, int age, String gender, double weight_in_kg) {
        super(name, age, gender, weight_in_kg);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says Baa!");
    }

    @Override
    public void feed() {
        System.out.println(getName() + " the Goat has been fed.");
    }

}
