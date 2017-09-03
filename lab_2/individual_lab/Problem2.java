package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Problem1
{
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setField(){
        prepFirst();
        setFirst();
        prepSec();
        setSec();
        prepThird();
        setThird();
        prepFourth();
        setFourth();
        prepFifth();
        setThird();
        prepSixth();
        setSec();
        prepFifth();
        setFirst();
        turnLeft();
        move();
    }
    public void prepFifth() {
        turnRight();
        move();
        turnRight();
        move();
    }
    public void prepSixth() {
        turnLeft();
        move();
        turnLeft();
        move();
    }
}
