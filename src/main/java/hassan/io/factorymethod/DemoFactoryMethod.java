package hassan.io.factorymethod;

public class DemoFactoryMethod {
    public static void main(String[] args) {
        Animal animal = AnimalFactory.getAnimal("cat");
        animal.makeSound();
    }
}
