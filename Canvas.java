import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Canvas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Canvas extends World
{
    private GreenfootImage canvas;

    public Canvas()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(540, 400, 1); 
        canvas = getBackground();
        chooseCanvas();
    }
    
    public void act()
    {
        checkKeyDown(Greenfoot.getKey());
    }
    
    private void chooseCanvas()
    {
        canvas.setColor(Color.BLACK);
        canvas.drawString("Choose a painting,", 30, 30);
        canvas.drawString("Press '1' for function", 50, 50);
        canvas.drawString("Press '2' for fractal", 50, 70);
    }
    
    private void checkKeyDown(String key)
    { 
        if(key != null)
        {
            if(key.equals("1"))
            {
                Greenfoot.setWorld(new Function());
            }
            
            if(key.equals("2"))
            {
                Greenfoot.setWorld(new Fractal());
            }
        }
    }
    
    public GreenfootImage getCanvas()
    {
        return canvas;
    }
}
