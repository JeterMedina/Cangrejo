import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Actor
{
    private Counter vidas;
    private Counter contadorPuntuaje;
    
    public Crab()
    {
        contadorPuntuaje = new Counter("Puntos: ");;
        contadorPuntuaje.setValue(0);
    }
    
    protected void addedToWorld(World world)
    {
        world.addObject(contadorPuntuaje,400,20);
    }
    
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
            contadorPuntuaje.setValue(contadorPuntuaje.getValue() + 100);
            //Greenfoot.playSound("eating.wav");
        }
        if(isTouching(Lobster.class)){
            vidas.setValue(vidas.getValue() - 1);
            setLocation(250,250);
            Label perdiste = new Label("Perdiste una vida",30);
            getWorld().addObject(perdiste,250,250);
            Greenfoot.delay(50);
            getWorld().removeObject(perdiste);
            //getWorld().showText("Perdiste una vida",200,200);
            getWorldOfType(CrabWorld.class).accedeLangosta().setLocation(250,500);
        }
    }    
}
