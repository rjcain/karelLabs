package lab_1.pair_programming;
import kareltherobot.*; 


/**
 * @author :  J. Cain
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findAllBeepers() {
        turnRight2();
        moveTwo();
        pickBeeper();
        turnRight();
        movepickTurn();
        movepickTurn();
        movepickTurn();
        moveFive();
        putBeeper4();
      
        
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
    public void movepickTurn() {
        moveThree();
        pickBeeper();
        turnLeft();
    }
}

