import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class turtle extends Actor
{
    /**
     * @Alejandro Garcia
     */
    private int velocidad = 2;
    
    public void act()
    {
        // ESTABLECCER LA VELOCIDAD 
        move(velocidad);
        if(isAtEdge()){
            turn(180);
        }
            
        
            
    }
}
