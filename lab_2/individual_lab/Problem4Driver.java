package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem4Driver implements Directions
{
    public static void main(String args[]) {
        Writer3 writer3 = new Writer3(1,1, East,11);
        Eraser3 eraser3 = new Eraser3(1,1,East,0);
        Writer2 writer2 = new Writer2(1,6, West, 11);
        Eraser2 eraser2 = new Eraser2(1,6, West, 0);
        Writer1 writer1 = new Writer1(1,7,East,5);
        Eraser1 eraser1 = new Eraser1(1,7,East,0);
        
        writer3.number3();
        writer3.turnOff();
        
        eraser3.number3();
        eraser3.turnOff();
        
        writer2.number2();
        writer2.turnOff();
        
        eraser2.number2();
        eraser2.turnOff();
        
        writer1.number1();
        writer1.turnOff();
        
        eraser1.number1();
        eraser1.turnOff();
    }
    static {
        World.reset();
        World.readWorld("fig3-8.kwld"); 
        World.setBeeperColor(Color.green);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(3);  
        World.setVisible(true);
    }
}
