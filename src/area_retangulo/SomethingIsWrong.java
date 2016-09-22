package area_retangulo;

/**
 * Created by Walterlmm on 21/09/2016.
 */

public class SomethingIsWrong {

    public static void main(String[] args) {

        Rectangle myRect = new Rectangle();

        myRect.setWidth(40);

        myRect.setHeight(50);

        System.out.println("myRect's area is " + myRect.area(myRect.getWidth(),myRect.getHeight())+"m²");
    }

}

