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
       prepFirst();
       setFirst();
       prepSec();
       setSec();
       prepThird();
       setThird();
       prepFourth();
       setFourth();
       move();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void prepFirst() {
        move();
        turnRight();
    }
    public void setFirst() {
        putBeeper();
    }
    public void prepThird() {
        move();
        turnRight();
        move();
        turnRight();
    }
    public void setSec() {
        putBeeper();
        move();
        move();
        putBeeper();
    }
    public void prepSec() {
        move();
        turnLeft();
        move();
        turnLeft();
    }
    public void setThird() {
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
        turnLeft();
        move();
        turnLeft();
    }
    public void setFourth() {
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
