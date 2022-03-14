import ie.gmit.animal.*;
import ie.gmit.twodshapes.*;

public class Main {

    public static void main(String[] args) {
        Triangle triangleObject1 = new Triangle(10.0f, 5.0f, "isosceles");
        ColouredTriangle colouredTriangleObject1 = new ColouredTriangle(11.5f, 22.3f, "scalene", "blue");
        Circle circleObject1 = new Circle(5.6f, 7.8f, 22.5f);

        // triangleObject1.setWidthCm(10.5f);
        // triangleObject1.setHeightCm(16.5f);
        // colouredTriangleObject1.setHeightCm(18.3f);
        // circleObject1.setWidthCm(11.5f);

        System.out.println("Triangle height in cm = "+triangleObject1.getHeightCm());
        System.out.println("Triangle width in cm = "+triangleObject1.getWidthCm());
        System.out.println("Coloured Triangle height in cm = "+colouredTriangleObject1.getHeightCm());
        System.out.println("Radius of circle = "+circleObject1.getWidthCm());
    
    }

} 
