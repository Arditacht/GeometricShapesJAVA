package GeometricObjects;

import java.text.DecimalFormat;

/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*<pre>
*   Class           Triangle
*   File            Triangle.java
*   Description     Class that creates a triangle object
*   @author         <i>Ardit Miftaraj</i>
*   Environment     PC, Windows 10, NetBeans IDE 8.2, jdk 1.8.0_131
*   Date            02/20/2020
*   @version        1.0.0
*   @see            javax.text.DecimalFormat
*</pre>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class Triangle extends GeometricObject {

    private double a;
    private double b;
    private double c;
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;
    DecimalFormat myFormat = new DecimalFormat("#,##0.0");
//constructor with parameters
    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.a = getDistance(x1, y1, x2, y2);
        this.b = getDistance(x1, y1, x3, y3);
        this.c = getDistance(x2, y2, x3, y3);
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        this.x3=x3;
        this.y3=y3;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public int getX3() {
        return x3;
    }

    public int getY3() {
        return y3;
    }
    
    
    
// calculates the distance between two points
    public static double getDistance(int x1, int y1, int x2, int y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }

   // displays vertices
    public String showVertices() {
        return "(" + myFormat.format(x1) +"," + myFormat.format(y1) +"), " + 
                "(" + myFormat.format(x2) +"," + myFormat.format(y2) +
                ") and" + "(" +myFormat.format(x3) +"," + 
                myFormat.format(y3) +") ";
    }

    @Override
    public double getArea() {
//        if (!isValid()) {
//            return -1;
//        }

        double p = getPerimeter() / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double getPerimeter() {
//        if (!isValid()) {
//            return -1;
//        }

        return a + b + c;
    }

 // validates a triangle with three given coordinates
    public boolean isValid() {
        return getArea() > 0 ;
    }
// shows the info about the triangle 
    public String printTriangle() 
    {
    return ("The triangle is "+super.getColor()+
        ((super.isFilled())? " is filled":" is not filled") + 
        " and was created on " + getDateCreated());    
    }
}
