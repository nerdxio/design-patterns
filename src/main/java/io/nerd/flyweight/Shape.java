package io.nerd.flyweight;

import java.awt.*;

public interface Shape {

    void draw(Graphics g, int x, int y, int width, int height, Color color);

}
