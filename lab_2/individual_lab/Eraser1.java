package lab_2.individual_lab;


/**
 * Write a description of class Eraser1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Eraser1 extends Writer1
{
    public Eraser1(int st, int av, Direction dir, int beep) {
        super(st, av, dir, beep);
    }
    public void beep() {
        pickBeeper();
    }
}
