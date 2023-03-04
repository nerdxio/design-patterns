package io.nerd.proxy;

//Proxy
public class ImageDisplayProxy implements DisplayImage{
    private DisplayImage displayImage;
    private String fileName;

    public ImageDisplayProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (displayImage == null) {
            displayImage = new DisplayImageImpl(fileName);
        }
        displayImage.display();
    }
}
