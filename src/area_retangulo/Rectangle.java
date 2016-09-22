package area_retangulo;

/**
 * Created by Walterlmm on 21/09/2016.
 */
public class Rectangle {

    private int width;

    private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }


    public int area(int base, int altura) {

        return base * altura;

    }

}
