package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;


/**
 * Writes the word "Hello"
 *
 * @jcain
 * @version 2.0.3.3
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void writeHello() {
        line();
        rep1();
        line();
        rep2();
        line();
        rep3();
        line();
        rep4();
        line();
        rep5();
        line();
        rep6();
        line();
        rep7();
        line();
    }
    public void line() {
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        turnLeft();
        turnLeft();
        move();
        move();
        move();
        move();
        move();
        turnLeft();
        turnLeft();
    }
    public void rep1() {
        turnLeft();
        move();
        move();
        move();
        turnRight();
    }
    public void rep2() {
        turnLeft();
        move();
        move();
        turnRight();
    }
    public void rep3() {
        turnLeft();
        move();
        move();
        move();
        move();
        turnRight();
    }
    public void rep4() {
        turnLeft();
        move();
        move();
        move();
        move();
        turnRight();
    }
    public void rep5() {
        turnLeft();
        move();
        move();
        move();
        move();
        turnRight();
    }
    public void rep6() {
        turnLeft();
        move();
        move();
        turnRight();
    }
    public void rep7 () {
    }
}
