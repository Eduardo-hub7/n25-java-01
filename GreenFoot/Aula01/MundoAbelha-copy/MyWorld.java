import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Aranha aranha = new Aranha();
        addObject(aranha,29,35);
        Mosca mosca = new Mosca();
        addObject(mosca,152,268);
        Abelha abelha = new Abelha();
        addObject(abelha,29,146);
        mosca.setLocation(31,323);
        Mosca mosca2 = new Mosca();
        addObject(mosca2,213,329);
        Mosca mosca3 = new Mosca();
        addObject(mosca3,214,209);
        mosca3.setLocation(208,203);
        mosca3.setLocation(200,203);
        mosca3.setLocation(272,219);
        mosca3.setLocation(278,207);
        mosca3.setLocation(211,215);
        mosca3.setLocation(212,211);
        Mosca mosca4 = new Mosca();
        addObject(mosca4,89,272);
        mosca.setLocation(27,336);
    }
}
