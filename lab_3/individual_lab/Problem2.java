package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void carpetRooms(){
        position();
        carpetRoom();
        position();
        carpetRoom();
        position();
        carpetRoom();
        position();
        carpetRoom();
        position();
        carpetRoom();
        position();
        carpetRoom();
        position();
        carpetRoom();
        position();
        carpetRoom();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }   
    public void position() {
        move();
        turnLeft();
    }
    public void carpetRoom() {
        enterRoom();
        checkWalls();
        exitRoom();
    }
    public void enterRoom() {
        move();
    }
    public void checkWalls() {
        turnRight();
        if(!frontIsClear()) {
            turnLeft();
            if(!frontIsClear()) {
                turnLeft();
                if(!frontIsClear()) {
                    putBeeper();
                }
            }
        }
    }
    public void exitRoom() {
        if(!facingSouth()) {
            turnLeft();
            if(!facingSouth()) {
                turnLeft();
                if(!facingSouth()) {
                    turnLeft();
                }
            }
        }
        move();
        turnLeft();
    }
}
    


