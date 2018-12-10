//
// Don't edit this file
//
public class Brick {

    private int width;

    private int height;

    private BrickColor color;

    static int numInstances = 0; // for test purposes only

    Brick(int width, int height, BrickColor color) {
        this.width = width;
        this.height = height;
        this.color = color;
        numInstances++;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public BrickColor getColor() {
        return color;
    }

}
