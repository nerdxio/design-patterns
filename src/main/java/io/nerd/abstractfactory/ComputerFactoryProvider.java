package io.nerd.abstractfactory;

public class ComputerFactoryProvider {
    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }

}
