import javax.swing.*;
import java.awt.event.*;
import kareltherobot.*;
//This is the starter code for Karel the Robot AP CSA Thai

public class Main implements Directions {
  public static void main(String[] args) 
	{
		//My robot's name is karel
    Robot karel = new Robot(5,1,East,9);
    World.setVisible(true);
    World.setSize(10,10);
    World.setDelay(100);

		karel.move();
    karel.putBeeper();
    karel.move();
    karel.move();
    karel.turnLeft();

    karel.move();
    karel.putBeeper();
    karel.putBeeper();

  }
    
}