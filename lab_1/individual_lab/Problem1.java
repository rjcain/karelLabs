package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void rearrangeBeepers() {
        leftAngle();
        turnRight2();
        grab();
        turnRight();
        rightAngle();
        turnRight();
        place();
    }
   public void turnRight() {
       turnLeft();
       turnLeft();
       turnLeft();
    }
    public void moveThree() {
        move();
        move();
        move();
    }
    public void moveTwo() {
        move();
        move();
    }
    public void putBeeper4() {
        putBeeper();
        putBeeper();
        putBeeper();
        putBeeper();
    }
    public void moveFive() {
        moveThree();
        moveTwo();
    }
    public void turnRight2() {
        turnRight();
        turnRight();
    }
    public void grab() {
        pickBeeper();
        move();
        pickBeeper();
        move();
        move();
        pickBeeper();
        move();
        pickBeeper();
    }
    public void place() {
        putBeeper();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        putBeeper();
    }
    public void rightAngle() {
        moveTwo();
        turnRight();
        moveTwo();
    }
    public void leftAngle() {
        moveTwo();
        turnLeft();
        moveTwo();
    }
}