package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem1 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem1(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setPins(){
<<<<<<< HEAD
        setFirstRow();
        prepSec();
        setSecRow();
        prepThird();
        setThirdRow();
        prepFourth();
        setFourthRow();
=======
       prepFirst();
       setFirst();
       prepSec();
       setSec();
       prepThird();
       setThird();
       prepFourth();
       setFourth();
       move();
>>>>>>> d3ee23cc8970bf51e82122013a914dd216bf3d75
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
<<<<<<< HEAD
    public void setFirstRow() {
        move();
        putBeeper();
    }
    public void prepSec() {
        turnLeft();
=======
    public void prepFirst() {
        move();
        turnRight();
    }
    public void setFirst() {
        putBeeper();
    }
    public void prepThird() {
>>>>>>> d3ee23cc8970bf51e82122013a914dd216bf3d75
        move();
        turnRight();
        move();
        turnRight();
    }
<<<<<<< HEAD
    public void setSecRow() {
=======
    public void setSec() {
>>>>>>> d3ee23cc8970bf51e82122013a914dd216bf3d75
        putBeeper();
        move();
        move();
        putBeeper();
    }
<<<<<<< HEAD
    public void prepThird() {
=======
    public void prepSec() {
>>>>>>> d3ee23cc8970bf51e82122013a914dd216bf3d75
        move();
        turnLeft();
        move();
        turnLeft();
    }
<<<<<<< HEAD
    public void setThirdRow() {
=======
    public void setThird() {
>>>>>>> d3ee23cc8970bf51e82122013a914dd216bf3d75
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
    }
    public void prepFourth() {
        move();
<<<<<<< HEAD
        turnRight();
        move();
        turnRight();
    }
    public void setFourthRow() {
=======
        turnLeft();
        move();
        turnLeft();
    }
    public void setFourth() {
>>>>>>> d3ee23cc8970bf51e82122013a914dd216bf3d75
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
    }
}

    
