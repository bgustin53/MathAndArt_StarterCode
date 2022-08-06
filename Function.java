import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is the canvas to put your artwork on.  It is also the paintbrush.
 * 
 * @author Bruce Gustin
 * @version August 1, 2022
 */

public class Function extends Canvas
{
    private int xPos,yPos;
    private GreenfootImage canvas;
    private final int DENSITY = 1;
    private final int WIDTH = 1;
    private final int HEIGHT = 3;
    private final Color COLOR = Color.RED;

    /**
     * Constructor for objects of class MathWorld.
     * 
     */
    public Function()
    {    
        canvas = getCanvas();
        canvas.setColor(Color.WHITE);
        canvas.fill();
    }
    
    public void act()
    {
       if(xPos < getWidth())
       {
           paint();
           xPos += DENSITY;
       }
       else
       {
           Greenfoot.stop();
       }
    }
    
    private int mathFunction()
    {
        //Sets sin as the function, i.e. y(x) = 200 + 60sin(x) with x converted to radians
        return (int) (200 - 60 * Math.sin(Math.toRadians(xPos)));
    }
    
    protected void paint()
    {
        canvas.setColor(COLOR);
        canvas.drawOval(xPos, mathFunction(), WIDTH, HEIGHT);
        canvas.fillOval(xPos, mathFunction(), WIDTH, HEIGHT);
    }
    

}

