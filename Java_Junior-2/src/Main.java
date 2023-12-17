import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Dog("Buddy", 3, "Labrador");
        animals[1] = new Cat("Whiskers", 5, true);
        animals[2] = new Dog("Max", 2, "Golden Retriever");
        animals[3] = new Cat("Smokey", 4, false);

        for (Animal animal : animals) {
            System.out.println("Name: " + animal.name + ", Age: " + animal.age);

            Class<? extends Animal> animalClass = animal.getClass();
            try {
                Method makeSoundMethod = animalClass.getMethod("makeSound");
                makeSoundMethod.invoke(animal);
            } catch (Exception e) {
            }
        }
    }
}