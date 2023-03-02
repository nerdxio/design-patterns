package io.nerd.factorymethod;

public class Cat implements Animal{

    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }
}
