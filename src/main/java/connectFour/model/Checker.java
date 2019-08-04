package connectFour.model;

import java.awt.*;

public class Checker extends Rectangle {

    private static int DEFAULT_X = 10;
    private static int DEFAULT_Y = 10;
    private static final int DEFAULT_WIDTH = 50;
    private static final int DEFAULT_HEIGHT = 50;
    private static final String DEFAULT_NAME = "Circle";
    private String name;
    private static int shift_x = 0;
    private static int shift_y = 0;

    public Checker(int x, int y, int width, int height, String name) {
        super(x,y,width,height);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.name = name;

    }

    public Checker(){
        this(DEFAULT_X + shift_x, DEFAULT_Y + shift_y, DEFAULT_WIDTH, DEFAULT_HEIGHT, DEFAULT_NAME);
        shift_x += 75;
    }

    public Color getColor() {
        return Color.orange;
    }
}
