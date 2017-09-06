package lab_2.pair_programming;

import kareltherobot.*; 
/**
 * @author :
 * teacher :
 * due date:
 */
public class Planter extends Harvester
{
    
    public Planter(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);

    }
    public void harvest() {
        move();
        harvestTwoRows();
        harvestTwoRows();
        harvestTwoRows();
    }
    public void positionRight() {
    turnLeft();
    turnLeft();
    turnLeft();
    move();
    turnLeft();
    turnLeft();
    turnLeft();
}
    public void harvestTwoRows() {
        harvestOneRow();
        repositionRight();
        harvestOneRow();
        repositionLeft();
    }
    public void beeperAction() {
        putBeeper();
    }
    public void harvestOneRow() {
    beeperAction();
    move();
    beeperAction();
    move();
    beeperAction();
    move();
    beeperAction();
    move();
    beeperAction();
}
public void repositionRight() {
    turnLeft();
    move();
    turnLeft();
}
public void repositionLeft() {
    turnLeft();
    turnLeft();
    turnLeft();
    move();
    turnLeft();
    turnLeft();
    turnLeft();
}
}
