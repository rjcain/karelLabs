package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3Driver implements Directions
{
  public static void main(String args[]) {
      Problem3 karel = new Problem3(7, 2, South, 50);
      Problem3Carl carl = new Problem3Carl(4, 3, East, 50);
      karel.writeHello();
      karel.turnOff();
      
      carl.writeHello();
      carl.turnOff();
    }
  static {
        World.reset();
        World.setSize(10, 21);
        World.readWorld("writeHello.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(3);  
        World.setVisible(true);
    }
}
