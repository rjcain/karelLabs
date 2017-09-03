package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void shuttleRace() {
        halfwayAroundLowerLoop();
        roundUpperLoop();
        finishLowerLoop();
        turnLeft();
    }
        public void halfwayAroundLowerLoop() {
        turnRight();
        move();
        turnLeft();
        moveTwo();
        turnLeft();
        moveTwo();
    }
        public void roundUpperLoop() {
        turnRight();
        moveTwo();
        turnRight();
        moveTwo();
        turnRight();
        moveTwo();
        turnRight();
        moveTwo();
    }
    public void finishLowerLoop() {
        turnLeft();
        moveTwo();
        turnLeft();
        move();
    }
    public void turnRight() {
       turnLeft();
       turnLeft();
       turnLeft();
    }
    public void moveTwo() {
        move();
        move();
    }
    public void turnRight2() {
        turnRight();
        turnRight();
    }
}