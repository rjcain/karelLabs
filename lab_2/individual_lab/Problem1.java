package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem1 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem1(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setPins(){
        setFirstRow();
        prepSec();
        setSecRow();
        prepThird();
        setThirdRow();
        prepFourth();
        setFourthRow();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void setFirstRow() {
        move();
        putBeeper();
    }
    public void prepSec() {
        turnLeft();
        move();
        turnRight();
        move();
        turnRight();
    }
    public void setSecRow() {
        putBeeper();
        move();
        move();
        putBeeper();
    }
    public void prepThird() {
        move();
        turnLeft();
        move();
        turnLeft();
    }
    public void setThirdRow() {
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
    }
    public void prepFourth() {
        move();
        turnRight();
        move();
        turnRight();
    }
    public void setFourthRow() {
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
    }
}

    
