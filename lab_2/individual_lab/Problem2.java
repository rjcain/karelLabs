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
<<<<<<< HEAD
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
=======
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
>>>>>>> d3ee23cc8970bf51e82122013a914dd216bf3d75
        turnRight();
        move();
        turnRight();
        move();
    }
<<<<<<< HEAD
    public void prepSev() {
=======
    public void prepSixth() {
>>>>>>> d3ee23cc8970bf51e82122013a914dd216bf3d75
        turnLeft();
        move();
        turnLeft();
        move();
    }
}

