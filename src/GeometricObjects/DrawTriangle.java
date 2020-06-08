/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeometricObjects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author durba
 */
public class DrawTriangle extends javax.swing.JPanel {

   /**
     * Creates new form Draw
     */
    private double a;
    private double b;
    private double c;
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;
    private Color color;
    private boolean filled;
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     *     Constructor     Draw()-default constructor
     *     Description     Create an instance of the Draw class.
     *     @author         <i>Ardit Miftaraj</i>
     *     Date            02/20/2020
     *</pre>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    public DrawTriangle() {
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
    public void setVertices(int x1,int y1,int x2,int y2,int x3,int y3) {
//        if(x1<=0)
//            this.x1=getWidth()/2-x1;
//        else //if(x1>0)
//            this.x1=getWidth()/2+x1;
//        if(x2<=0)
//            this.x2=getWidth()/2-x2;
//        else //if(x2>0)
//            this.x2=getWidth()/2+x2;
//        if(x3<=0)
//            this.x3=getWidth()/2-x3;
//        else //if(x3>0)
//            this.x3=getWidth()/2+x3;
//         if(y1>0)
//            this.y1=getHeight()/2-y1;
//        else //if(y1<=0)
//            this.y1=getHeight()/2+y1;
//        if(y2>0)
//            this.y2=getHeight()/2-y2;
//        else //if(y2<=0)
//            this.y2=getHeight()/2+y2;
//         if(y3>0)
//            this.y3=getHeight()/2-y3;
//        else //if(y3<=0)
//            this.y3=getHeight()/2+y3;
         
         System.out.println(""+y3);
         System.out.println(""+this.y3);
         System.out.println(""+getHeight()/2);
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }
    
    public static double getDistance(int x1, int y1, int x2, int y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    public double getPerimeter() {
         a = getDistance(x1, y1, x2, y2);
         b = getDistance(x1, y1, x3, y3);
         c = getDistance(x2, y2, x3, y3);
        
        return a + b + c;
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
      
      if(getPerimeter()<300){
          while(getPerimeter()<350)
          {
            x1*=1.5;
            x2*=1.5;
            x3*=1.5;
            y1*=1.5;
            y2*=1.5;
            y3*=1.5;
          }
      
      super.paintComponent(gr);
        Graphics2D g = (Graphics2D) gr;
        g.setColor( color );
        
        if(x1<=0)
            this.x1=getWidth()/2-Math.abs(x1);
        else //if(x1>0)
            this.x1=getWidth()/2+x1;
        if(x2<=0)
            this.x2=getWidth()/2-Math.abs(x2);
        else //if(x2>0)
            this.x2=getWidth()/2+x2;
        if(x3<=0)
            this.x3=getWidth()/2-Math.abs(x3);
        else //if(x3>0)
            this.x3=getWidth()/2+x3;
         if(y1>0)
            this.y1=getHeight()/2-y1;
        else //if(y1<=0)
            this.y1=getHeight()/2+Math.abs(y1);
        if(y2>0)
            this.y2=getHeight()/2-y2;
        else //if(y2<=0)
            this.y2=getHeight()/2+Math.abs(y2);
         if(y3>0)
            this.y3=getHeight()/2-y3;
        else //if(y3<=0)
            this.y3=getHeight()/2+Math.abs(y3);
        
        g.drawLine(getWidth()/2,0,getWidth()/2,getHeight());
        g.drawLine(0,getHeight()/2,getWidth(),getHeight()/2);
        double x = getWidth()/2;
        double y = getHeight()/2;
        System.out.println(""+getHeight()/2);
        System.out.println(""+x);
        Polygon p = new Polygon();
        
        p.addPoint(x1, y1);
        p.addPoint(x2, y2);
        p.addPoint(x3, y3);
        
        
        if (filled) {
          g.fillPolygon(p);
      }
        else
            g.drawPolygon(p);
        
      }
      else if(getPerimeter()>500)
      {
          while(getPerimeter()>500)
          {
            x1/=1.5;
            x2/=1.5;
            x3/=1.5;
            y1/=1.5;
            y2/=1.5;
            y3/=1.5;
          }
      
      super.paintComponent(gr);
        Graphics2D g = (Graphics2D) gr;
        g.setColor( color );
        
        if(x1<=0)
            this.x1=getWidth()/2-Math.abs(x1);
        else //if(x1>0)
            this.x1=getWidth()/2+x1;
        if(x2<=0)
            this.x2=getWidth()/2-Math.abs(x2);
        else //if(x2>0)
            this.x2=getWidth()/2+x2;
        if(x3<=0)
            this.x3=getWidth()/2-Math.abs(x3);
        else //if(x3>0)
            this.x3=getWidth()/2+x3;
         if(y1>0)
            this.y1=getHeight()/2-y1;
        else //if(y1<=0)
            this.y1=getHeight()/2+Math.abs(y1);
        if(y2>0)
            this.y2=getHeight()/2-y2;
        else //if(y2<=0)
            this.y2=getHeight()/2+Math.abs(y2);
         if(y3>0)
            this.y3=getHeight()/2-y3;
        else //if(y3<=0)
            this.y3=getHeight()/2+Math.abs(y3);
        
        g.drawLine(getWidth()/2,0,getWidth()/2,getHeight());
        g.drawLine(0,getHeight()/2,getWidth(),getHeight()/2);
        double x = getWidth()/2;
        double y = getHeight()/2;
        System.out.println(""+getHeight()/2);
        System.out.println(""+x);
        Polygon p = new Polygon();
        
        p.addPoint(x1, y1);
        p.addPoint(x2, y2);
        p.addPoint(x3, y3);
        
        
        if (filled) {
          g.fillPolygon(p);
      }
        else
            g.drawPolygon(p);
        
      }
      else
    {
        super.paintComponent(gr);
        Graphics2D g = (Graphics2D) gr;
//        AffineTransform saveTransform = g.getTransform();
        
//        try {
//         AffineTransform scaleMatrix = new AffineTransform();
//         scaleMatrix.scale(1.5, 1.5);
        gr.setColor( color );
        
        if(x1<=0)
            this.x1=getWidth()/2-Math.abs(x1);
        else //if(x1>0)
            this.x1=getWidth()/2+x1;
        if(x2<=0)
            this.x2=getWidth()/2-Math.abs(x2);
        else //if(x2>0)
            this.x2=getWidth()/2+x2;
        if(x3<=0)
            this.x3=getWidth()/2-Math.abs(x3);
        else //if(x3>0)
            this.x3=getWidth()/2+x3;
         if(y1>0)
            this.y1=getHeight()/2-y1;
        else //if(y1<=0)
            this.y1=getHeight()/2+Math.abs(y1);
        if(y2>0)
            this.y2=getHeight()/2-y2;
        else //if(y2<=0)
            this.y2=getHeight()/2+Math.abs(y2);
         if(y3>0)
            this.y3=getHeight()/2-y3;
        else //if(y3<=0)
            this.y3=getHeight()/2+Math.abs(y3);
        
        gr.drawLine(getWidth()/2,0,getWidth()/2,getHeight());
        gr.drawLine(0,getHeight()/2,getWidth(),getHeight()/2);
        double x = getWidth()/2;
        double y = getHeight()/2;
        System.out.println(""+getHeight()/2);
        System.out.println(""+x);
        Polygon p = new Polygon();
        
        p.addPoint(x1, y1);
        p.addPoint(x2, y2);
        p.addPoint(x3, y3);
        
       // g.setTransform(scaleMatrix);
        
        // g.drawPolygon(p);
         
        if (filled) {
          g.fillPolygon(p);
      }
        else
            g.drawPolygon(p);
//        } finally {
//         g.setTransform(saveTransform);
//     }
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
