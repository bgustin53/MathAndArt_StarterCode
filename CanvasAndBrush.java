import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is the canvas to put your artwork on.  It is also the paintbrush.
 * 
 * @author Bruce Gustin
 * @version August 1, 2022
 */

public class CanvasAndBrush extends World
{
    private int x,y;
    private final int PAINT_SPACING = 1;

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
        if(x < getWidth())
        {
           applyPaint(x,mathFunction());
        }
        else
        {
            //Ends act method
            Greenfoot.stop();
        }
        x += PAINT_SPACING;
    }
    
    private int mathFunction()
    {
        //Sets sin as the function, i.e. y(x) = 200 + 60sin(x) with x converted to radians
        return (int) (200 - 60 * Math.sin(x * Math.PI / 180));
    }
    
    private void applyPaint(int x, int y)
    {
        addObject(new Paint(), x, y);        
    }
}
