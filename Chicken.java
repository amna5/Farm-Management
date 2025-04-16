public class Chicken extends Animal {
    public Chicken(String name, int age, String gender, double weight_in_kg) {
        super(name, age, gender, weight_in_kg); // super is used to access things in the parent class
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says Cluck!");
    }

    @Override
    public void feed() {
        System.out.println(getName() + " the Chicken has been fed.");
    }

}