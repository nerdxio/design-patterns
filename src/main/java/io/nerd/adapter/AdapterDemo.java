package io.nerd.adapter;
/**
 * @author Hassan Refaat <hassan.refaat.dev@gmail.com>
 * @Created 3/18/2023 10:08 AM
 */
public class AdapterDemo {
    public static void main(String[] args) {
        /*
        * Adapter is a structural design pattern that allows objects
        *  with incompatible interfaces to collaborate.
        * */
        SocketAdapter sockAdapter = new SocketAdapterImpl(new Socket());
        Volt v3 = getVolt(sockAdapter,3);
        Volt v12 = getVolt(sockAdapter,12);
        Volt v120 = getVolt(sockAdapter,120);
        System.out.println("v3 volts using Object Adapter= "+v3.getVolt());
        System.out.println("v12 volts using Object Adapter= "+v12.getVolt());
        System.out.println("v120 volts using Object Adapter= "+v120.getVolt());

    }
    private static Volt getVolt(SocketAdapter sockAdapter, int i) {
        return switch (i) {
            case 3 -> sockAdapter.get3Volt();
            case 12 -> sockAdapter.get12Volt();
            default -> sockAdapter.get120Volt();
        };
    }
}
