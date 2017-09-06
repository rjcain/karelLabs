package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

/**
 * Write a description of class Writer1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Writer1 extends Robot
{
    public Writer1(int st, int av, Direction dir, int beep) {
        super(st, av, dir, beep);
    }
    public void number1() {
        move();
        turnLeft();
        beep();
        move();
        beep();
        move();
        beep();
        move();
        beep();
        move();
        beep();
        move();
    }
    public void beep() {
        putBeeper();
    }
}
