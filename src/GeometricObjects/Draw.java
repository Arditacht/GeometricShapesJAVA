package GeometricObjects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*<pre>
*   Class           Draw
*   File            Draw.java
*   Description     Panel that will be used as a canvas to draw the shapes
*   @author         <i>Ardit Miftaraj</i>
*   Environment     PC, Windows 10, NetBeans IDE 8.2, jdk 1.8.0_131
*   Date            02/20/2020
*   @version        1.0.0
*   @see            javax.awt.Color
*   @see            java.awt.Dimension
*   @see            java.awt.Graphics
*   @see            java.awt.Graphics2D
*   @see            java.awt.geom.Ellipse2D
*</pre>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class Draw extends javax.swing.JPanel {

    /**
     * Creates new form Draw
     */
    double radius;
    Color color;
    boolean filled;
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     *     Constructor     Draw()-default constructor
     *     Description     Create an instance of the Draw class.
     *     @author         <i>Ardit Miftaraj</i>
     *     Date            02/20/2020
     *</pre>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    public Draw() {
        setPreferredSize( new Dimension(400, 400) );
        setBackground( Color.WHITE );
    }
 /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     *     Method       setColor()
     *     Description  Set method that sets the color to be used
     *     @author      <i>Ardit Miftaraj</i>
     *     Date         02/20/2020
     *</pre>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setColor(Color color) {
        this.color = color;
    }
/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     *     Method       setFilled()
     *     Description  Set method that decides if the field is filled or not 
     *     @author      <i>Ardit Miftaraj</i>
     *     Date         02/20/2020
     *</pre>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
   /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     *     Method       setRadius()
     *     Description  Set method that sets the radius of the circle
     *     @author      <i>Ardit Miftaraj</i>
     *     Date         02/20/2020
     *</pre>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    public void setRadius(double radius) {
        this.radius = radius;
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     *     Method       paintComponent()
     *     Description  method that draw the shape of circle
     *     @author      <i>Ardit Miftaraj</i>
     *     Date         02/20/2020
     *</pre>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    
    @Override
    public void paintComponent ( Graphics gr )
  { 
      super.paintComponent(gr);
        Graphics2D g = (Graphics2D) gr;
        gr.setColor( color );
        
        if((radius*2)>(getWidth()/1.5)){
            while((radius*2)>(getWidth()/1.5))
            {
                radius/=1.5;
            }
        gr.drawLine(getWidth()/2,0,getWidth()/2,getHeight());
        gr.drawLine(0,getHeight()/2,getWidth(),getHeight()/2);
        double x = getWidth()/2;
        double y = getHeight()/2;
        g.draw(new Ellipse2D.Double(x -radius, y -radius, radius*2 , radius*2 ));
        if (filled) {
          g.fill(new Ellipse2D.Double(x - radius, y - radius, radius * 2, radius * 2));
      }
       }
        
        else if((radius*2)<(getWidth()/4)){
            while((radius*2)<(getWidth()/4))
            {
                radius*=1.5;
            }
        gr.drawLine(getWidth()/2,0,getWidth()/2,getHeight());
        gr.drawLine(0,getHeight()/2,getWidth(),getHeight()/2);
        double x = getWidth()/2;
        double y = getHeight()/2;
        g.draw(new Ellipse2D.Double(x -radius, y -radius, radius*2 , radius*2 ));
        if (filled) {
          g.fill(new Ellipse2D.Double(x - radius, y - radius, radius * 2, radius * 2));
      }
       }
        else
        {
           gr.drawLine(getWidth()/2,0,getWidth()/2,getHeight());
        gr.drawLine(0,getHeight()/2,getWidth(),getHeight()/2);
        double x = getWidth()/2;
        double y = getHeight()/2;
        g.draw(new Ellipse2D.Double(x -radius, y -radius, radius*2 , radius*2 ));
        if (filled) {
          g.fill(new Ellipse2D.Double(x - radius, y - radius, radius * 2, radius * 2));
      } 
        }
    
  }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
