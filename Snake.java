public class Snake extends Reptile {
    public Snake(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void speak() {
        System.out.println("Hiss!");
    }

    @Override
    public void displayInfo() {
        System.out.println("Snake - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }
}
