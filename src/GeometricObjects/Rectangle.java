package GeometricObjects;
/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*<pre>
*   Class           Rectangle
*   File            Rectangle.java
*   Description     Class that creates a Rectangle Object 
*   @author         <i>Jonida Durbaku</i>
*   Environment     PC, Windows 10, NetBeans IDE 8.2, jdk 1.8.0_131
*   Date            02/20/2020
*   @version        1.0.0
*</pre>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class Rectangle extends GeometricObject 
{
private double width;
private double height;

//default constructor
public Rectangle() {
}
//constructor with parameters
public Rectangle(double width, double height) 
{
this.width = width;
this.height = height;
}
//construcot with parameters
public Rectangle(double width, double height, String color, boolean filled) 
{
this.width = width;
this.height = height;
super.setColor();
super.setFilled();
}

/** Return width */
public double getWidth() 
{
return width;
}

/** Set a new width */
public void setWidth(double width) 
{
this.width = width;
}

/** Return height */
public double getHeight() 
{
return height;
}

/** Set a new height */
public void setHeight(double height) 
{
this.height = height;
}

/** Return area */
public double getArea() 
{
return width * height;
}

/** Return perimeter */
public double getPerimeter() 
{
return 2 * (width + height);
}
//return info about rectangle
public String printRectangle() 
{
return ("The rectangle is "+super.getColor()+
        ((super.isFilled())? " is filled":" is not filled") + 
        " and was created on " + getDateCreated());    
}
}
