import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends greenfoot.World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CrabWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1);
        Tiempo tiempo = new Tiempo();
        this.addObject(tiempo,60,20);
        prepare();
    }
    
    private void prepare()
    {
        Lobster lobster = new Lobster();
        addObject(lobster,266,160);
        Worm worm = new Worm();
        addObject(worm,476,108);
        Worm worm2 = new Worm();
        addObject(worm2,187,69);
        Worm worm3 = new Worm();
        addObject(worm3,488,275);
        Worm worm4 = new Worm();
        addObject(worm4,45,167);
        Worm worm5 = new Worm();
        addObject(worm5,502,511);
        Worm worm6 = new Worm();
        addObject(worm6,38,305);
        Worm worm7 = new Worm();
        addObject(worm7,346,38);
        Worm worm8 = new Worm();
        addObject(worm8,83,48);
        Worm worm9 = new Worm();
        addObject(worm9,36,503);
        Worm worm10 = new Worm();
        addObject(worm10,232,500);
        Crab cangrejo = new Crab();
        addObject(cangrejo,257,361);
        Worm worm11 = new Worm();
        addObject(worm11,385,232);
        Worm worm12 = new Worm();
        addObject(worm12,408,416);
        Worm worm13 = new Worm();
        addObject(worm13,133,391);
        Worm worm14 = new Worm();
        addObject(worm14,158,239);
    }
}
