// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        turtle turtle =  new  turtle();
        addObject(turtle, 99, 190);
        dolphin dolphin =  new  dolphin();
        addObject(dolphin, 424, 273);
        dolphin.setLocation(260, 242);
        dolphin.setLocation(252, 237);
        dolphin.setLocation(228, 243);
        dolphin.setLocation(96, 256);
        turtle.setLocation(98, 127);
        dolphin.setLocation(101, 274);
    }
}
