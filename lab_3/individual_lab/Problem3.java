package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem3(int st, int av, Direction dir, int beep)
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
        
    }
    public void enterRoom() {
        move();
    }
    public void checkWalls() {
        turnRight();
        if(!frontIsClear()) {
            turnLeft();
            turnLeft();
            if(!frontIsClear()) {
                turnRight();
                if(!frontIsClear()) {
                    putBeeper();
                    beeperExit();
                }
                else {
                    move();
                    checkWalls();
                }
            }
            else{
                exitRoom();
            }
        }
        else {
            exitRoom();
        }
    }
    public void beeperExit() {
        turnLeft();
        turnLeft();
        while(frontIsClear()) {
            move();
            putBeeper();
        }
        pickBeeper();
        turnLeft();
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
        while(frontIsClear()) {
            move();
        }
        turnLeft();
    }
}

