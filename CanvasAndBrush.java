import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is the canvas to put your artwork on.  It is also the paintbrush.
 * 
 * @author Bruce Gustin
 * @version August 1, 2022
 */

public class CanvasAndBrush extends World
{
    private int x;
    private final double AMPLITUDE = -60; //negative to account for graph reversed; in Greenfoot ↓ is up).
    private final double Y_SHIFT = 200;   //centers y in scene.

    /**
     * Constructor for objects of class MathWorld.
     * 
     */
    public CanvasAndBrush()
    {    
        //Create a new world with 720x400 cells with a cell size of 1x1 pixels. 
        //This is twice around the unit circle.
        super(720, 400, 1); 

    }
    
    public void act()
    {
        //Convert radians (the x) to degrees
        double degrees = x * Math.PI / 180;
        
        //Limit x to 2 periods
        if(x < getWidth())
        {
            //Adds a point to the graph at (x, y(x))
            double y = mathFunction(degrees);
            addObject(new Paint(), x, (int)(Y_SHIFT + AMPLITUDE * y));
            x++;
        }
        else
        {
            //Ends act method
            Greenfoot.stop();
        }
        
    }
    
    private double mathFunction(double functionInput)
    {
        //Sets sin as the function, i.e. y(x) = sin(x).
        return Math.sin(functionInput);
    }
}
