package connectFour.model;

import java.awt.*;

class Checker extends Rectangle {

    private static int DEFAULT_X = 16;
    private static int DEFAULT_Y = 450;
    private static final int DEFAULT_WIDTH = 60;
    private static final int DEFAULT_HEIGHT = 60;
    private static int shift_x = 0;
    private static int shift_y = 0;

    private Checker(int x, int y, int width, int height) {
        super(x,y,width,height);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Checker(){
        this(DEFAULT_X + shift_x, DEFAULT_Y + shift_y, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        shift_y -= 40;
    }

}
