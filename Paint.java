import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class represents the paint.  It is currently set to add red points.
 * 
 * @author Bruce Gustin
 * @version August 1, 2022
 */
public class Paint extends Actor
{
    private GreenfootImage pointImage;
    
    public Paint()
    {
        pointImage = new GreenfootImage(2, 2); //Creates a new GreenfootImage canvas with 
                                               //width x height 2 x 2 pixels
        pointImage.drawOval(0,0,2,2);          //Places a 2x2 oval on the canvas centered at (0, 0)
                                               //with respect to the image 
        pointImage.setColor(Color.RED);        //Sets the current color to red.
                                               //note: it doesn't paint the color, just sets it.
                                               //This is like dipping the paintbrush into the color. 
        pointImage.fill();                     //Adds the set color into the oval
        
        setImage(pointImage);                  //Sets pointImage as the Object's image.
    }
}
