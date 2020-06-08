package GeometricObjects;

import java.awt.Color;
import java.util.Date;
import java.util.Random;
/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*<pre>
*   Class           Circle
*   File            Circle.java
*   Description     Class that creates a Circle Object 
*   @author         <i>Jonida Durbaku</i>
*   Environment     PC, Windows 10, NetBeans IDE 8.2, jdk 1.8.0_131
*   Date            02/20/2020
*   @version        1.0.0
*   @see            javax.awt.Color
*   @see            java.util.Date
*   @see            java.util.Random
*</pre>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class Circle extends GeometricObject
{
    private double radius;
    Random myRandom = new Random();
    
//default constructor
 public Circle() 
 {
     
}

 //constructor with parameters
public Circle(double radius) {
this.radius = radius;
}
//construcot with color and filled value
public Circle(double radius,
Color color, boolean filled) {
this.radius = radius;
super.setColor();
super.setFilled();
}

/** Return radius */
public double getRadius() {
return radius;
}

/** Set a new radius */
public void setRadius(double radius) {
this.radius = radius;
}

/** Return area */
    @Override
    public double getArea() {
return radius * radius * Math.PI;
}

/** Return diameter */
public double getDiameter() {
return 2 * radius;
}

/** Return perimeter */
    @Override
    public double getPerimeter() {
return 2 * radius * Math.PI;
}


/** Print the circle info */
public String printCircle() 
{
return ("The circle is "+ super.getColor()+
        ((super.isFilled())? " is filled":" is not filled") + 
        " and was created on " + getDateCreated());    
}
}
