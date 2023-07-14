import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dolphin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dolphin extends Actor
{
    /**
     * @Alejandro Garcia
     */
    private int velocidad = 5;
    private int rotacion = 45;
    public void act()
    {
        move(velocidad);
        if(isAtEdge()){
            turn(135);
        }        // Add your action code here.
    }
    
    public dolphin(){
        setRotation(rotacion);
    }
}


