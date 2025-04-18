public abstract class Animal {

    // characteristics (attributes)
    private String name;
    private int age;
    private String gender;
    private double weight_in_kg;

    // behaviour (methods)
    public abstract void makeSound();

    public abstract void feed();

    // constructor
    public Animal(String name, int age, String gender, double weight_in_kg) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight_in_kg = weight_in_kg;
    }

    // setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight_in_kg;
    }

    public void setWeight(double weight_in_kg) {
        this.weight_in_kg = weight_in_kg;
    }
}
