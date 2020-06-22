
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;


class ShapeFactory {
    public void drawShape(String type) {
      
    	System.out.println(type);
    	if(type=="Circle")
    	   new Circle().drawShape();
       else if(type.equals("Square"))
    	   new Square().drawShape();
       else if(type=="Rectangle")
    	   new Rectangle().drawShape();
       else
    	System.out.println("Drawing "+type+" is not supported");
    }
}

class Shape {
    public void drawShape() {
       System.out.println("Drawing a Shape");
    }
}

class Circle extends Shape{
    public void drawShape() {
       System.out.println("Drawing a Circle");
    }
}

class Square extends Shape {
    public void drawShape() {
       System.out.println("Drawing a Square");
    }
}

class Rectangle extends Shape {
    public void drawShape() {
       System.out.println("Drawing a Rectangle");
    }
}



/*
 * Create the Circle, Square, Rectangle and ShapeFactory class.
 */
public class Shapes {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        
        ((Shape)circle).drawShape();
        ((Shape)square).drawShape();
        ((Shape)rectangle).drawShape();
        
        System.out.println();
        
        ShapeFactory factory = new ShapeFactory();
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for (int i = 0; i < n; i++) {
            String type = in.next();
            factory.drawShape(type);    
        }
    }
}
