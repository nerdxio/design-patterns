/**
 * @author Hassan Refaat <hassan.refaat.dev@gmail.com>
 * @Created 4/24/2023 8:31 AM
 */
package io.nerd.flyweight;

import java.util.HashMap;

public class ShapeFactory {
    public static final HashMap<ShapeType, Shape> SHAPES = new HashMap<>();

    public static Shape getShape(ShapeType type) {
        Shape shapeImpl = SHAPES.get(type);

        if (shapeImpl == null) {
            if (type.equals(ShapeType.OVAL_FILL)) {
                shapeImpl = new Oval(true);
            } else if (type.equals(ShapeType.OVAL_NOFILL)) {
                shapeImpl = new Oval(false);
            } else if (type.equals(ShapeType.LINE)) {
                shapeImpl = new Line();
            }
            SHAPES.put(type, shapeImpl);
        }
        return shapeImpl;
    }

    public static enum ShapeType {
        OVAL_FILL, OVAL_NOFILL, LINE
    }
}
