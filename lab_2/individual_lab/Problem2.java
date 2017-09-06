package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Problem1
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setField(){
        setFirstRow();
        prepSec();
        setSecRow();
        prepThird();
        setThirdRow();
        prepFourth();
        setFourthRow();
        prepFifth();
        setThirdRow();
        prepSixth();
        setSecRow();
        prepSev();
        putBeeper();
        move();
    }
    public void prepFifth() {
        turnLeft();
        move();
        turnLeft();
        move();
    }
    public void prepSixth() {
        turnRight();
        move();
        turnRight();
        move();
    }
    public void prepSev() {
        turnLeft();
        move();
        turnLeft();
        move();
    }
}

