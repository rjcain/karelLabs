package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Writer3 extends Robot
{
    public Writer3(int st, int av, Direction dir, int beep) {
        super(st, av, dir, beep);
    }
    public void beep() {
        putBeeper();
    }
    public void number3() {
        move();
        beep();
        move();
        beep();
        move();
        beep();
        
        turnLeft();
        move();
        beep();
        move();
        beep();
        
        turnLeft();
        move();
        beep();
        move();
        beep();
        
        turnLeft();
        turnLeft();
        move();
        move();
        
        turnLeft();
        move();
        beep();
        move();
        beep();
        
        turnLeft();
        move();
        beep();
        move();
        beep();
        move();
    }
}
