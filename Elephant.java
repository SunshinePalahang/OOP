public class Elephant extends Mammal {
    public Elephant(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void speak() {
        System.out.println("Toot!");
    }

    @Override
    public void displayInfo() {
        System.out.println("Elephant - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }
}
