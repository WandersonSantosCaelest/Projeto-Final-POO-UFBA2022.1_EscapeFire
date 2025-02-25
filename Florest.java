import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name)  * @version (a version number or a date)
 */
public class Florest extends World {
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Florest() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1);
        addObject(new Score(), 16, 484);
        addObject(new Parrot(), 151, 196);
        setBackground("images/Fdia.png");
        
        
    }

    public void act() {
        
        if (Greenfoot.getRandomNumber(400) < 1) {
            addObject(new Cloud(), 536, 52);
            addObject(new Fire(), 637, 331);
            addObject(new Vulture(), 570, 15);
            addObject(new Mushroom(), 470, 47);
                       
        }
        if (Greenfoot.getRandomNumber(400) < 2) {

            
            addObject(new Fire(), 606, 445);
            addObject(new Mushroom(), 250, 47);
            addObject(new Vulture(), 552, 91);

        }
        

    }

    public void gameOver() {
        addObject(new GameOver("Game Over!"), getWidth() / 2, getHeight() / 2);
        Greenfoot.playSound("sounds/end.wav");
        Greenfoot.stop();
    }
   
}
