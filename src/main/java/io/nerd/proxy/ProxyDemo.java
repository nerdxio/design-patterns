package io.nerd.proxy;
//Our Client
public class ProxyDemo {
    /*
    * Proxy is a structural design pattern that lets you provide a substitute or placeholder
    *  for another object. A proxy controls access to the original object,
    *  allowing you to perform something either before or after the request gets through to the original object.*/
    public static void main(String[] args) {
        DisplayImage displayImage = new ImageDisplayProxy("CatImage.png");
        displayImage.display();
    }
}
