import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Candy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Candy extends Actor
{
    /**
     * Act - do whatever the Candy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    abstract void cetakbaru();
    abstract void maju();
    
    void dimakan(){
        Counter.add(1);
        
        cetakbaru();
        getWorld().removeObject(this);
    }
    
    public void act() 
    {
        maju();
        if(getY()>=499){
            setLocation(Greenfoot.getRandomNumber(300),0);
        }
        if(isTouching(kodok.class)){
            dimakan();
        }
        if(Counter2.value==0){
           getWorld().removeObject(this);
        }
    }    
}
