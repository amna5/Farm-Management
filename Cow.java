public class Cow extends Animal {

    public Cow(String name, int age, String gender, double weight_in_kg) {
        super(name, age, gender, weight_in_kg);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says Moo!");
    }

    @Override
    public void feed() {
        System.out.println(getName() + " the Cow has been fed.");
    }

}
