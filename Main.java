import javax.swing.*;
import java.awt.event.*;
import kareltherobot.*;
//This is the starter code for Karel the Robot AP CSA Thai

public class Main implements Directions {

    public static void turnRight(Robot placeholder) {
      placeholder.turnLeft();
      placeholder.turnLeft();
      placeholder.turnLeft();
    }

  public static void main(String[] args) 
	{
		//My robot's name is karel
    Robot karel = new Robot(3,1,North,20);
    World.setVisible(true);
    World.setSize(10,10);
    World.setDelay(20);

    // N
    karel.move();
    karel.putBeeper();
    karel.move();
    karel.putBeeper();
    karel.move();
    karel.putBeeper();
    karel.move();
    karel.putBeeper();

    karel.turnLeft();
    karel.turnLeft();
    karel.turnLeft();
    karel.move();

    karel.turnLeft();
    karel.turnLeft();
    karel.turnLeft();
    karel.move();
    karel.putBeeper();

    karel.turnLeft();
    karel.move();

    turnRight(karel);
    karel.move();
    karel.putBeeper();

    karel.turnLeft();
    karel.move();

    turnRight(karel);
    karel.move();
    karel.putBeeper();
    karel.turnLeft();
    karel.turnLeft();
    karel.move();
    karel.putBeeper();
    karel.move();
    karel.putBeeper();
    karel.move();
    karel.putBeeper();

    






  }

}