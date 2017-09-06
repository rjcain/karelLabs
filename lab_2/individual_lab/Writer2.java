package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

/**
 * Write a description of class Writer2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Writer2 extends Robot
{
   public Writer2(int st, int av, Direction dir, int beep) {
       super(st, av, dir, beep);
    }
   public void beep() {
        putBeeper();
   }
   public void number2() {
       move();
       beep();
       move();
       beep();
       move();
       beep();
       
       turnLeft();
       turnLeft();
       turnLeft();
       move();
       beep();
       move();
       beep();
       
       turnLeft();
       turnLeft();
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
       move();
       beep();
       move();
       beep();
       
       move();
    }
}

