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
    public void turnAround() {
        turnLeft();
        turnLeft();
    }
    public void position() {
        move();
        turnLeft();
    }
    public void carpetRoom() {
        enterRoom();
        analyzeWalls();
    }
    public void enterRoom() {
        move();
    }
    public boolean rightWallClear() {
        turnRight();
        if (frontIsClear()) {
            return true;
        }
        else{
            return false;
        }
    }
    public boolean leftWallClear() {
        turnAround();
        if (frontIsClear()) {
            return true;
        }
        else{
            return false;
        }
    }
    public void analyzeWalls() {
        if(!rightWallClear() && !leftWallClear()) {
                turnRight();
                if(!frontIsClear()) {
                    putBeeper();
                    beeperExit();
                }
                else {
                    move();
                    analyzeWalls();
                }
            }
            else{
                exitRoom();
            }
        }
    public void beeperExit() {
        turnAround();
        while(frontIsClear()) {
            move();
            putBeeper();
        }
        pickBeeper();
        turnLeft();
    }
    public void exitRoom() {
        while(!facingSouth()) {
            turnLeft();
        }
        while(frontIsClear()) {
            move();
        }
        turnLeft();
    }
}

