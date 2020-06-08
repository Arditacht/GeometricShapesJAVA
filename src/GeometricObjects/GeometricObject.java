package GeometricObjects;

import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*<pre>
*  Class           GeometricObject
*  File            GeometricObject.java
*  Description     Project #2--Abstract class that provides base class for 
*                  the Triangle, Circle, and Rectangle class
*  @author         <i>Jonida Durbaku</i>
*  Environment     PC, Windows 10, NetBeans IDE 8.2, jdk 1.8.0_131
*  Date            02/20/2020
*  @version        1.0.0
*  History Log     
*  @see            javax.swing.JFrame
*  @see            java.awt.Toolkit
*  @see            javax.swing.JOptionPane
*</pre>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public abstract class GeometricObject 
{
    private Random myRandom = new Random();
    private Color color ;
    private boolean filled;
    private java.util.Date dateCreated;
    private ArrayList<Color> colors ;

    /** Construct a default geometric object */
    protected GeometricObject() 
    {
      dateCreated = new java.util.Date();
      setFilled();
      setColor();
    }

    /** Construct a geometric object with color and filled value */
    protected GeometricObject(Color color, boolean filled) 
    {
        dateCreated = new java.util.Date();
        this.color = Color.WHITE;
        this.filled = filled;
    }

    /** Return color */
    public String getColor() 
    {
        if(color == Color.BLACK)
            return "Black";
        else if (color == Color.BLUE)
            return "Blue";
        else if (color == Color.GREEN)
            return "Green";
        else if (color == Color.RED)
            return "Red";
        else if (color == Color.PINK)
            return "Pink";
        else if (color == Color.ORANGE)
            return "Orange";
        else if (color == Color.DARK_GRAY)
            return "Dark Gray";
        else if (color == Color.CYAN)
            return "Cyan";
        else if (color == Color.MAGENTA)
            return "Magenta";
        else if (color == Color.YELLOW)
            return "Yellow";
        else
            return "White";
    }
    
    public Color retriveColor()
    {
        return color;
    }

    /** Set a new color */
    public void setColor() 
    {
        colors = new ArrayList(10);
        colors.add(Color.BLACK);
        colors.add(Color.BLUE);
        colors.add(Color.GREEN);
        colors.add(Color.RED);
        colors.add(Color.PINK);
        colors.add(Color.ORANGE);
        colors.add(Color.DARK_GRAY);
        colors.add(Color.CYAN);
        colors.add(Color.MAGENTA);
        colors.add(Color.YELLOW);
      this.color = colors.get(myRandom.nextInt(10));
    }

    /** Return filled. Since filled is boolean,
     *  the get method is named isFilled */
    public boolean isFilled() 
    {
      filled = (myRandom.nextInt(2)==0? true:false);  
      return filled;
    }

    /** Set a new filled */
    public void setFilled() 
    {
      this.filled = (myRandom.nextInt(2)==0? true:false);
    }

    /** Get dateCreated */
    public String getDateCreated() 
    {
        DateFormat dateFormat= new SimpleDateFormat("MM/dd/yyyy");
        Date now= new Date();
      return dateFormat.format(now);
    }

    @Override
    public String toString() 
    {
      return "created on " + dateCreated + "\ncolor: " + color +
        " and filled: " + filled;
    }

    /** Abstract method getArea */
    public abstract double getArea();

    /** Abstract method getPerimeter */
    public abstract double getPerimeter();
}