package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void giveCarlBeeper() {
        //This method should allow karel, who is at (1, 1) to give a beeper to carl (at 1, 4)
        movetoCarl();
        putBeeper();
        returntoPosition();
    }
    
    public void pickAndMoveBeeper() {
        //This method is for carl to pick up the beeper from karel and move it two blocks north
        pickBeeper();
        moveNorth();
        putBeeper();
        carlReturntoPositi0n();
    }
    public void movetoCarl() {
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        move();
        move();
    }
    public void returntoPosition() {
        turnLeft();
        turnLeft();
        move();
        move();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void moveNorth() {
        turnLeft();
        move();
        move();
    }
    public void carlReturntoPositi0n() {
        turnLeft();
        turnLeft();
        move();
        move();
        turnLeft();
    }
}