/**
 * @author Hassan Refaat <hassan.refaat.dev@gmail.com>
 * @Created 3/18/2023 11:31 AM
 */
package io.nerd.adapter;

public class SocketAdapterImpl implements SocketAdapter {
    private Socket socket;

    public SocketAdapterImpl(Socket socket) {
        this.socket = new Socket();
    }

    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volt() {
        return convertVolt(socket.getVolt(),10);
    }

    @Override
    public Volt get3Volt() {
        return convertVolt(socket.getVolt(),40);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolt()/i);
    }
}
