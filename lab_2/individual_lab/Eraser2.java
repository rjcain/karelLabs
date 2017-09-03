package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

/**
 * Write a description of class Eraser2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Eraser2 extends Writer2
{
    public Eraser2(int st, int av, Direction dir, int beep) {
        super(st, av, dir, beep);
    }
    public void beep() {
        pickBeeper();
    }
}
