public class Main {
  public static void main(String[] args) {
      Lion lion = new Lion("Leon", 5, "Male");
      lion.displayInfo();
      lion.speak();

      Elephant elephant = new Elephant("Emily", 7, "Female");
      elephant.displayInfo();
      elephant.speak();

      Snake snake = new Snake("Cece", 6, "Female");
      snake.displayInfo();
      snake.speak();

      Lizard lizard = new Lizard("Jeff", 3, "Male");
      lizard.displayInfo();
      lizard.speak();

      Eagle eagle = new Eagle("Apollo", 13, "Male");
      eagle.displayInfo();
      eagle.speak();

      Parrot parrot = new Parrot("Chesca", 9, "Female");
      parrot.displayInfo();
      parrot.speak();
  }
}

