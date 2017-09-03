package lab_2.individual_lab;


/**
 * Write a description of class Eraser3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Eraser3 extends Writer3
{
    public Eraser3(int st, int av, Direction dir, int beep) {
        super(st, av, dir, beep);
    }
    public void beep() {
        pickBeeper();
    }
}
