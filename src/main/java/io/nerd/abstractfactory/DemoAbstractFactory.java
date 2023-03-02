package io.nerd.abstractfactory;

public class DemoAbstractFactory {
    public static void main(String[] args) {

        var pc = ComputerFactoryProvider.getComputer(new PCFactory("32g", "1T", "Intel core i 9"));
        var server = ComputerFactoryProvider.getComputer(new ServerFactory("128g", "100T", "Rezen Thread Reper"));
        System.out.println(pc.toString());
        System.out.println(server.toString());

    }
    //Applicability
    /*
    * Use the Abstract Factory when your code needs to work with various families of related
    * products, but you don’t want it to depend on the concrete classes of those products—they
    *  might be unknown beforehand or you simply want to allow for future extensibility.
    */
}
