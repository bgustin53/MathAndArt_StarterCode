import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is the canvas to put your artwork on.  It is also the paintbrush.
 * 
 * @author Bruce Gustin
 * @version August 1, 2022
 */

public class Fractal extends Canvas
{
    private int xPos,yPos;
    private GreenfootImage canvas;
    private int deep;
    private int frames;
    private final int DENSITY = 6;
    private final int MAX_LAYERS = 10;
    private final int SPEED = 40;  //frames before next recursion

    /**
     * Constructor for objects of class MathWorld.
     * 
     */
    public Fractal()
    {    
        canvas = getBackground();
        canvas.setColor(Color.WHITE);
        canvas.fill();
    }
    
    public void act()
    {
        if(frames % SPEED == 0 && deep < MAX_LAYERS)
        {
            fractal(getWidth() / 2, getHeight() / 2, DENSITY, 0);
            deep++;
        }
        frames++;
    }
    
    protected void fractal(int midX, int midY, int depth, int rot)
    {
        // base case
        if (depth == 0) 
        {
            return;
        }
        
        // determine method values
        int size = 64;
        for (int i = 0; i < deep - depth; i++) 
        {
            size /= 2;
        }
        
        int left = midX - size / 2;
        int right = midX + size / 2;
        int down = midY + size / 2;
        int up = midY - size / 2;
        
        // draw image
        canvas.setColor(Color.BLACK);
        canvas.drawLine(left, up, left, down);
        canvas.drawLine(right, up, right, down);
        canvas.drawLine(left, midY, right, midY);
        
        // next recursion level
        depth--;
        
        // recursive calls
        fractal(left, up, depth, rot);
        fractal(left, down, depth, rot);
        fractal(right, up, depth, rot);
        fractal(right, down, depth, rot);
    }
}
