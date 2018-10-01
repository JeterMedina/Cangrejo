import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Actor
{
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.move(4);
        if(Greenfoot.isKeyDown("right")){
            turn(3);
        }
        if(Greenfoot.isKeyDown("left")){
            turn(-3);
        }
        if(isTouching(Worm.class)){
            removeTouching(Worm.class);
        }
    }    
}
