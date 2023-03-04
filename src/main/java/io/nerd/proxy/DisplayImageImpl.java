package io.nerd.proxy;

//Service
public class DisplayImageImpl implements DisplayImage{
    private String fileName;

    public DisplayImageImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}
