package lab_2.pair_programming;

import kareltherobot.*; 
/**
 * @author :
 * teacher :
 * due date:
 */
public class Harvester extends Robot
{
    //Constructor method that utilizes the constructor method of the super class (UrRobot)
    public Harvester(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);

    }
    
    public void harvest() {
        //Complete this method, using the methods you create below so that all rows are harvested
        move();
        harvestTwoRows();
        harvestTwoRows();
        harvestTwoRows();
    }
    //your methods go below
    /**
     * Precondition: Robot facing east one block away from a row of beepers
     * Postcondition: Robot facing east, two streets above where it started, one block away from a beeper
     */
  
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
public void beeperAction() {
    pickBeeper();
}
}

