package lab_2.individual_lab;


/**
 * Write a description of class Problem3Carl here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Problem3Carl extends Problem3
{
  public Problem3Carl(int st, int av, Direction dir, int beep)
  {
      super(st, av, dir, beep);
  }
  public void writeHello() {
        line();
        rep1();
        line();
        rep2();
        line();
        rep3();
        line();
        rep4();
        line();
        rep5();
        line();
        rep6();
        line();
        rep7();
        line();
    }
  public void line() {
      putBeeper();
      move();
      putBeeper();
  }
  public void rep1() {
    move(); 
    move();
    move();
    move();
  }
  public void rep2() {
      turnLeft();
      move();
      move();
      turnLeft();
  }
  public void rep3() {
      turnLeft();
      move();
      move();
      move();
      move();
      turnLeft();
  }
  public void rep4() {
      move();
      move();
      move();
  }
  public void rep5() {
      move();
      move();
      move();
  }
  public void rep6() {
      move();
      move();
  }
  public void rep7() {
      turnLeft();
      move();
      move();
      move();
      move();
      turnLeft();
  }
}
